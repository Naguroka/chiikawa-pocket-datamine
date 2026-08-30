package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class gp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f831a;
    public final java.lang.String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final com.applovin.impl.jp f;
    private final java.lang.String[] g;
    public final java.lang.String h;
    public final java.lang.String i;
    public final com.applovin.impl.gp j;
    private final java.util.HashMap k;
    private final java.util.HashMap l;
    private java.util.List m;

    public long[] b() {
        java.util.TreeSet treeSet = new java.util.TreeSet();
        int i = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        java.util.Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((java.lang.Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    private gp(java.lang.String str, java.lang.String str2, long j, long j2, com.applovin.impl.jp jpVar, java.lang.String[] strArr, java.lang.String str3, java.lang.String str4, com.applovin.impl.gp gpVar) {
        this.f831a = str;
        this.b = str2;
        this.i = str4;
        this.f = jpVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        this.h = (java.lang.String) com.applovin.impl.b1.a((java.lang.Object) str3);
        this.j = gpVar;
        this.k = new java.util.HashMap();
        this.l = new java.util.HashMap();
    }

    public void a(com.applovin.impl.gp gpVar) {
        if (this.m == null) {
            this.m = new java.util.ArrayList();
        }
        this.m.add(gpVar);
    }

    public java.lang.String[] c() {
        return this.g;
    }

    private void a(java.util.Map map, com.applovin.impl.a5.b bVar, int i, int i2, int i3) {
        com.applovin.impl.jp jpVarA = com.applovin.impl.ip.a(this.f, this.g, map);
        android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new android.text.SpannableStringBuilder();
            bVar.a(spannableStringBuilder);
        }
        android.text.SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (jpVarA != null) {
            com.applovin.impl.ip.a(spannableStringBuilder2, i, i2, jpVarA, this.j, map, i3);
            if (androidx.media3.extractor.text.ttml.TtmlNode.TAG_P.equals(this.f831a)) {
                if (jpVarA.j() != Float.MAX_VALUE) {
                    bVar.c((jpVarA.j() * (-90.0f)) / 100.0f);
                }
                if (jpVarA.l() != null) {
                    bVar.b(jpVarA.l());
                }
                if (jpVarA.g() != null) {
                    bVar.a(jpVarA.g());
                }
            }
        }
    }

    private static void a(android.text.SpannableStringBuilder spannableStringBuilder) {
        for (com.applovin.impl.n6 n6Var : (com.applovin.impl.n6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), com.applovin.impl.n6.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(n6Var), spannableStringBuilder.getSpanEnd(n6Var), "");
        }
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i2 = i + 1;
                int i3 = i2;
                while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                    i3++;
                }
                int i4 = i3 - i2;
                if (i4 > 0) {
                    spannableStringBuilder.delete(i, i4 + i);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
            if (spannableStringBuilder.charAt(i5) == '\n') {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == ' ') {
                    spannableStringBuilder.delete(i6, i5 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
            if (spannableStringBuilder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i8) == '\n') {
                    spannableStringBuilder.delete(i7, i8);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    public com.applovin.impl.gp a(int i) {
        java.util.List list = this.m;
        if (list != null) {
            return (com.applovin.impl.gp) list.get(i);
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    public int a() {
        java.util.List list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    private void a(java.util.TreeSet treeSet, boolean z) {
        boolean zEquals = androidx.media3.extractor.text.ttml.TtmlNode.TAG_P.equals(this.f831a);
        boolean zEquals2 = androidx.media3.extractor.text.ttml.TtmlNode.TAG_DIV.equals(this.f831a);
        if (z || zEquals || (zEquals2 && this.i != null)) {
            long j = this.d;
            if (j != androidx.media3.common.C.TIME_UNSET) {
                treeSet.add(java.lang.Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != androidx.media3.common.C.TIME_UNSET) {
                treeSet.add(java.lang.Long.valueOf(j2));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            ((com.applovin.impl.gp) this.m.get(i)).a(treeSet, z || zEquals);
        }
    }

    private static android.text.SpannableStringBuilder a(java.lang.String str, java.util.Map map) {
        if (!map.containsKey(str)) {
            com.applovin.impl.a5.b bVar = new com.applovin.impl.a5.b();
            bVar.a(new android.text.SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (android.text.SpannableStringBuilder) com.applovin.impl.b1.a(((com.applovin.impl.a5.b) map.get(str)).e());
    }

    public boolean a(long j) {
        long j2 = this.d;
        return (j2 == androidx.media3.common.C.TIME_UNSET && this.e == androidx.media3.common.C.TIME_UNSET) || (j2 <= j && this.e == androidx.media3.common.C.TIME_UNSET) || ((j2 == androidx.media3.common.C.TIME_UNSET && j < this.e) || (j2 <= j && j < this.e));
    }

    private void a(long j, java.lang.String str, java.util.List list) {
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (a(j) && androidx.media3.extractor.text.ttml.TtmlNode.TAG_DIV.equals(this.f831a) && this.i != null) {
            list.add(new android.util.Pair(str, this.i));
            return;
        }
        for (int i = 0; i < a(); i++) {
            a(i).a(j, str, list);
        }
    }

    private void a(long j, java.util.Map map, java.util.Map map2, java.lang.String str, java.util.Map map3) {
        int i;
        if (a(j)) {
            java.lang.String str2 = "".equals(this.h) ? str : this.h;
            java.util.Iterator it = this.l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                java.lang.String str3 = (java.lang.String) entry.getKey();
                int iIntValue = this.k.containsKey(str3) ? ((java.lang.Integer) this.k.get(str3)).intValue() : 0;
                int iIntValue2 = ((java.lang.Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    a(map, (com.applovin.impl.a5.b) com.applovin.impl.b1.a((com.applovin.impl.a5.b) map3.get(str3)), iIntValue, iIntValue2, ((com.applovin.impl.hp) com.applovin.impl.b1.a((com.applovin.impl.hp) map2.get(str2))).j);
                }
            }
            for (i = 0; i < a(); i++) {
                a(i).a(j, map, map2, str2, map3);
            }
        }
    }

    private void a(long j, boolean z, java.lang.String str, java.util.Map map) {
        this.k.clear();
        this.l.clear();
        if (androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA.equals(this.f831a)) {
            return;
        }
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (this.c && z) {
            a(str, map).append((java.lang.CharSequence) com.applovin.impl.b1.a((java.lang.Object) this.b));
            return;
        }
        if ("br".equals(this.f831a) && z) {
            a(str, map).append('\n');
            return;
        }
        if (a(j)) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                this.k.put((java.lang.String) entry.getKey(), java.lang.Integer.valueOf(((java.lang.CharSequence) com.applovin.impl.b1.a(((com.applovin.impl.a5.b) entry.getValue()).e())).length()));
            }
            boolean zEquals = androidx.media3.extractor.text.ttml.TtmlNode.TAG_P.equals(this.f831a);
            for (int i = 0; i < a(); i++) {
                a(i).a(j, z || zEquals, str, map);
            }
            if (zEquals) {
                com.applovin.impl.ip.a(a(str, map));
            }
            for (java.util.Map.Entry entry2 : map.entrySet()) {
                this.l.put((java.lang.String) entry2.getKey(), java.lang.Integer.valueOf(((java.lang.CharSequence) com.applovin.impl.b1.a(((com.applovin.impl.a5.b) entry2.getValue()).e())).length()));
            }
        }
    }

    public static com.applovin.impl.gp a(java.lang.String str) {
        return new com.applovin.impl.gp(null, com.applovin.impl.ip.a(str), androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, null, null, "", null, null);
    }

    public static com.applovin.impl.gp a(java.lang.String str, long j, long j2, com.applovin.impl.jp jpVar, java.lang.String[] strArr, java.lang.String str2, java.lang.String str3, com.applovin.impl.gp gpVar) {
        return new com.applovin.impl.gp(str, null, j, j2, jpVar, strArr, str2, str3, gpVar);
    }

    public java.util.List a(long j, java.util.Map map, java.util.Map map2, java.util.Map map3) {
        java.util.List<android.util.Pair> arrayList = new java.util.ArrayList();
        a(j, this.h, arrayList);
        java.util.TreeMap treeMap = new java.util.TreeMap();
        a(j, false, this.h, (java.util.Map) treeMap);
        a(j, map, map2, this.h, treeMap);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (android.util.Pair pair : arrayList) {
            java.lang.String str = (java.lang.String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = android.util.Base64.decode(str, 0);
                android.graphics.Bitmap bitmapDecodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                com.applovin.impl.hp hpVar = (com.applovin.impl.hp) com.applovin.impl.b1.a((com.applovin.impl.hp) map2.get(pair.first));
                arrayList2.add(new com.applovin.impl.a5.b().a(bitmapDecodeByteArray).b(hpVar.b).b(0).a(hpVar.c, 0).a(hpVar.e).d(hpVar.f).a(hpVar.g).c(hpVar.j).a());
            }
        }
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            com.applovin.impl.hp hpVar2 = (com.applovin.impl.hp) com.applovin.impl.b1.a((com.applovin.impl.hp) map2.get(entry.getKey()));
            com.applovin.impl.a5.b bVar = (com.applovin.impl.a5.b) entry.getValue();
            a((android.text.SpannableStringBuilder) com.applovin.impl.b1.a(bVar.e()));
            bVar.a(hpVar2.c, hpVar2.d);
            bVar.a(hpVar2.e);
            bVar.b(hpVar2.b);
            bVar.d(hpVar2.f);
            bVar.b(hpVar2.i, hpVar2.h);
            bVar.c(hpVar2.j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }
}
