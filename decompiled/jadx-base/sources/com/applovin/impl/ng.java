package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class ng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.view.View f1096a;
    private final com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose b;
    private final java.lang.String c;

    public ng(android.view.View view, com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose, java.lang.String str) {
        this.f1096a = view;
        this.b = friendlyObstructionPurpose;
        this.c = str;
    }

    public android.view.View c() {
        return this.f1096a;
    }

    public com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose b() {
        return this.b;
    }

    public java.lang.String a() {
        return this.c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.applovin.impl.ng ngVar = (com.applovin.impl.ng) obj;
        android.view.View view = this.f1096a;
        if (view == null ? ngVar.f1096a != null : !view.equals(ngVar.f1096a)) {
            return false;
        }
        if (this.b != ngVar.b) {
            return false;
        }
        java.lang.String str = this.c;
        java.lang.String str2 = ngVar.c;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public int hashCode() {
        android.view.View view = this.f1096a;
        int iHashCode = (view != null ? view.hashCode() : 0) * 31;
        com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose = this.b;
        int iHashCode2 = (iHashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        java.lang.String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
