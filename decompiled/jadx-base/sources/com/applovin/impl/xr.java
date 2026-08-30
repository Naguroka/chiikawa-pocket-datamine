package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.regex.Pattern f1517a = java.util.regex.Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("(\\S+?):(\\S+)");
    private static final java.util.Map c;
    private static final java.util.Map d;

    static {
        java.util.HashMap map = new java.util.HashMap();
        map.put("white", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 255)));
        map.put("lime", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 0)));
        map.put("cyan", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 255)));
        map.put("red", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 0)));
        map.put("yellow", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 0)));
        map.put("magenta", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 255)));
        map.put("blue", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 255)));
        map.put("black", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 0)));
        c = java.util.Collections.unmodifiableMap(map);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("bg_white", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 255)));
        map2.put("bg_lime", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 255)));
        map2.put("bg_red", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 255)));
        map2.put("bg_blue", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 255)));
        map2.put("bg_black", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 0)));
        d = java.util.Collections.unmodifiableMap(map2);
    }

    static com.applovin.impl.a5.b c(java.lang.String str) {
        com.applovin.impl.xr.e eVar = new com.applovin.impl.xr.e();
        a(str, eVar);
        return eVar.b();
    }

    private static int d(java.lang.String str) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                com.applovin.impl.oc.d("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static int e(java.lang.String str) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                com.applovin.impl.oc.d("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static int g(java.lang.String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        com.applovin.impl.oc.d("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }

    private static int f(java.lang.String str) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                com.applovin.impl.oc.d("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static int b(java.util.List list, java.lang.String str, com.applovin.impl.xr.c cVar) {
        java.util.List listA = a(list, str, cVar);
        for (int i = 0; i < listA.size(); i++) {
            com.applovin.impl.vr vrVar = ((com.applovin.impl.xr.d) listA.get(i)).b;
            if (vrVar.g() != -1) {
                return vrVar.g();
            }
        }
        return -1;
    }

    private static void c(java.lang.String str, com.applovin.impl.xr.e eVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            eVar.i = e(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        eVar.h = com.applovin.impl.zr.a(str);
    }

    private static void a(android.text.SpannableStringBuilder spannableStringBuilder, java.util.Set set, int i, int i2) {
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.util.Map map = c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(((java.lang.Integer) map.get(str)).intValue()), i, i2, 33);
            } else {
                java.util.Map map2 = d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new android.text.style.BackgroundColorSpan(((java.lang.Integer) map2.get(str)).intValue()), i, i2, 33);
                }
            }
        }
    }

    private static final class e {
        public java.lang.CharSequence c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f1521a = 0;
        public long b = 0;
        public int d = 2;
        public float e = -3.4028235E38f;
        public int f = 1;
        public int g = 0;
        public float h = -3.4028235E38f;
        public int i = Integer.MIN_VALUE;
        public float j = 1.0f;
        public int k = Integer.MIN_VALUE;

        private static float a(float f, int i) {
            if (f != -3.4028235E38f && i == 0 && (f < 0.0f || f > 1.0f)) {
                return 1.0f;
            }
            if (f != -3.4028235E38f) {
                return f;
            }
            return i == 0 ? 1.0f : -3.4028235E38f;
        }

        private static float b(int i) {
            if (i != 4) {
                return i != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int c(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 3) {
                return 2;
            }
            if (i != 4) {
                return i != 5 ? 1 : 2;
            }
            return 0;
        }

        public com.applovin.impl.a5.b b() {
            float fB = this.h;
            if (fB == -3.4028235E38f) {
                fB = b(this.d);
            }
            int iC = this.i;
            if (iC == Integer.MIN_VALUE) {
                iC = c(this.d);
            }
            com.applovin.impl.a5.b bVarC = new com.applovin.impl.a5.b().b(a(this.d)).a(a(this.e, this.f), this.f).a(this.g).b(fB).b(iC).d(java.lang.Math.min(this.j, a(iC, fB))).c(this.k);
            java.lang.CharSequence charSequence = this.c;
            if (charSequence != null) {
                bVarC.a(charSequence);
            }
            return bVarC;
        }

        private static android.text.Layout.Alignment a(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                com.applovin.impl.oc.d("WebvttCueParser", "Unknown textAlignment: " + i);
                                return null;
                            }
                        }
                    }
                    return android.text.Layout.Alignment.ALIGN_OPPOSITE;
                }
                return android.text.Layout.Alignment.ALIGN_CENTER;
            }
            return android.text.Layout.Alignment.ALIGN_NORMAL;
        }

        private static float a(int i, float f) {
            if (i == 0) {
                return 1.0f - f;
            }
            if (i == 1) {
                return f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            }
            if (i == 2) {
                return f;
            }
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(i));
        }

        public com.applovin.impl.wr a() {
            return new com.applovin.impl.wr(b().a(), this.f1521a, this.b);
        }
    }

    private static final class d implements java.lang.Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1520a;
        public final com.applovin.impl.vr b;

        public d(int i, com.applovin.impl.vr vrVar) {
            this.f1520a = i;
            this.b = vrVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(com.applovin.impl.xr.d dVar) {
            return java.lang.Integer.compare(this.f1520a, dVar.f1520a);
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f1519a;
        public final int b;
        public final java.lang.String c;
        public final java.util.Set d;

        private c(java.lang.String str, int i, java.lang.String str2, java.util.Set set) {
            this.b = i;
            this.f1519a = str;
            this.c = str2;
            this.d = set;
        }

        public static com.applovin.impl.xr.c a(java.lang.String str, int i) {
            java.lang.String str2;
            java.lang.String strTrim = str.trim();
            com.applovin.impl.b1.a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                java.lang.String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            java.lang.String[] strArrA = com.applovin.impl.xp.a(strTrim, "\\.");
            java.lang.String str3 = strArrA[0];
            java.util.HashSet hashSet = new java.util.HashSet();
            for (int i2 = 1; i2 < strArrA.length; i2++) {
                hashSet.add(strArrA[i2]);
            }
            return new com.applovin.impl.xr.c(str3, i, str2, hashSet);
        }

        public static com.applovin.impl.xr.c a() {
            return new com.applovin.impl.xr.c("", 0, "", java.util.Collections.emptySet());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b {
        private static final java.util.Comparator c = new java.util.Comparator() { // from class: com.applovin.impl.xr$b$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return com.applovin.impl.xr.b.a((com.applovin.impl.xr.b) obj, (com.applovin.impl.xr.b) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.xr.c f1518a;
        private final int b;

        private b(com.applovin.impl.xr.c cVar, int i) {
            this.f1518a = cVar;
            this.b = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(com.applovin.impl.xr.b bVar, com.applovin.impl.xr.b bVar2) {
            return java.lang.Integer.compare(bVar.f1518a.b, bVar2.f1518a.b);
        }
    }

    private static boolean b(java.lang.String str) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    private static void a(java.lang.String str, android.text.SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "gt":
                spannableStringBuilder.append(kotlin.text.Typography.greater);
                break;
            case "lt":
                spannableStringBuilder.append(kotlin.text.Typography.less);
                break;
            case "amp":
                spannableStringBuilder.append(kotlin.text.Typography.amp);
                break;
            case "nbsp":
                spannableStringBuilder.append(' ');
                break;
            default:
                com.applovin.impl.oc.d("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    private static void b(java.lang.String str, com.applovin.impl.xr.e eVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            eVar.g = d(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            eVar.e = com.applovin.impl.zr.a(str);
            eVar.f = 0;
        } else {
            eVar.e = java.lang.Integer.parseInt(str);
            eVar.f = 1;
        }
    }

    private static void a(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.String str, com.applovin.impl.xr.c cVar, java.util.List list, java.util.List list2) {
        int iB = b(list2, str, cVar);
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        arrayList.addAll(list);
        java.util.Collections.sort(arrayList, com.applovin.impl.xr.b.c);
        int i = cVar.b;
        int length = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if ("rt".equals(((com.applovin.impl.xr.b) arrayList.get(i2)).f1518a.f1519a)) {
                com.applovin.impl.xr.b bVar = (com.applovin.impl.xr.b) arrayList.get(i2);
                int iA = a(b(list2, str, bVar.f1518a), iB, 1);
                int i3 = bVar.f1518a.b - length;
                int i4 = bVar.b - length;
                java.lang.CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i3, i4);
                spannableStringBuilder.delete(i3, i4);
                spannableStringBuilder.setSpan(new com.applovin.impl.zi(charSequenceSubSequence.toString(), iA), i, i3, 33);
                length += charSequenceSubSequence.length();
                i = i3;
            }
        }
    }

    private static void a(java.lang.String str, com.applovin.impl.xr.c cVar, java.util.List list, android.text.SpannableStringBuilder spannableStringBuilder, java.util.List list2) {
        int i = cVar.b;
        int length = spannableStringBuilder.length();
        java.lang.String str2 = cVar.f1519a;
        str2.hashCode();
        str2.hashCode();
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i, length, 33);
                break;
            case "c":
                a(spannableStringBuilder, cVar.d, i, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i, length, 33);
                break;
            case "ruby":
                a(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        java.util.List listA = a(list2, str, cVar);
        for (int i2 = 0; i2 < listA.size(); i2++) {
            a(spannableStringBuilder, ((com.applovin.impl.xr.d) listA.get(i2)).b, i, length);
        }
    }

    private static void a(android.text.SpannableStringBuilder spannableStringBuilder, com.applovin.impl.vr vrVar, int i, int i2) {
        if (vrVar == null) {
            return;
        }
        if (vrVar.h() != -1) {
            com.applovin.impl.pk.a(spannableStringBuilder, new android.text.style.StyleSpan(vrVar.h()), i, i2, 33);
        }
        if (vrVar.k()) {
            spannableStringBuilder.setSpan(new android.text.style.StrikethroughSpan(), i, i2, 33);
        }
        if (vrVar.l()) {
            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i, i2, 33);
        }
        if (vrVar.j()) {
            com.applovin.impl.pk.a(spannableStringBuilder, new android.text.style.ForegroundColorSpan(vrVar.c()), i, i2, 33);
        }
        if (vrVar.i()) {
            com.applovin.impl.pk.a(spannableStringBuilder, new android.text.style.BackgroundColorSpan(vrVar.a()), i, i2, 33);
        }
        if (vrVar.d() != null) {
            com.applovin.impl.pk.a(spannableStringBuilder, new android.text.style.TypefaceSpan(vrVar.d()), i, i2, 33);
        }
        int iF = vrVar.f();
        if (iF == 1) {
            com.applovin.impl.pk.a(spannableStringBuilder, new android.text.style.AbsoluteSizeSpan((int) vrVar.e(), true), i, i2, 33);
        } else if (iF == 2) {
            com.applovin.impl.pk.a(spannableStringBuilder, new android.text.style.RelativeSizeSpan(vrVar.e()), i, i2, 33);
        } else if (iF == 3) {
            com.applovin.impl.pk.a(spannableStringBuilder, new android.text.style.RelativeSizeSpan(vrVar.e() / 100.0f), i, i2, 33);
        }
        if (vrVar.b()) {
            spannableStringBuilder.setSpan(new com.applovin.impl.oa(), i, i2, 33);
        }
    }

    private static int a(java.lang.String str, int i) {
        int iIndexOf = str.indexOf(62, i);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    private static int a(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        throw new java.lang.IllegalArgumentException();
    }

    private static java.lang.String a(java.lang.String str) {
        java.lang.String strTrim = str.trim();
        com.applovin.impl.b1.a(!strTrim.isEmpty());
        return com.applovin.impl.xp.b(strTrim, "[ \\.]")[0];
    }

    public static com.applovin.impl.wr a(com.applovin.impl.ah ahVar, java.util.List list) {
        java.lang.String strL = ahVar.l();
        if (strL == null) {
            return null;
        }
        java.util.regex.Pattern pattern = f1517a;
        java.util.regex.Matcher matcher = pattern.matcher(strL);
        if (matcher.matches()) {
            return a((java.lang.String) null, matcher, ahVar, list);
        }
        java.lang.String strL2 = ahVar.l();
        if (strL2 == null) {
            return null;
        }
        java.util.regex.Matcher matcher2 = pattern.matcher(strL2);
        if (matcher2.matches()) {
            return a(strL.trim(), matcher2, ahVar, list);
        }
        return null;
    }

    private static com.applovin.impl.wr a(java.lang.String str, java.util.regex.Matcher matcher, com.applovin.impl.ah ahVar, java.util.List list) {
        com.applovin.impl.xr.e eVar = new com.applovin.impl.xr.e();
        try {
            eVar.f1521a = com.applovin.impl.zr.b((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(1)));
            eVar.b = com.applovin.impl.zr.b((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(2)));
            a((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(3)), eVar);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String strL = ahVar.l();
            while (!android.text.TextUtils.isEmpty(strL)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strL.trim());
                strL = ahVar.l();
            }
            eVar.c = a(str, sb.toString(), list);
            return eVar.a();
        } catch (java.lang.NumberFormatException unused) {
            com.applovin.impl.oc.d("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    static com.applovin.impl.a5 a(java.lang.CharSequence charSequence) {
        com.applovin.impl.xr.e eVar = new com.applovin.impl.xr.e();
        eVar.c = charSequence;
        return eVar.b().a();
    }

    static android.text.SpannedString a(java.lang.String str, java.lang.String str2, java.util.List list) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = java.lang.Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    a(str2.substring(i, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((java.lang.CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int iA = i + 1;
                if (iA < str2.length()) {
                    boolean z = str2.charAt(iA) == '/';
                    iA = a(str2, iA);
                    int i2 = iA - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = iA - 1;
                    }
                    java.lang.String strSubstring = str2.substring(i3, i2);
                    if (!strSubstring.trim().isEmpty()) {
                        java.lang.String strA = a(strSubstring);
                        if (b(strA)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    com.applovin.impl.xr.c cVar = (com.applovin.impl.xr.c) arrayDeque.pop();
                                    a(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (!arrayDeque.isEmpty()) {
                                        arrayList.add(new com.applovin.impl.xr.b(cVar, spannableStringBuilder.length()));
                                    } else {
                                        arrayList.clear();
                                    }
                                    if (cVar.f1519a.equals(strA)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(com.applovin.impl.xr.c.a(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = iA;
            }
        }
        while (!arrayDeque.isEmpty()) {
            a(str, (com.applovin.impl.xr.c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        a(str, com.applovin.impl.xr.c.a(), java.util.Collections.emptyList(), spannableStringBuilder, list);
        return android.text.SpannedString.valueOf(spannableStringBuilder);
    }

    private static void a(java.lang.String str, com.applovin.impl.xr.e eVar) {
        java.util.regex.Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            java.lang.String str2 = (java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(1));
            java.lang.String str3 = (java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    b(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.d = f(str3);
                } else if (com.ironsource.y8.h.L.equals(str2)) {
                    c(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.j = com.applovin.impl.zr.a(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.k = g(str3);
                } else {
                    com.applovin.impl.oc.d("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (java.lang.NumberFormatException unused) {
                com.applovin.impl.oc.d("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    private static java.util.List a(java.util.List list, java.lang.String str, com.applovin.impl.xr.c cVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.applovin.impl.vr vrVar = (com.applovin.impl.vr) list.get(i);
            int iA = vrVar.a(str, cVar.f1519a, cVar.d, cVar.c);
            if (iA > 0) {
                arrayList.add(new com.applovin.impl.xr.d(iA, vrVar));
            }
        }
        java.util.Collections.sort(arrayList);
        return arrayList;
    }
}
