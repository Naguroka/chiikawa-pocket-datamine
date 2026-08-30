package androidx.media3.ui;

/* JADX INFO: loaded from: classes3.dex */
final class SpannedToHtmlConverter {
    private static final java.util.regex.Pattern NEWLINE_PATTERN = java.util.regex.Pattern.compile("(&#13;)?&#10;");

    private static java.lang.String getTextEmphasisPosition(int i) {
        return i != 2 ? "over right" : "under left";
    }

    private SpannedToHtmlConverter() {
    }

    public static androidx.media3.ui.SpannedToHtmlConverter.HtmlAndCss convert(java.lang.CharSequence charSequence, float f) {
        if (charSequence == null) {
            return new androidx.media3.ui.SpannedToHtmlConverter.HtmlAndCss("", com.google.common.collect.ImmutableMap.of());
        }
        if (!(charSequence instanceof android.text.Spanned)) {
            return new androidx.media3.ui.SpannedToHtmlConverter.HtmlAndCss(escapeHtml(charSequence), com.google.common.collect.ImmutableMap.of());
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
            map.put(androidx.media3.ui.HtmlUtils.cssAllClassDescendantsSelector("bg_" + iIntValue), androidx.media3.common.util.Util.formatInvariant("background-color:%s;", androidx.media3.ui.HtmlUtils.toCssRgba(iIntValue)));
        }
        android.util.SparseArray<androidx.media3.ui.SpannedToHtmlConverter.Transition> sparseArrayFindSpanTransitions = findSpanTransitions(spanned, f);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(spanned.length());
        int i2 = 0;
        while (i < sparseArrayFindSpanTransitions.size()) {
            int iKeyAt = sparseArrayFindSpanTransitions.keyAt(i);
            sb.append(escapeHtml(spanned.subSequence(i2, iKeyAt)));
            androidx.media3.ui.SpannedToHtmlConverter.Transition transition = sparseArrayFindSpanTransitions.get(iKeyAt);
            java.util.Collections.sort(transition.spansRemoved, androidx.media3.ui.SpannedToHtmlConverter.SpanInfo.FOR_CLOSING_TAGS);
            java.util.Iterator it2 = transition.spansRemoved.iterator();
            while (it2.hasNext()) {
                sb.append(((androidx.media3.ui.SpannedToHtmlConverter.SpanInfo) it2.next()).closingTag);
            }
            java.util.Collections.sort(transition.spansAdded, androidx.media3.ui.SpannedToHtmlConverter.SpanInfo.FOR_OPENING_TAGS);
            java.util.Iterator it3 = transition.spansAdded.iterator();
            while (it3.hasNext()) {
                sb.append(((androidx.media3.ui.SpannedToHtmlConverter.SpanInfo) it3.next()).openingTag);
            }
            i++;
            i2 = iKeyAt;
        }
        sb.append(escapeHtml(spanned.subSequence(i2, spanned.length())));
        return new androidx.media3.ui.SpannedToHtmlConverter.HtmlAndCss(sb.toString(), map);
    }

    private static android.util.SparseArray<androidx.media3.ui.SpannedToHtmlConverter.Transition> findSpanTransitions(android.text.Spanned spanned, float f) {
        android.util.SparseArray<androidx.media3.ui.SpannedToHtmlConverter.Transition> sparseArray = new android.util.SparseArray<>();
        for (java.lang.Object obj : spanned.getSpans(0, spanned.length(), java.lang.Object.class)) {
            java.lang.String openingTag = getOpeningTag(obj, f);
            java.lang.String closingTag = getClosingTag(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (openingTag != null) {
                androidx.media3.common.util.Assertions.checkNotNull(closingTag);
                androidx.media3.ui.SpannedToHtmlConverter.SpanInfo spanInfo = new androidx.media3.ui.SpannedToHtmlConverter.SpanInfo(spanStart, spanEnd, openingTag, closingTag);
                getOrCreate(sparseArray, spanStart).spansAdded.add(spanInfo);
                getOrCreate(sparseArray, spanEnd).spansRemoved.add(spanInfo);
            }
        }
        return sparseArray;
    }

    private static java.lang.String getOpeningTag(java.lang.Object obj, float f) {
        float size;
        if (obj instanceof android.text.style.StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof android.text.style.ForegroundColorSpan) {
            return androidx.media3.common.util.Util.formatInvariant("<span style='color:%s;'>", androidx.media3.ui.HtmlUtils.toCssRgba(((android.text.style.ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof android.text.style.BackgroundColorSpan) {
            return androidx.media3.common.util.Util.formatInvariant("<span class='bg_%s'>", java.lang.Integer.valueOf(((android.text.style.BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof androidx.media3.common.text.HorizontalTextInVerticalContextSpan) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof android.text.style.AbsoluteSizeSpan) {
            android.text.style.AbsoluteSizeSpan absoluteSizeSpan = (android.text.style.AbsoluteSizeSpan) obj;
            if (absoluteSizeSpan.getDip()) {
                size = absoluteSizeSpan.getSize();
            } else {
                size = absoluteSizeSpan.getSize() / f;
            }
            return androidx.media3.common.util.Util.formatInvariant("<span style='font-size:%.2fpx;'>", java.lang.Float.valueOf(size));
        }
        if (obj instanceof android.text.style.RelativeSizeSpan) {
            return androidx.media3.common.util.Util.formatInvariant("<span style='font-size:%.2f%%;'>", java.lang.Float.valueOf(((android.text.style.RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof android.text.style.TypefaceSpan) {
            java.lang.String family = ((android.text.style.TypefaceSpan) obj).getFamily();
            if (family != null) {
                return androidx.media3.common.util.Util.formatInvariant("<span style='font-family:\"%s\";'>", family);
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
        if (obj instanceof androidx.media3.common.text.RubySpan) {
            int i = ((androidx.media3.common.text.RubySpan) obj).position;
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
        if (!(obj instanceof androidx.media3.common.text.TextEmphasisSpan)) {
            return null;
        }
        androidx.media3.common.text.TextEmphasisSpan textEmphasisSpan = (androidx.media3.common.text.TextEmphasisSpan) obj;
        return androidx.media3.common.util.Util.formatInvariant("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", getTextEmphasisStyle(textEmphasisSpan.markShape, textEmphasisSpan.markFill), getTextEmphasisPosition(textEmphasisSpan.position));
    }

    private static java.lang.String getClosingTag(java.lang.Object obj) {
        if ((obj instanceof android.text.style.StrikethroughSpan) || (obj instanceof android.text.style.ForegroundColorSpan) || (obj instanceof android.text.style.BackgroundColorSpan) || (obj instanceof androidx.media3.common.text.HorizontalTextInVerticalContextSpan) || (obj instanceof android.text.style.AbsoluteSizeSpan) || (obj instanceof android.text.style.RelativeSizeSpan) || (obj instanceof androidx.media3.common.text.TextEmphasisSpan)) {
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
            if (obj instanceof androidx.media3.common.text.RubySpan) {
                return "<rt>" + escapeHtml(((androidx.media3.common.text.RubySpan) obj).rubyText) + "</rt></ruby>";
            }
            if (obj instanceof android.text.style.UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static java.lang.String getTextEmphasisStyle(int i, int i2) {
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
        } else if (i == 3) {
            sb.append(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_SESAME);
        } else {
            sb.append("unset");
        }
        return sb.toString();
    }

    private static androidx.media3.ui.SpannedToHtmlConverter.Transition getOrCreate(android.util.SparseArray<androidx.media3.ui.SpannedToHtmlConverter.Transition> sparseArray, int i) {
        androidx.media3.ui.SpannedToHtmlConverter.Transition transition = sparseArray.get(i);
        if (transition != null) {
            return transition;
        }
        androidx.media3.ui.SpannedToHtmlConverter.Transition transition2 = new androidx.media3.ui.SpannedToHtmlConverter.Transition();
        sparseArray.put(i, transition2);
        return transition2;
    }

    private static java.lang.String escapeHtml(java.lang.CharSequence charSequence) {
        return NEWLINE_PATTERN.matcher(android.text.Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    public static class HtmlAndCss {
        public final java.util.Map<java.lang.String, java.lang.String> cssRuleSets;
        public final java.lang.String html;

        private HtmlAndCss(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
            this.html = str;
            this.cssRuleSets = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class SpanInfo {
        public final java.lang.String closingTag;
        public final int end;
        public final java.lang.String openingTag;
        public final int start;
        private static final java.util.Comparator<androidx.media3.ui.SpannedToHtmlConverter.SpanInfo> FOR_OPENING_TAGS = new java.util.Comparator() { // from class: androidx.media3.ui.SpannedToHtmlConverter$SpanInfo$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.media3.ui.SpannedToHtmlConverter.SpanInfo.lambda$static$0((androidx.media3.ui.SpannedToHtmlConverter.SpanInfo) obj, (androidx.media3.ui.SpannedToHtmlConverter.SpanInfo) obj2);
            }
        };
        private static final java.util.Comparator<androidx.media3.ui.SpannedToHtmlConverter.SpanInfo> FOR_CLOSING_TAGS = new java.util.Comparator() { // from class: androidx.media3.ui.SpannedToHtmlConverter$SpanInfo$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.media3.ui.SpannedToHtmlConverter.SpanInfo.lambda$static$1((androidx.media3.ui.SpannedToHtmlConverter.SpanInfo) obj, (androidx.media3.ui.SpannedToHtmlConverter.SpanInfo) obj2);
            }
        };

        static /* synthetic */ int lambda$static$0(androidx.media3.ui.SpannedToHtmlConverter.SpanInfo spanInfo, androidx.media3.ui.SpannedToHtmlConverter.SpanInfo spanInfo2) {
            int iCompare = java.lang.Integer.compare(spanInfo2.end, spanInfo.end);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = spanInfo.openingTag.compareTo(spanInfo2.openingTag);
            return iCompareTo != 0 ? iCompareTo : spanInfo.closingTag.compareTo(spanInfo2.closingTag);
        }

        static /* synthetic */ int lambda$static$1(androidx.media3.ui.SpannedToHtmlConverter.SpanInfo spanInfo, androidx.media3.ui.SpannedToHtmlConverter.SpanInfo spanInfo2) {
            int iCompare = java.lang.Integer.compare(spanInfo2.start, spanInfo.start);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = spanInfo2.openingTag.compareTo(spanInfo.openingTag);
            return iCompareTo != 0 ? iCompareTo : spanInfo2.closingTag.compareTo(spanInfo.closingTag);
        }

        private SpanInfo(int i, int i2, java.lang.String str, java.lang.String str2) {
            this.start = i;
            this.end = i2;
            this.openingTag = str;
            this.closingTag = str2;
        }
    }

    private static final class Transition {
        private final java.util.List<androidx.media3.ui.SpannedToHtmlConverter.SpanInfo> spansAdded = new java.util.ArrayList();
        private final java.util.List<androidx.media3.ui.SpannedToHtmlConverter.SpanInfo> spansRemoved = new java.util.ArrayList();
    }
}
