chord-labels
============

MIREX-style chord labels parser based on ANTLR.

It allows to parse symbolic chord labels defined in [1] into POJO (plain old Java objects). More specifically into [pitch class sets](http://en.wikipedia.org/wiki/Set_theory_(music)).

Examples:

- `C` into `[0, 4, 7]`.
- `C:(b3,5,b7)` into `[0, 3, 7, 10]`.
- `D:min` into `[2, 5, 9]`.
- `Eb:min7(9)/5` into `[3, 5, 6, 10, 1]`.

## Syntax

- The root tone is written as the natural tone name (A, B, C, D, E, D, G) with optional suffix modifiers (flat - `b`, sharp - `#`).
	- Eg. `C`, `Eb`, `G#`, `Cbb#b`
- After the separator (:) there are other components of the chord written as numeric diatonic intervals relative to the root (with optional one or more prefix modifiers). Eg. (2, b3, 3, 4, b5, 5, #5, 6, bb7, b7, 7). The intervals can span into the second octave (eg. b9, 9, #9, 11, 13). The components are in parentheses and separated by a comma. The root tone already defined the tonic (the 1 component).
	- Eg. `C:(3,5)`, `D:(b3,b5,b7)`, `G:(3,5,b7,9,11,13)`
- For some common chords there are "shorthands" - pre-defined sets of components identified by name. A shorthand is optional and can be combined with explicit components. Generally either a shorthand or a list of components must be present after the separator.
	- Eg. `C:min` = `C:(b3,5)`, `C:maj7` = `C:(4,5,7)`
	- Pre-defined shorthands:
		- maj = (3,5)
		- min = (b3,5)
		- dim = (b3,b5)
		- aug = (3,#5)
		- maj7 = (3,5,7)
		- min7 = (b3,5,b7)
		- 7 = (3,5,b7)
		- dim7 = (b3,b5,bb7)
		- hdim7 = (b3,b5,b7)
		- minmaj7 = (b3,5,7)
		- maj6 = (3,5,6)
		- min6 = (b3,5,6)
		- 9 = (3,5,b7,9)
		- maj9 = (3,5,7,9)
		- min9 = (b3,5,b7,9)
		- sus4 = (4,5)
- In order to exclude some tone from the shorthand, we can prefix it with an asterisk (*).
	- Eg. `C:7(*5)` = `C:(3,b7)`
- The syntax allows to specify some concrete inversion of the chord, ie. some ordering of the pitch class set. In particular, there can be some explicit bass tone. Similarly to common notation it marked is optionally at the end as an relative interval with modified after a slash.
	- Eg. `C:maj/3` - bass tone is the third
- As a syntax sugar, a lonely root tone symbol (with no components or a shorthand) is considered to denote the major chord.
	- Eg. `C` = `C:maj` = `C:(3,5)`

### Extensions

This parser is extended in several ways:

- It allows to parse also timed chord labels in format:
	- `START_TIME END_TIME CHORD_LABEL`
	- eg. `6.1260 6.9944 G:maj`
- It allows line comments. It ignores all lines starting with hash (#).

## How to build and use?

### Build a JAR

```
$ ./gradlew jar
$ ls build/libs/chord-labels-*.jar
```

### Examples

```
String chordString = "E:7";
ChordLabel chordLabel = new ChordLabels().parseChord(chordString);
// ChordLabel [tones=[2, 4, 8, 11], root=4, bass=4, title=E:7]

String chordString = "0.000 2.123 C:min7\n"
 + "2.500 3.456 D:maj\n"
 + "4.0 5.000 E:maj7";
List<TimedChordLabel> chordLabels = new ChordLabels()
	.parseTimedChords(chordString);
// TimedChordLabel [startTime=0.0, endTime=2.123, chord=ChordLabel [tones=[0, 3, 7, 10], root=0, bass=0, title=C:min7]]
// TimedChordLabel [startTime=2.5, endTime=3.456, chord=ChordLabel [tones=[2, 6, 9], root=2, bass=2, title=D:maj]]
// TimedChordLabel [startTime=4.0, endTime=5.0, chord=ChordLabel [tones=[3, 4, 8, 11], root=4, bass=4, title=E:maj7]]
```

### Converting chord labels to binary pitch class sets

This CLI app convert a TSV file timed chord labels by appending columns with
binary pitch class set, root and bass parsed from each label. This might be
useful for further processing of the chord segments, eg. via machine learning.
Compared to the original TSV file the separator is tab (not any whitespace),
there's an added header and added columns for root, bass and each pitch class.
The root and bass are integer pitch classes (based on C), the values for further
columns are just binary indicators represented as 0 or 1. The start and end time
columns are preserved.

For example:

```
$ export INPUT_FILE=src/test/resources/01-A_Hard_Day_s_Night.lab
$ grep -v '^#' $INPUT_FILE |head -n 5
0.0000 2.9632 N
2.9632 6.1260 G:sus4(b7)
6.1260 6.9944 G
6.9944 7.8364 C
7.8364 9.5203 G

# invokes ./gradlew -q run -Pfile=$1

$ sh add_pitch_class_sets.sh $INPUT_FILE |head -n 5
start	end	label	root	bass	C	Db	D	Eb	E	F	Gb	G	Ab	A	Bb	B
0.0	2.9632	N	0	0	0	0	0	0	0	0	0	0	0	0	0	0
2.9632	6.126	G:sus4(b7)	7	7	1	0	1	0	0	1	0	1	0	0	0	0
6.126	6.9944	G	7	7	0	0	1	0	0	0	0	1	0	0	0	1
6.9944	7.8364	C	0	0	1	0	0	0	1	0	0	1	0	0	0	0
```

### API

The API is currently not stable and might change without any notification.

## Author & License

- Bohumir Zamecnik ([@bzamecnik](https://twitter.com/bzamecnik))
- License: MIT (see the [LICENSE](LICENSE) file)

Enjoy and feel free to use and talk about any enhancements/bugs.

## References

- [1] Harte, C. et al. (2005). [Symbolic representation of musical chords:
a proposed syntax for text annotations](http://ismir2005.ismir.net/proceedings/1080.pdf). Proceedings of 6th International
Conference on Music Information Retrieval.
- [2] Harte, C. (2010). [Towards Automatic Extraction of Harmony Information from Music Signals](https://code.soundsoftware.ac.uk/attachments/download/330/chris_harte_phd_thesis.pdf). PhD. thesis
- [3] [Ground-truth chord labels for Beatles album annotated by Chris Harte](http://www.ee.columbia.edu/~dpwe/e4896/practicals.html#prac10)
