// Generated from ChordLabels.g4 by ANTLR 4.2.2
package com.harmoneye.music.chord.gen;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ChordLabelsParser}.
 */
public interface ChordLabelsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ChordLabelsParser#missing}.
	 * @param ctx the parse tree
	 */
	void enterMissing(@NotNull ChordLabelsParser.MissingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChordLabelsParser#missing}.
	 * @param ctx the parse tree
	 */
	void exitMissing(@NotNull ChordLabelsParser.MissingContext ctx);

	/**
	 * Enter a parse tree produced by {@link ChordLabelsParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(@NotNull ChordLabelsParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChordLabelsParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(@NotNull ChordLabelsParser.ModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ChordLabelsParser#degree}.
	 * @param ctx the parse tree
	 */
	void enterDegree(@NotNull ChordLabelsParser.DegreeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChordLabelsParser#degree}.
	 * @param ctx the parse tree
	 */
	void exitDegree(@NotNull ChordLabelsParser.DegreeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ChordLabelsParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(@NotNull ChordLabelsParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChordLabelsParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(@NotNull ChordLabelsParser.IntervalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ChordLabelsParser#shorthand}.
	 * @param ctx the parse tree
	 */
	void enterShorthand(@NotNull ChordLabelsParser.ShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChordLabelsParser#shorthand}.
	 * @param ctx the parse tree
	 */
	void exitShorthand(@NotNull ChordLabelsParser.ShorthandContext ctx);

	/**
	 * Enter a parse tree produced by {@link ChordLabelsParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(@NotNull ChordLabelsParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChordLabelsParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(@NotNull ChordLabelsParser.ComponentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ChordLabelsParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(@NotNull ChordLabelsParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChordLabelsParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(@NotNull ChordLabelsParser.RootContext ctx);

	/**
	 * Enter a parse tree produced by {@link ChordLabelsParser#bass}.
	 * @param ctx the parse tree
	 */
	void enterBass(@NotNull ChordLabelsParser.BassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChordLabelsParser#bass}.
	 * @param ctx the parse tree
	 */
	void exitBass(@NotNull ChordLabelsParser.BassContext ctx);

	/**
	 * Enter a parse tree produced by {@link ChordLabelsParser#chords}.
	 * @param ctx the parse tree
	 */
	void enterChords(@NotNull ChordLabelsParser.ChordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChordLabelsParser#chords}.
	 * @param ctx the parse tree
	 */
	void exitChords(@NotNull ChordLabelsParser.ChordsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ChordLabelsParser#components}.
	 * @param ctx the parse tree
	 */
	void enterComponents(@NotNull ChordLabelsParser.ComponentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChordLabelsParser#components}.
	 * @param ctx the parse tree
	 */
	void exitComponents(@NotNull ChordLabelsParser.ComponentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ChordLabelsParser#natural}.
	 * @param ctx the parse tree
	 */
	void enterNatural(@NotNull ChordLabelsParser.NaturalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChordLabelsParser#natural}.
	 * @param ctx the parse tree
	 */
	void exitNatural(@NotNull ChordLabelsParser.NaturalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ChordLabelsParser#chord}.
	 * @param ctx the parse tree
	 */
	void enterChord(@NotNull ChordLabelsParser.ChordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChordLabelsParser#chord}.
	 * @param ctx the parse tree
	 */
	void exitChord(@NotNull ChordLabelsParser.ChordContext ctx);
}