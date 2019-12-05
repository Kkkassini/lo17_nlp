// $ANTLR 3.5.1 /voletu/users/zhouxing/LO17/antlr/tal_sql.g 2019-11-21 10:32:22

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ARTICLE=4;
	public static final int BULLETIN=5;
	public static final int CONJ=6;
	public static final int MOT=7;
	public static final int POINT=8;
	public static final int SELECT=9;
	public static final int VAR=10;
	public static final int WS=11;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public tal_sqlLexer() {} 
	public tal_sqlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/voletu/users/zhouxing/LO17/antlr/tal_sql.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:3:8: ( 'vouloir' )
			// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:3:10: 'vouloir'
			{
			match("vouloir"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:6:9: ( 'article' )
			// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:6:11: 'article'
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

	// $ANTLR start "BULLETIN"
	public final void mBULLETIN() throws RecognitionException {
		try {
			int _type = BULLETIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:9:10: ( 'bulletin' )
			// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:9:12: 'bulletin'
			{
			match("bulletin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BULLETIN"

	// $ANTLR start "CONJ"
	public final void mCONJ() throws RecognitionException {
		try {
			int _type = CONJ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:12:6: ( 'et' | 'ou' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='e') ) {
				alt1=1;
			}
			else if ( (LA1_0=='o') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:12:8: 'et'
					{
					match("et"); 

					}
					break;
				case 2 :
					// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:12:15: 'ou'
					{
					match("ou"); 

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
	// $ANTLR end "CONJ"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:15:7: ( '.' )
			// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:15:9: '.'
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

	// $ANTLR start "MOT"
	public final void mMOT() throws RecognitionException {
		try {
			int _type = MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:18:5: ( 'mot' | 'contenir' | 'parler' )
			int alt2=3;
			switch ( input.LA(1) ) {
			case 'm':
				{
				alt2=1;
				}
				break;
			case 'c':
				{
				alt2=2;
				}
				break;
			case 'p':
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:18:7: 'mot'
					{
					match("mot"); 

					}
					break;
				case 2 :
					// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:18:15: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 3 :
					// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:18:28: 'parler'
					{
					match("parler"); 

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
	// $ANTLR end "MOT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:21:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' ) | '\\n' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\t'||LA4_0=='\r'||LA4_0==' '||LA4_0=='d'||LA4_0=='j'||LA4_0=='q') ) {
				alt4=1;
			}
			else if ( (LA4_0=='\n') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:21:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					{
					// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:21:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					int alt3=6;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt3=1;
						}
						break;
					case '\t':
						{
						alt3=2;
						}
						break;
					case '\r':
						{
						alt3=3;
						}
						break;
					case 'j':
						{
						alt3=4;
						}
						break;
					case 'q':
						{
						alt3=5;
						}
						break;
					case 'd':
						{
						alt3=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}
					switch (alt3) {
						case 1 :
							// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:21:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:21:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:21:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:21:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:21:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:21:42: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:21:62: '\\n'
					{
					match('\n'); 
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
	// $ANTLR end "WS"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:24:6: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+ )
			// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:24:8: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:24:30: ( 'a' .. 'z' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:
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
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	@Override
	public void mTokens() throws RecognitionException {
		// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:1:8: ( SELECT | ARTICLE | BULLETIN | CONJ | POINT | MOT | WS | VAR )
		int alt6=8;
		alt6 = dfa6.predict(input);
		switch (alt6) {
			case 1 :
				// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:1:17: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 3 :
				// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:1:25: BULLETIN
				{
				mBULLETIN(); 

				}
				break;
			case 4 :
				// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:1:34: CONJ
				{
				mCONJ(); 

				}
				break;
			case 5 :
				// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:1:39: POINT
				{
				mPOINT(); 

				}
				break;
			case 6 :
				// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:1:45: MOT
				{
				mMOT(); 

				}
				break;
			case 7 :
				// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:1:49: WS
				{
				mWS(); 

				}
				break;
			case 8 :
				// /voletu/users/zhouxing/LO17/antlr/tal_sql.g:1:52: VAR
				{
				mVAR(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS =
		"\17\uffff\3\16\2\35\3\16\1\12\5\16\1\uffff\1\46\2\16\1\12\4\16\1\uffff"+
		"\2\16\1\12\11\16\1\46\1\70\1\71\2\16\2\uffff\1\74\1\46\1\uffff";
	static final String DFA6_eofS =
		"\75\uffff";
	static final String DFA6_minS =
		"\1\11\5\141\1\uffff\3\141\1\uffff\3\141\1\uffff\1\165\1\164\1\154\2\141"+
		"\1\164\1\156\1\162\1\141\1\151\1\156\1\154\1\151\1\154\1\uffff\1\141\1"+
		"\164\1\154\1\141\1\164\1\157\1\143\1\145\1\uffff\2\145\1\141\1\151\1\154"+
		"\1\164\1\156\2\162\1\145\2\151\3\141\1\156\1\162\2\uffff\2\141\1\uffff";
	static final String DFA6_maxS =
		"\6\172\1\uffff\3\172\1\uffff\3\172\1\uffff\1\165\1\164\1\154\2\172\1\164"+
		"\1\156\1\162\1\172\1\151\1\156\1\154\1\151\1\154\1\uffff\1\172\1\164\1"+
		"\154\1\172\1\164\1\157\1\143\1\145\1\uffff\2\145\1\172\1\151\1\154\1\164"+
		"\1\156\2\162\1\145\2\151\3\172\1\156\1\162\2\uffff\2\172\1\uffff";
	static final String DFA6_acceptS =
		"\6\uffff\1\5\3\uffff\1\7\3\uffff\1\10\16\uffff\1\4\10\uffff\1\6\21\uffff"+
		"\1\1\1\2\2\uffff\1\3";
	static final String DFA6_specialS =
		"\75\uffff}>";
	static final String[] DFA6_transitionS = {
			"\2\12\2\uffff\1\12\22\uffff\1\12\15\uffff\1\6\22\uffff\32\16\6\uffff"+
			"\1\2\1\3\1\10\1\15\1\4\4\16\1\13\2\16\1\7\1\16\1\5\1\11\1\14\4\16\1\1"+
			"\4\16",
			"\16\16\1\17\13\16",
			"\21\16\1\20\10\16",
			"\24\16\1\21\5\16",
			"\23\16\1\22\6\16",
			"\24\16\1\23\5\16",
			"",
			"\16\16\1\24\13\16",
			"\16\16\1\25\13\16",
			"\1\26\31\16",
			"",
			"\4\16\1\27\25\16",
			"\24\16\1\30\5\16",
			"\16\16\1\31\13\16",
			"",
			"\1\32",
			"\1\33",
			"\1\34",
			"\32\16",
			"\32\16",
			"\1\36",
			"\1\37",
			"\1\40",
			"\32\16",
			"\1\41",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"",
			"\32\16",
			"\1\47",
			"\1\50",
			"\32\16",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"",
			"\1\55",
			"\1\56",
			"\32\16",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\32\16",
			"\32\16",
			"\32\16",
			"\1\72",
			"\1\73",
			"",
			"",
			"\32\16",
			"\32\16",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | ARTICLE | BULLETIN | CONJ | POINT | MOT | WS | VAR );";
		}
	}

}
