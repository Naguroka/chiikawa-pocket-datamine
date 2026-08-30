package org.jacoco.core;

/* JADX INFO: loaded from: classes6.dex */
public final class JaCoCo {
    public static final java.lang.String COMMITID;
    public static final java.lang.String COMMITID_SHORT;
    public static final java.lang.String HOMEURL;
    public static final java.lang.String RUNTIMEPACKAGE;
    public static final java.lang.String VERSION;

    static {
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org.jacoco.core.jacoco");
        VERSION = bundle.getString("VERSION");
        java.lang.String string = bundle.getString("COMMITID");
        COMMITID = string;
        COMMITID_SHORT = string.substring(0, 7);
        HOMEURL = bundle.getString("HOMEURL");
        RUNTIMEPACKAGE = bundle.getString("RUNTIMEPACKAGE");
    }

    private JaCoCo() {
    }
}
