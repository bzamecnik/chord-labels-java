/**
 * Grammar for chord labels
 * 
 * 6. Harte, C. et al. (2005).
 * Symbolic representation of musical chords: a proposed syntax for text
 * annotations. Proceedings of 6th International Conference on Music
 * Information Retrieval.
 * 
 * Syntax of Chord Notation in Backus-Naur Form:
 * 
 * <chord> ::=   <root> ":" <shorthand> ["("<degree-list>")"]["/"<degree>]
 *             | <root> ":" "("<degree-list>")" ["/"<degree>]
 *             | <root> ["/"<degree>] | "N"
 * <root>         ::= <natural> | <root> <modifier>
 * <natural>      ::= A|B|C|D|E|F|G
 * <modifier>     ::= b|#
 * <degree-list>  ::=  ["*"] <degree> ["," <degree-list>]
 * <degree>       ::= <interval> | <modifier> <degree>
 * <interval>     ::= 1|2|3|4|5|6|7|8|9|10|11|12|13
 * <shorthand>    ::= maj|min|dim|aug|maj7|min7|7|dim7|hdim7
 *                    |minmaj7|maj6|min6|9|maj9|min9|sus4
 */

grammar ChordLabels;
timedChords: timedChord*;
timedChord: startTime WS_SEP endTime WS_SEP chord;

startTime: TIME;
endTime: TIME;

chords: chord+;

chord: root (SEPARATOR (components | shorthand components?))? bass?	| NO_CHORD;
root: natural modifier*;
natural: NATURAL;
modifier: MODIFIER;
shorthand: SHORTHAND | INTERVAL;
components: '(' component (',' component)* ')';
component: missing? degree;
missing: MISSING;
degree: modifier* interval;
interval: INTERVAL;
bass: ('/' degree);

NATURAL: ('A'..'G');
MODIFIER: FLAT | SHARP;
FLAT: 'b';
SHARP: '#';
INTERVAL: [1-9] | '1' [0-3];
// plain numeric shorthands are already matched to INTERVALs and cannot be reused
SHORTHAND: 'maj' | 'min' | 'dim' | 'aug' | 'maj7' | 'min7' | 'dim7'
	| 'hdim7' | 'minmaj7' | 'maj6' | 'min6' | 'maj9' | 'min9' | 'sus4';
MISSING: '*';
NO_CHORD: 'N';
SEPARATOR: ':';

TIME: [0-9]+ ('.' [0-9]+)?;
WS_SEP: [ \t];

COMMENT: {getCharPositionInLine()==1}? '#' ~[\r\n]* -> skip;
WS: [\n\r]+ -> skip;
