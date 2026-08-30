package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
final class EmojiProcessor {
    private static final int ACTION_ADVANCE_BOTH = 1;
    private static final int ACTION_ADVANCE_END = 2;
    private static final int ACTION_FLUSH = 3;
    private final int[] mEmojiAsDefaultStyleExceptions;
    private androidx.emoji2.text.EmojiCompat.GlyphChecker mGlyphChecker;
    private final androidx.emoji2.text.MetadataRepo mMetadataRepo;
    private final androidx.emoji2.text.EmojiCompat.SpanFactory mSpanFactory;
    private final boolean mUseEmojiAsDefaultStyle;

    private static boolean hasInvalidSelection(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    EmojiProcessor(androidx.emoji2.text.MetadataRepo metadataRepo, androidx.emoji2.text.EmojiCompat.SpanFactory spanFactory, androidx.emoji2.text.EmojiCompat.GlyphChecker glyphChecker, boolean z, int[] iArr) {
        this.mSpanFactory = spanFactory;
        this.mMetadataRepo = metadataRepo;
        this.mGlyphChecker = glyphChecker;
        this.mUseEmojiAsDefaultStyle = z;
        this.mEmojiAsDefaultStyleExceptions = iArr;
    }

    int getEmojiMatch(java.lang.CharSequence charSequence) {
        return getEmojiMatch(charSequence, this.mMetadataRepo.getMetadataVersion());
    }

    int getEmojiMatch(java.lang.CharSequence charSequence, int i) {
        androidx.emoji2.text.EmojiProcessor.ProcessorSm processorSm = new androidx.emoji2.text.EmojiProcessor.ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
        int length = charSequence.length();
        int iCharCount = 0;
        int i2 = 0;
        int i3 = 0;
        while (iCharCount < length) {
            int iCodePointAt = java.lang.Character.codePointAt(charSequence, iCharCount);
            int iCheck = processorSm.check(iCodePointAt);
            androidx.emoji2.text.EmojiMetadata currentMetadata = processorSm.getCurrentMetadata();
            if (iCheck == 1) {
                iCharCount += java.lang.Character.charCount(iCodePointAt);
                i3 = 0;
            } else if (iCheck == 2) {
                iCharCount += java.lang.Character.charCount(iCodePointAt);
            } else if (iCheck == 3) {
                currentMetadata = processorSm.getFlushMetadata();
                if (currentMetadata.getCompatAdded() <= i) {
                    i2++;
                }
            }
            if (currentMetadata != null && currentMetadata.getCompatAdded() <= i) {
                i3++;
            }
        }
        if (i2 != 0) {
            return 2;
        }
        if (!processorSm.isInFlushableState() || processorSm.getCurrentMetadata().getCompatAdded() > i) {
            return i3 == 0 ? 0 : 2;
        }
        return 1;
    }

    java.lang.CharSequence process(java.lang.CharSequence charSequence, int i, int i2, int i3, boolean z) {
        androidx.emoji2.text.UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable;
        int iCharCount;
        androidx.emoji2.text.EmojiSpan[] emojiSpanArr;
        boolean z2 = charSequence instanceof androidx.emoji2.text.SpannableBuilder;
        if (z2) {
            ((androidx.emoji2.text.SpannableBuilder) charSequence).beginBatchEdit();
        }
        if (!z2) {
            try {
                if (charSequence instanceof android.text.Spannable) {
                    unprecomputeTextOnModificationSpannable = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable((android.text.Spannable) charSequence);
                } else {
                    unprecomputeTextOnModificationSpannable = (!(charSequence instanceof android.text.Spanned) || ((android.text.Spanned) charSequence).nextSpanTransition(i + (-1), i2 + 1, androidx.emoji2.text.EmojiSpan.class) > i2) ? null : new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable(charSequence);
                }
            } finally {
                if (z2) {
                    ((androidx.emoji2.text.SpannableBuilder) charSequence).endBatchEdit();
                }
            }
        } else {
            unprecomputeTextOnModificationSpannable = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable((android.text.Spannable) charSequence);
        }
        if (unprecomputeTextOnModificationSpannable != null && (emojiSpanArr = (androidx.emoji2.text.EmojiSpan[]) unprecomputeTextOnModificationSpannable.getSpans(i, i2, androidx.emoji2.text.EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
            for (androidx.emoji2.text.EmojiSpan emojiSpan : emojiSpanArr) {
                int spanStart = unprecomputeTextOnModificationSpannable.getSpanStart(emojiSpan);
                int spanEnd = unprecomputeTextOnModificationSpannable.getSpanEnd(emojiSpan);
                if (spanStart != i2) {
                    unprecomputeTextOnModificationSpannable.removeSpan(emojiSpan);
                }
                i = java.lang.Math.min(spanStart, i);
                i2 = java.lang.Math.max(spanEnd, i2);
            }
        }
        if (i != i2 && i < charSequence.length()) {
            if (i3 != Integer.MAX_VALUE && unprecomputeTextOnModificationSpannable != null) {
                i3 -= ((androidx.emoji2.text.EmojiSpan[]) unprecomputeTextOnModificationSpannable.getSpans(0, unprecomputeTextOnModificationSpannable.length(), androidx.emoji2.text.EmojiSpan.class)).length;
            }
            androidx.emoji2.text.EmojiProcessor.ProcessorSm processorSm = new androidx.emoji2.text.EmojiProcessor.ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
            int iCodePointAt = java.lang.Character.codePointAt(charSequence, i);
            int i4 = 0;
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable2 = unprecomputeTextOnModificationSpannable;
            loop1: while (true) {
                iCharCount = i;
                while (true) {
                    if (i >= i2 || i4 >= i3) {
                        break loop1;
                    }
                    int iCheck = processorSm.check(iCodePointAt);
                    if (iCheck == 1) {
                        iCharCount += java.lang.Character.charCount(java.lang.Character.codePointAt(charSequence, iCharCount));
                        if (iCharCount < i2) {
                            iCodePointAt = java.lang.Character.codePointAt(charSequence, iCharCount);
                        }
                        i = iCharCount;
                    } else if (iCheck == 2) {
                        i += java.lang.Character.charCount(iCodePointAt);
                        if (i < i2) {
                            iCodePointAt = java.lang.Character.codePointAt(charSequence, i);
                        }
                    } else if (iCheck != 3) {
                    }
                }
                if (z || !hasGlyph(charSequence, iCharCount, i, processorSm.getFlushMetadata())) {
                    if (unprecomputeTextOnModificationSpannable2 == null) {
                        unprecomputeTextOnModificationSpannable2 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable((android.text.Spannable) new android.text.SpannableString(charSequence));
                    }
                    addEmoji(unprecomputeTextOnModificationSpannable2, processorSm.getFlushMetadata(), iCharCount, i);
                    i4++;
                }
            }
            if (processorSm.isInFlushableState() && i4 < i3 && (z || !hasGlyph(charSequence, iCharCount, i, processorSm.getCurrentMetadata()))) {
                if (unprecomputeTextOnModificationSpannable2 == null) {
                    unprecomputeTextOnModificationSpannable2 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable(charSequence);
                }
                addEmoji(unprecomputeTextOnModificationSpannable2, processorSm.getCurrentMetadata(), iCharCount, i);
            }
            return unprecomputeTextOnModificationSpannable2 != null ? unprecomputeTextOnModificationSpannable2.getUnwrappedSpannable() : charSequence;
        }
        return charSequence;
    }

    static boolean handleOnKeyDown(android.text.Editable editable, int i, android.view.KeyEvent keyEvent) {
        boolean zDelete;
        if (i == 67) {
            zDelete = delete(editable, keyEvent, false);
        } else {
            zDelete = i != 112 ? false : delete(editable, keyEvent, true);
        }
        if (!zDelete) {
            return false;
        }
        android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private static boolean delete(android.text.Editable editable, android.view.KeyEvent keyEvent, boolean z) {
        androidx.emoji2.text.EmojiSpan[] emojiSpanArr;
        if (hasModifiers(keyEvent)) {
            return false;
        }
        int selectionStart = android.text.Selection.getSelectionStart(editable);
        int selectionEnd = android.text.Selection.getSelectionEnd(editable);
        if (!hasInvalidSelection(selectionStart, selectionEnd) && (emojiSpanArr = (androidx.emoji2.text.EmojiSpan[]) editable.getSpans(selectionStart, selectionEnd, androidx.emoji2.text.EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
            for (androidx.emoji2.text.EmojiSpan emojiSpan : emojiSpanArr) {
                int spanStart = editable.getSpanStart(emojiSpan);
                int spanEnd = editable.getSpanEnd(emojiSpan);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean handleDeleteSurroundingText(android.view.inputmethod.InputConnection inputConnection, android.text.Editable editable, int i, int i2, boolean z) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = android.text.Selection.getSelectionStart(editable);
            int selectionEnd = android.text.Selection.getSelectionEnd(editable);
            if (hasInvalidSelection(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                iMax = androidx.emoji2.text.EmojiProcessor.CodepointIndexFinder.findIndexBackward(editable, selectionStart, java.lang.Math.max(i, 0));
                iMin = androidx.emoji2.text.EmojiProcessor.CodepointIndexFinder.findIndexForward(editable, selectionEnd, java.lang.Math.max(i2, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = java.lang.Math.max(selectionStart - i, 0);
                iMin = java.lang.Math.min(selectionEnd + i2, editable.length());
            }
            androidx.emoji2.text.EmojiSpan[] emojiSpanArr = (androidx.emoji2.text.EmojiSpan[]) editable.getSpans(iMax, iMin, androidx.emoji2.text.EmojiSpan.class);
            if (emojiSpanArr != null && emojiSpanArr.length > 0) {
                for (androidx.emoji2.text.EmojiSpan emojiSpan : emojiSpanArr) {
                    int spanStart = editable.getSpanStart(emojiSpan);
                    int spanEnd = editable.getSpanEnd(emojiSpan);
                    iMax = java.lang.Math.min(spanStart, iMax);
                    iMin = java.lang.Math.max(spanEnd, iMin);
                }
                int iMax2 = java.lang.Math.max(iMax, 0);
                int iMin2 = java.lang.Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    private static boolean hasModifiers(android.view.KeyEvent keyEvent) {
        return !android.view.KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void addEmoji(android.text.Spannable spannable, androidx.emoji2.text.EmojiMetadata emojiMetadata, int i, int i2) {
        spannable.setSpan(this.mSpanFactory.createSpan(emojiMetadata), i, i2, 33);
    }

    private boolean hasGlyph(java.lang.CharSequence charSequence, int i, int i2, androidx.emoji2.text.EmojiMetadata emojiMetadata) {
        if (emojiMetadata.getHasGlyph() == 0) {
            emojiMetadata.setHasGlyph(this.mGlyphChecker.hasGlyph(charSequence, i, i2, emojiMetadata.getSdkAdded()));
        }
        return emojiMetadata.getHasGlyph() == 2;
    }

    static final class ProcessorSm {
        private static final int STATE_DEFAULT = 1;
        private static final int STATE_WALKING = 2;
        private int mCurrentDepth;
        private androidx.emoji2.text.MetadataRepo.Node mCurrentNode;
        private final int[] mEmojiAsDefaultStyleExceptions;
        private androidx.emoji2.text.MetadataRepo.Node mFlushNode;
        private int mLastCodepoint;
        private final androidx.emoji2.text.MetadataRepo.Node mRootNode;
        private int mState = 1;
        private final boolean mUseEmojiAsDefaultStyle;

        private static boolean isEmojiStyle(int i) {
            return i == 65039;
        }

        private static boolean isTextStyle(int i) {
            return i == 65038;
        }

        ProcessorSm(androidx.emoji2.text.MetadataRepo.Node node, boolean z, int[] iArr) {
            this.mRootNode = node;
            this.mCurrentNode = node;
            this.mUseEmojiAsDefaultStyle = z;
            this.mEmojiAsDefaultStyleExceptions = iArr;
        }

        int check(int i) {
            androidx.emoji2.text.MetadataRepo.Node node = this.mCurrentNode.get(i);
            int iReset = 2;
            if (this.mState != 2) {
                if (node == null) {
                    iReset = reset();
                } else {
                    this.mState = 2;
                    this.mCurrentNode = node;
                    this.mCurrentDepth = 1;
                }
            } else if (node != null) {
                this.mCurrentNode = node;
                this.mCurrentDepth++;
            } else if (isTextStyle(i)) {
                iReset = reset();
            } else if (!isEmojiStyle(i)) {
                if (this.mCurrentNode.getData() != null) {
                    iReset = 3;
                    if (this.mCurrentDepth != 1 || shouldUseEmojiPresentationStyleForSingleCodepoint()) {
                        this.mFlushNode = this.mCurrentNode;
                        reset();
                    } else {
                        iReset = reset();
                    }
                } else {
                    iReset = reset();
                }
            }
            this.mLastCodepoint = i;
            return iReset;
        }

        private int reset() {
            this.mState = 1;
            this.mCurrentNode = this.mRootNode;
            this.mCurrentDepth = 0;
            return 1;
        }

        androidx.emoji2.text.EmojiMetadata getFlushMetadata() {
            return this.mFlushNode.getData();
        }

        androidx.emoji2.text.EmojiMetadata getCurrentMetadata() {
            return this.mCurrentNode.getData();
        }

        boolean isInFlushableState() {
            return this.mState == 2 && this.mCurrentNode.getData() != null && (this.mCurrentDepth > 1 || shouldUseEmojiPresentationStyleForSingleCodepoint());
        }

        private boolean shouldUseEmojiPresentationStyleForSingleCodepoint() {
            if (this.mCurrentNode.getData().isDefaultEmoji() || isEmojiStyle(this.mLastCodepoint)) {
                return true;
            }
            if (this.mUseEmojiAsDefaultStyle) {
                if (this.mEmojiAsDefaultStyleExceptions == null) {
                    return true;
                }
                if (java.util.Arrays.binarySearch(this.mEmojiAsDefaultStyleExceptions, this.mCurrentNode.getData().getCodepointAt(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    private static final class CodepointIndexFinder {
        private static final int INVALID_INDEX = -1;

        private CodepointIndexFinder() {
        }

        static int findIndexBackward(java.lang.CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        return z ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i);
                    if (z) {
                        if (!java.lang.Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!java.lang.Character.isSurrogate(cCharAt)) {
                        i2--;
                    } else {
                        if (java.lang.Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z = true;
                    }
                }
                return i;
            }
        }

        static int findIndexForward(java.lang.CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i);
                    if (z) {
                        if (!java.lang.Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2--;
                        i++;
                    } else if (!java.lang.Character.isSurrogate(cCharAt)) {
                        i2--;
                        i++;
                    } else {
                        if (java.lang.Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i++;
                        z = true;
                    }
                }
                return i;
            }
        }
    }
}
