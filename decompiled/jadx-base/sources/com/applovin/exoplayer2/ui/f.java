package com.applovin.exoplayer2.ui;

/* JADX INFO: loaded from: classes3.dex */
abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.regex.Pattern f565a = java.util.regex.Pattern.compile("(&#13;)?&#10;");

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f566a;
        public final java.util.Map b;

        private b(java.lang.String str, java.util.Map map) {
            this.f566a = str;
            this.b = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {
        private static final java.util.Comparator e = new java.util.Comparator() { // from class: com.applovin.exoplayer2.ui.f$c$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return com.applovin.exoplayer2.ui.f.c.a((com.applovin.exoplayer2.ui.f.c) obj, (com.applovin.exoplayer2.ui.f.c) obj2);
            }
        };
        private static final java.util.Comparator f = new java.util.Comparator() { // from class: com.applovin.exoplayer2.ui.f$c$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return com.applovin.exoplayer2.ui.f.c.b((com.applovin.exoplayer2.ui.f.c) obj, (com.applovin.exoplayer2.ui.f.c) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f567a;
        public final int b;
        public final java.lang.String c;
        public final java.lang.String d;

        private c(int i, int i2, java.lang.String str, java.lang.String str2) {
            this.f567a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(com.applovin.exoplayer2.ui.f.c cVar, com.applovin.exoplayer2.ui.f.c cVar2) {
            int iCompare = java.lang.Integer.compare(cVar2.b, cVar.b);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar.c.compareTo(cVar2.c);
            return iCompareTo != 0 ? iCompareTo : cVar.d.compareTo(cVar2.d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int b(com.applovin.exoplayer2.ui.f.c cVar, com.applovin.exoplayer2.ui.f.c cVar2) {
            int iCompare = java.lang.Integer.compare(cVar2.f567a, cVar.f567a);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar2.c.compareTo(cVar.c);
            return iCompareTo != 0 ? iCompareTo : cVar2.d.compareTo(cVar.d);
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.List f568a = new java.util.ArrayList();
        private final java.util.List b = new java.util.ArrayList();
    }

    public static com.applovin.exoplayer2.ui.f.b a(java.lang.CharSequence charSequence, float f) {
        if (charSequence == null) {
            return new com.applovin.exoplayer2.ui.f.b("", com.applovin.impl.fb.h());
        }
        if (!(charSequence instanceof android.text.Spanned)) {
            return new com.applovin.exoplayer2.ui.f.b(a(charSequence), com.applovin.impl.fb.h());
        }
        android.text.Spanned spanned = (android.text.Spanned) charSequence;
        java.util.HashSet hashSet = new java.util.HashSet();
        int i = 0;
        for (android.text.style.BackgroundColorSpan backgroundColorSpan : (android.text.style.BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), android.text.style.BackgroundColorSpan.class)) {
            hashSet.add(java.lang.Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((java.lang.Integer) it.next()).intValue();
            map.put(com.applovin.exoplayer2.ui.c.a("bg_" + iIntValue), com.applovin.impl.xp.a("background-color:%s;", com.applovin.exoplayer2.ui.c.a(iIntValue)));
        }
        android.util.SparseArray sparseArrayA = a(spanned, f);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(spanned.length());
        int i2 = 0;
        while (i < sparseArrayA.size()) {
            int iKeyAt = sparseArrayA.keyAt(i);
            sb.append(a(spanned.subSequence(i2, iKeyAt)));
            com.applovin.exoplayer2.ui.f.d dVar = (com.applovin.exoplayer2.ui.f.d) sparseArrayA.get(iKeyAt);
            java.util.Collections.sort(dVar.b, com.applovin.exoplayer2.ui.f.c.f);
            java.util.Iterator it2 = dVar.b.iterator();
            while (it2.hasNext()) {
                sb.append(((com.applovin.exoplayer2.ui.f.c) it2.next()).d);
            }
            java.util.Collections.sort(dVar.f568a, com.applovin.exoplayer2.ui.f.c.e);
            java.util.Iterator it3 = dVar.f568a.iterator();
            while (it3.hasNext()) {
                sb.append(((com.applovin.exoplayer2.ui.f.c) it3.next()).c);
            }
            i++;
            i2 = iKeyAt;
        }
        sb.append(a(spanned.subSequence(i2, spanned.length())));
        return new com.applovin.exoplayer2.ui.f.b(sb.toString(), map);
    }

    private static java.lang.String a(int i) {
        return i != 2 ? "over right" : "under left";
    }

    private static android.util.SparseArray a(android.text.Spanned spanned, float f) {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        for (java.lang.Object obj : spanned.getSpans(0, spanned.length(), java.lang.Object.class)) {
            java.lang.String strA = a(obj, f);
            java.lang.String strA2 = a(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strA != null) {
                com.applovin.impl.b1.a((java.lang.Object) strA2);
                com.applovin.exoplayer2.ui.f.c cVar = new com.applovin.exoplayer2.ui.f.c(spanStart, spanEnd, strA, strA2);
                a(sparseArray, spanStart).f568a.add(cVar);
                a(sparseArray, spanEnd).b.add(cVar);
            }
        }
        return sparseArray;
    }

    private static java.lang.String a(java.lang.Object obj, float f) {
        float size;
        if (obj instanceof android.text.style.StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof android.text.style.ForegroundColorSpan) {
            return com.applovin.impl.xp.a("<span style='color:%s;'>", com.applovin.exoplayer2.ui.c.a(((android.text.style.ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof android.text.style.BackgroundColorSpan) {
            return com.applovin.impl.xp.a("<span class='bg_%s'>", java.lang.Integer.valueOf(((android.text.style.BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof com.applovin.impl.oa) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof android.text.style.AbsoluteSizeSpan) {
            android.text.style.AbsoluteSizeSpan absoluteSizeSpan = (android.text.style.AbsoluteSizeSpan) obj;
            if (absoluteSizeSpan.getDip()) {
                size = absoluteSizeSpan.getSize();
            } else {
                size = absoluteSizeSpan.getSize() / f;
            }
            return com.applovin.impl.xp.a("<span style='font-size:%.2fpx;'>", java.lang.Float.valueOf(size));
        }
        if (obj instanceof android.text.style.RelativeSizeSpan) {
            return com.applovin.impl.xp.a("<span style='font-size:%.2f%%;'>", java.lang.Float.valueOf(((android.text.style.RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof android.text.style.TypefaceSpan) {
            java.lang.String family = ((android.text.style.TypefaceSpan) obj).getFamily();
            if (family != null) {
                return com.applovin.impl.xp.a("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof android.text.style.StyleSpan) {
            int style = ((android.text.style.StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (obj instanceof com.applovin.impl.zi) {
            int i = ((com.applovin.impl.zi) obj).b;
            if (i == -1) {
                return "<ruby style='ruby-position:unset;'>";
            }
            if (i == 1) {
                return "<ruby style='ruby-position:over;'>";
            }
            if (i != 2) {
                return null;
            }
            return "<ruby style='ruby-position:under;'>";
        }
        if (obj instanceof android.text.style.UnderlineSpan) {
            return "<u>";
        }
        if (!(obj instanceof com.applovin.impl.yn)) {
            return null;
        }
        com.applovin.impl.yn ynVar = (com.applovin.impl.yn) obj;
        return com.applovin.impl.xp.a("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", a(ynVar.f1548a, ynVar.b), a(ynVar.c));
    }

    private static java.lang.String a(java.lang.Object obj) {
        if ((obj instanceof android.text.style.StrikethroughSpan) || (obj instanceof android.text.style.ForegroundColorSpan) || (obj instanceof android.text.style.BackgroundColorSpan) || (obj instanceof com.applovin.impl.oa) || (obj instanceof android.text.style.AbsoluteSizeSpan) || (obj instanceof android.text.style.RelativeSizeSpan) || (obj instanceof com.applovin.impl.yn)) {
            return "</span>";
        }
        if (obj instanceof android.text.style.TypefaceSpan) {
            if (((android.text.style.TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof android.text.style.StyleSpan) {
            int style = ((android.text.style.StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof com.applovin.impl.zi) {
                return "<rt>" + a((java.lang.CharSequence) ((com.applovin.impl.zi) obj).f1573a) + "</rt></ruby>";
            }
            if (obj instanceof android.text.style.UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static java.lang.String a(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (i2 == 1) {
            sb.append("filled ");
        } else if (i2 == 2) {
            sb.append("open ");
        }
        if (i == 0) {
            sb.append("none");
        } else if (i == 1) {
            sb.append(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
        } else if (i == 2) {
            sb.append(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_DOT);
        } else if (i != 3) {
            sb.append("unset");
        } else {
            sb.append(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_SESAME);
        }
        return sb.toString();
    }

    private static com.applovin.exoplayer2.ui.f.d a(android.util.SparseArray sparseArray, int i) {
        com.applovin.exoplayer2.ui.f.d dVar = (com.applovin.exoplayer2.ui.f.d) sparseArray.get(i);
        if (dVar != null) {
            return dVar;
        }
        com.applovin.exoplayer2.ui.f.d dVar2 = new com.applovin.exoplayer2.ui.f.d();
        sparseArray.put(i, dVar2);
        return dVar2;
    }

    private static java.lang.String a(java.lang.CharSequence charSequence) {
        return f565a.matcher(android.text.Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
