package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLToken extends androidx.constraintlayout.core.parser.CLElement {
    int index;
    char[] tokenFalse;
    char[] tokenNull;
    char[] tokenTrue;
    androidx.constraintlayout.core.parser.CLToken.Type type;

    enum Type {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public boolean getBoolean() throws androidx.constraintlayout.core.parser.CLParsingException {
        if (this.type == androidx.constraintlayout.core.parser.CLToken.Type.TRUE) {
            return true;
        }
        if (this.type == androidx.constraintlayout.core.parser.CLToken.Type.FALSE) {
            return false;
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException("this token is not a boolean: <" + content() + ">", this);
    }

    public boolean isNull() throws androidx.constraintlayout.core.parser.CLParsingException {
        if (this.type == androidx.constraintlayout.core.parser.CLToken.Type.NULL) {
            return true;
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException("this token is not a null: <" + content() + ">", this);
    }

    public CLToken(char[] cArr) {
        super(cArr);
        this.index = 0;
        this.type = androidx.constraintlayout.core.parser.CLToken.Type.UNKNOWN;
        this.tokenTrue = com.json.mediationsdk.metadata.a.g.toCharArray();
        this.tokenFalse = "false".toCharArray();
        this.tokenNull = "null".toCharArray();
    }

    public static androidx.constraintlayout.core.parser.CLElement allocate(char[] cArr) {
        return new androidx.constraintlayout.core.parser.CLToken(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toJSON() {
        if (androidx.constraintlayout.core.parser.CLParser.DEBUG) {
            return "<" + content() + ">";
        }
        return content();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toFormattedJSON(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        addIndent(sb, i);
        sb.append(content());
        return sb.toString();
    }

    public androidx.constraintlayout.core.parser.CLToken.Type getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.parser.CLToken$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type;

        static {
            int[] iArr = new int[androidx.constraintlayout.core.parser.CLToken.Type.values().length];
            $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type = iArr;
            try {
                iArr[androidx.constraintlayout.core.parser.CLToken.Type.TRUE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type[androidx.constraintlayout.core.parser.CLToken.Type.FALSE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type[androidx.constraintlayout.core.parser.CLToken.Type.NULL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type[androidx.constraintlayout.core.parser.CLToken.Type.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public boolean validate(char c, long j) {
        int i = androidx.constraintlayout.core.parser.CLToken.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$parser$CLToken$Type[this.type.ordinal()];
        boolean z = false;
        if (i == 1) {
            char[] cArr = this.tokenTrue;
            int i2 = this.index;
            z = cArr[i2] == c;
            if (z && i2 + 1 == cArr.length) {
                setEnd(j);
            }
        } else if (i == 2) {
            char[] cArr2 = this.tokenFalse;
            int i3 = this.index;
            z = cArr2[i3] == c;
            if (z && i3 + 1 == cArr2.length) {
                setEnd(j);
            }
        } else if (i == 3) {
            char[] cArr3 = this.tokenNull;
            int i4 = this.index;
            z = cArr3[i4] == c;
            if (z && i4 + 1 == cArr3.length) {
                setEnd(j);
            }
        } else if (i == 4) {
            char[] cArr4 = this.tokenTrue;
            int i5 = this.index;
            if (cArr4[i5] == c) {
                this.type = androidx.constraintlayout.core.parser.CLToken.Type.TRUE;
            } else if (this.tokenFalse[i5] == c) {
                this.type = androidx.constraintlayout.core.parser.CLToken.Type.FALSE;
            } else if (this.tokenNull[i5] == c) {
                this.type = androidx.constraintlayout.core.parser.CLToken.Type.NULL;
            }
            z = true;
        }
        this.index++;
        return z;
    }
}
