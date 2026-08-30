package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
public class FtsOptions {
    public static final java.lang.String TOKENIZER_ICU = "icu";
    public static final java.lang.String TOKENIZER_PORTER = "porter";
    public static final java.lang.String TOKENIZER_SIMPLE = "simple";
    public static final java.lang.String TOKENIZER_UNICODE61 = "unicode61";

    public enum MatchInfo {
        FTS3,
        FTS4
    }

    public enum Order {
        ASC,
        DESC
    }

    private FtsOptions() {
    }
}
