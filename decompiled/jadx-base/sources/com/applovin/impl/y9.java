package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class y9 {
    private static final java.util.regex.Pattern c = java.util.regex.Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1535a = -1;
    public int b = -1;

    public boolean a() {
        return (this.f1535a == -1 || this.b == -1) ? false : true;
    }

    public boolean a(com.applovin.impl.af afVar) {
        for (int i = 0; i < afVar.c(); i++) {
            com.applovin.impl.af.b bVarA = afVar.a(i);
            if (bVarA instanceof com.applovin.impl.u3) {
                com.applovin.impl.u3 u3Var = (com.applovin.impl.u3) bVarA;
                if ("iTunSMPB".equals(u3Var.c) && a(u3Var.d)) {
                    return true;
                }
            } else if (bVarA instanceof com.applovin.impl.rb) {
                com.applovin.impl.rb rbVar = (com.applovin.impl.rb) bVarA;
                if ("com.apple.iTunes".equals(rbVar.b) && "iTunSMPB".equals(rbVar.c) && a(rbVar.d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean a(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 <= 0 && i3 <= 0) {
            return false;
        }
        this.f1535a = i2;
        this.b = i3;
        return true;
    }

    private boolean a(java.lang.String str) {
        java.util.regex.Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i = java.lang.Integer.parseInt((java.lang.String) com.applovin.impl.xp.a((java.lang.Object) matcher.group(1)), 16);
            int i2 = java.lang.Integer.parseInt((java.lang.String) com.applovin.impl.xp.a((java.lang.Object) matcher.group(2)), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.f1535a = i;
            this.b = i2;
            return true;
        } catch (java.lang.NumberFormatException unused) {
            return false;
        }
    }
}
