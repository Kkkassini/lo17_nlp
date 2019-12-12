package output;// $ANTLR 3.5.1 /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g 2019-11-14 13:41:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_interLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ARTICLE=4;
	public static final int LEMME=5;
	public static final int POINT=6;
	public static final int VOULOIR=7;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public tal_interLexer() {} 
	public tal_interLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_interLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g"; }

	// $ANTLR start "VOULOIR"
	public final void mVOULOIR() throws RecognitionException {
		try {
			int _type = VOULOIR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g:3:9: ( 'vouloir' | 'afficher' | 'rechercher' )
			int alt1=3;
			switch ( input.LA(1) ) {
			case 'v':
				{
				alt1=1;
				}
				break;
			case 'a':
				{
				alt1=2;
				}
				break;
			case 'r':
				{
				alt1=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g:3:11: 'vouloir'
					{
					match("vouloir"); 

					}
					break;
				case 2 :
					// /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g:3:24: 'afficher'
					{
					match("afficher"); 

					}
					break;
				case 3 :
					// /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g:3:35: 'rechercher'
					{
					match("rechercher"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOULOIR"

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g:5:9: ( 'article' )
			// /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g:5:11: 'article'
			{
			match("article"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARTICLE"

	// $ANTLR start "LEMME"
	public final void mLEMME() throws RecognitionException {
		try {
			int _type = LEMME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g:7:7: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+ )
			// /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g:7:9: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g:7:31: ( 'a' .. 'z' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEMME"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g:9:6: ( '.' )
			// /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g:9:8: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINT"

	@Override
	public void mTokens() throws RecognitionException {
		// /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g:1:8: ( VOULOIR | ARTICLE | LEMME | POINT )
		int alt3=4;
		switch ( input.LA(1) ) {
		case 'v':
			{
			int LA3_1 = input.LA(2);
			if ( (LA3_1=='o') ) {
				int LA3_6 = input.LA(3);
				if ( (LA3_6=='u') ) {
					int LA3_10 = input.LA(4);
					if ( (LA3_10=='l') ) {
						int LA3_14 = input.LA(5);
						if ( (LA3_14=='o') ) {
							int LA3_18 = input.LA(6);
							if ( (LA3_18=='i') ) {
								int LA3_22 = input.LA(7);
								if ( (LA3_22=='r') ) {
									int LA3_26 = input.LA(8);
									if ( ((LA3_26 >= 'a' && LA3_26 <= 'z')) ) {
										alt3=3;
									}

									else {
										alt3=1;
									}

								}

								else {
									alt3=3;
								}

							}

							else {
								alt3=3;
							}

						}

						else {
							alt3=3;
						}

					}

					else {
						alt3=3;
					}

				}

				else {
					alt3=3;
				}

			}
			else if ( ((LA3_1 >= 'a' && LA3_1 <= 'n')||(LA3_1 >= 'p' && LA3_1 <= 'z')) ) {
				alt3=3;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 3, 1, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case 'a':
			{
			switch ( input.LA(2) ) {
			case 'f':
				{
				int LA3_7 = input.LA(3);
				if ( (LA3_7=='f') ) {
					int LA3_11 = input.LA(4);
					if ( (LA3_11=='i') ) {
						int LA3_15 = input.LA(5);
						if ( (LA3_15=='c') ) {
							int LA3_19 = input.LA(6);
							if ( (LA3_19=='h') ) {
								int LA3_23 = input.LA(7);
								if ( (LA3_23=='e') ) {
									int LA3_27 = input.LA(8);
									if ( (LA3_27=='r') ) {
										int LA3_31 = input.LA(9);
										if ( ((LA3_31 >= 'a' && LA3_31 <= 'z')) ) {
											alt3=3;
										}

										else {
											alt3=1;
										}

									}

									else {
										alt3=3;
									}

								}

								else {
									alt3=3;
								}

							}

							else {
								alt3=3;
							}

						}

						else {
							alt3=3;
						}

					}

					else {
						alt3=3;
					}

				}

				else {
					alt3=3;
				}

				}
				break;
			case 'r':
				{
				int LA3_8 = input.LA(3);
				if ( (LA3_8=='t') ) {
					int LA3_12 = input.LA(4);
					if ( (LA3_12=='i') ) {
						int LA3_16 = input.LA(5);
						if ( (LA3_16=='c') ) {
							int LA3_20 = input.LA(6);
							if ( (LA3_20=='l') ) {
								int LA3_24 = input.LA(7);
								if ( (LA3_24=='e') ) {
									int LA3_28 = input.LA(8);
									if ( ((LA3_28 >= 'a' && LA3_28 <= 'z')) ) {
										alt3=3;
									}

									else {
										alt3=2;
									}

								}

								else {
									alt3=3;
								}

							}

							else {
								alt3=3;
							}

						}

						else {
							alt3=3;
						}

					}

					else {
						alt3=3;
					}

				}

				else {
					alt3=3;
				}

				}
				break;
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
			case 'g':
			case 'h':
			case 'i':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'o':
			case 'p':
			case 'q':
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				{
				alt3=3;
				}
				break;
			default:
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 3, 2, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}
			}
			break;
		case 'r':
			{
			int LA3_3 = input.LA(2);
			if ( (LA3_3=='e') ) {
				int LA3_9 = input.LA(3);
				if ( (LA3_9=='c') ) {
					int LA3_13 = input.LA(4);
					if ( (LA3_13=='h') ) {
						int LA3_17 = input.LA(5);
						if ( (LA3_17=='e') ) {
							int LA3_21 = input.LA(6);
							if ( (LA3_21=='r') ) {
								int LA3_25 = input.LA(7);
								if ( (LA3_25=='c') ) {
									int LA3_29 = input.LA(8);
									if ( (LA3_29=='h') ) {
										int LA3_33 = input.LA(9);
										if ( (LA3_33=='e') ) {
											int LA3_34 = input.LA(10);
											if ( (LA3_34=='r') ) {
												int LA3_35 = input.LA(11);
												if ( ((LA3_35 >= 'a' && LA3_35 <= 'z')) ) {
													alt3=3;
												}

												else {
													alt3=1;
												}

											}

											else {
												alt3=3;
											}

										}

										else {
											alt3=3;
										}

									}

									else {
										alt3=3;
									}

								}

								else {
									alt3=3;
								}

							}

							else {
								alt3=3;
							}

						}

						else {
							alt3=3;
						}

					}

					else {
						alt3=3;
					}

				}

				else {
					alt3=3;
				}

			}
			else if ( ((LA3_3 >= 'a' && LA3_3 <= 'd')||(LA3_3 >= 'f' && LA3_3 <= 'z')) ) {
				alt3=3;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 3, 3, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 's':
		case 't':
		case 'u':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt3=3;
			}
			break;
		case '.':
			{
			alt3=4;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 3, 0, input);
			throw nvae;
		}
		switch (alt3) {
			case 1 :
				// /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g:1:10: VOULOIR
				{
				mVOULOIR(); 

				}
				break;
			case 2 :
				// /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g:1:18: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 3 :
				// /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g:1:26: LEMME
				{
				mLEMME(); 

				}
				break;
			case 4 :
				// /voletu/users/wangyuhu/LO17/TP6/TP6_intermediaire/src/tal_inter.g:1:32: POINT
				{
				mPOINT(); 

				}
				break;

		}
	}



}
