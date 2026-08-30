package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public class RewardData implements java.io.Serializable {
    private static final long serialVersionUID = -6264212909606201882L;
    private java.lang.String mCurrency;
    private int mQuantity;
    private java.lang.String mUserID;

    public RewardData(java.lang.String str, java.lang.String str2) {
        this(str, str2, 0);
    }

    public RewardData(java.lang.String str, java.lang.String str2, int i) {
        this.mUserID = str;
        this.mCurrency = str2;
        this.mQuantity = i;
    }

    public java.lang.String getUserID() {
        return this.mUserID;
    }

    public java.lang.String getCurrency() {
        return this.mCurrency;
    }

    public int getQuantity() {
        return this.mQuantity;
    }
}
