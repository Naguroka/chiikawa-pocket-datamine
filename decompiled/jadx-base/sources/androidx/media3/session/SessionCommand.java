package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final class SessionCommand {
    public static final int COMMAND_CODE_CUSTOM = 0;
    public static final int COMMAND_CODE_LIBRARY_GET_LIBRARY_ROOT = 50000;
    public final int commandCode;
    public final java.lang.String customAction;
    public final android.os.Bundle customExtras;
    public static final int COMMAND_CODE_SESSION_SET_RATING = 40010;
    static final com.google.common.collect.ImmutableList<java.lang.Integer> SESSION_COMMANDS = com.google.common.collect.ImmutableList.of(java.lang.Integer.valueOf(COMMAND_CODE_SESSION_SET_RATING));
    public static final int COMMAND_CODE_LIBRARY_SUBSCRIBE = 50001;
    public static final int COMMAND_CODE_LIBRARY_UNSUBSCRIBE = 50002;
    public static final int COMMAND_CODE_LIBRARY_GET_CHILDREN = 50003;
    public static final int COMMAND_CODE_LIBRARY_GET_ITEM = 50004;
    public static final int COMMAND_CODE_LIBRARY_SEARCH = 50005;
    public static final int COMMAND_CODE_LIBRARY_GET_SEARCH_RESULT = 50006;
    static final com.google.common.collect.ImmutableList<java.lang.Integer> LIBRARY_COMMANDS = com.google.common.collect.ImmutableList.of((java.lang.Integer) 50000, java.lang.Integer.valueOf(COMMAND_CODE_LIBRARY_SUBSCRIBE), java.lang.Integer.valueOf(COMMAND_CODE_LIBRARY_UNSUBSCRIBE), java.lang.Integer.valueOf(COMMAND_CODE_LIBRARY_GET_CHILDREN), java.lang.Integer.valueOf(COMMAND_CODE_LIBRARY_GET_ITEM), java.lang.Integer.valueOf(COMMAND_CODE_LIBRARY_SEARCH), java.lang.Integer.valueOf(COMMAND_CODE_LIBRARY_GET_SEARCH_RESULT));
    private static final java.lang.String FIELD_COMMAND_CODE = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_CUSTOM_ACTION = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_CUSTOM_EXTRAS = androidx.media3.common.util.Util.intToStringMaxRadix(2);

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface CommandCode {
    }

    public SessionCommand(int i) {
        androidx.media3.common.util.Assertions.checkArgument(i != 0, "commandCode shouldn't be COMMAND_CODE_CUSTOM");
        this.commandCode = i;
        this.customAction = "";
        this.customExtras = android.os.Bundle.EMPTY;
    }

    public SessionCommand(java.lang.String str, android.os.Bundle bundle) {
        this.commandCode = 0;
        this.customAction = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(str);
        this.customExtras = new android.os.Bundle((android.os.Bundle) androidx.media3.common.util.Assertions.checkNotNull(bundle));
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.media3.session.SessionCommand)) {
            return false;
        }
        androidx.media3.session.SessionCommand sessionCommand = (androidx.media3.session.SessionCommand) obj;
        return this.commandCode == sessionCommand.commandCode && android.text.TextUtils.equals(this.customAction, sessionCommand.customAction);
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(this.customAction, java.lang.Integer.valueOf(this.commandCode));
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(FIELD_COMMAND_CODE, this.commandCode);
        bundle.putString(FIELD_CUSTOM_ACTION, this.customAction);
        bundle.putBundle(FIELD_CUSTOM_EXTRAS, this.customExtras);
        return bundle;
    }

    public static androidx.media3.session.SessionCommand fromBundle(android.os.Bundle bundle) {
        int i = bundle.getInt(FIELD_COMMAND_CODE, 0);
        if (i != 0) {
            return new androidx.media3.session.SessionCommand(i);
        }
        java.lang.String str = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(bundle.getString(FIELD_CUSTOM_ACTION));
        android.os.Bundle bundle2 = bundle.getBundle(FIELD_CUSTOM_EXTRAS);
        if (bundle2 == null) {
            bundle2 = android.os.Bundle.EMPTY;
        }
        return new androidx.media3.session.SessionCommand(str, bundle2);
    }
}
