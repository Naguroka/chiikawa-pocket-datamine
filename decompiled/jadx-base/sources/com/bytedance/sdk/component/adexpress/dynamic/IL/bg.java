package com.bytedance.sdk.component.adexpress.dynamic.IL;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    public static int bg(com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar) {
        if (iRVar == null) {
            return 0;
        }
        java.lang.String strLKE = iRVar.LKE();
        java.lang.String strKMt = iRVar.kMt();
        if (android.text.TextUtils.isEmpty(strKMt) || android.text.TextUtils.isEmpty(strLKE) || !strKMt.equals("creative")) {
            return 0;
        }
        if (strLKE.equals("shake")) {
            return 2;
        }
        if (strLKE.equals("twist")) {
            return 3;
        }
        return strLKE.equals("slide") ? 1 : 0;
    }
}
