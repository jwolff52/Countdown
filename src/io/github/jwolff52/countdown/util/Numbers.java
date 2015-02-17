package io.github.jwolff52.countdown.util;

public class Numbers {

	private static final String FULL = " ***** ";
	private static final String ENDS = " *   * ";
	private static final String LEFT = " *     ";
	private static final String RIGHT = "     * ";
	private static final String CENTER = "   *   ";
	private static final String EMPTY = "       ";
	
	public static final String[] COLON = {EMPTY,CENTER,EMPTY,CENTER,EMPTY};
	public static final String[] ZERO = {FULL,ENDS,ENDS,ENDS,FULL};
	public static final String[] ONE = {CENTER,CENTER,CENTER,CENTER,CENTER};
	public static final String[] TWO = {FULL,RIGHT,FULL,LEFT,FULL};
	public static final String[] THREE = {FULL,RIGHT,FULL,RIGHT,FULL};
	public static final String[] FOUR = {ENDS,ENDS,FULL,RIGHT,RIGHT};
	public static final String[] FIVE = {FULL,LEFT,FULL,RIGHT,FULL};
	public static final String[] SIX = {LEFT,LEFT,FULL,ENDS,FULL};
	public static final String[] SEVEN = {FULL,RIGHT,RIGHT,RIGHT,RIGHT};
	public static final String[] EIGHT = {FULL,ENDS,FULL,ENDS,FULL};
	public static final String[] NINE = {FULL,ENDS,FULL,RIGHT,RIGHT};
}
