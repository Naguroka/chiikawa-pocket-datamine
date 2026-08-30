package androidx.core.widget;

/* JADX INFO: compiled from: TextView.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0083\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022d\b\u0006\u0010\u0003\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00042d\b\u0006\u0010\u000e\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\r0\u00042%\b\u0006\u0010\u0010\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\r0\u0011H\u0086\bø\u0001\u0000\u001a7\u0010\u0013\u001a\u00020\u0001*\u00020\u00022%\b\u0004\u0010\u0014\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\r0\u0011H\u0086\bø\u0001\u0000\u001av\u0010\u0015\u001a\u00020\u0001*\u00020\u00022d\b\u0004\u0010\u0014\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0004H\u0086\bø\u0001\u0000\u001av\u0010\u0016\u001a\u00020\u0001*\u00020\u00022d\b\u0004\u0010\u0014\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\r0\u0004H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"addTextChangedListener", "Landroid/text/TextWatcher;", "Landroid/widget/TextView;", "beforeTextChanged", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "text", "", androidx.media3.extractor.text.ttml.TtmlNode.START, "count", androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_AFTER, "", "onTextChanged", androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_BEFORE, "afterTextChanged", "Lkotlin/Function1;", "Landroid/text/Editable;", "doAfterTextChanged", "action", "doBeforeTextChanged", "doOnTextChanged", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class TextViewKt {
    public static /* synthetic */ android.text.TextWatcher addTextChangedListener$default(android.widget.TextView textView, kotlin.jvm.functions.Function4 beforeTextChanged, kotlin.jvm.functions.Function4 onTextChanged, kotlin.jvm.functions.Function1 afterTextChanged, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            beforeTextChanged = new kotlin.jvm.functions.Function4<java.lang.CharSequence, java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.core.widget.TextViewKt.addTextChangedListener.1
                public final void invoke(java.lang.CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.CharSequence charSequence, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
                    invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        if ((i & 2) != 0) {
            onTextChanged = new kotlin.jvm.functions.Function4<java.lang.CharSequence, java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.core.widget.TextViewKt.addTextChangedListener.2
                public final void invoke(java.lang.CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.CharSequence charSequence, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
                    invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        if ((i & 4) != 0) {
            afterTextChanged = new kotlin.jvm.functions.Function1<android.text.Editable, kotlin.Unit>() { // from class: androidx.core.widget.TextViewKt.addTextChangedListener.3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(android.text.Editable editable) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.text.Editable editable) {
                    invoke2(editable);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(beforeTextChanged, "beforeTextChanged");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onTextChanged, "onTextChanged");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(afterTextChanged, "afterTextChanged");
        androidx.core.widget.TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new androidx.core.widget.TextViewKt$addTextChangedListener$textWatcher$1(afterTextChanged, beforeTextChanged, onTextChanged);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static final android.text.TextWatcher addTextChangedListener(android.widget.TextView textView, kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> beforeTextChanged, kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> onTextChanged, kotlin.jvm.functions.Function1<? super android.text.Editable, kotlin.Unit> afterTextChanged) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(beforeTextChanged, "beforeTextChanged");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onTextChanged, "onTextChanged");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(afterTextChanged, "afterTextChanged");
        androidx.core.widget.TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new androidx.core.widget.TextViewKt$addTextChangedListener$textWatcher$1(afterTextChanged, beforeTextChanged, onTextChanged);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static final android.text.TextWatcher doBeforeTextChanged(android.widget.TextView textView, final kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        android.text.TextWatcher textWatcher = new android.text.TextWatcher() { // from class: androidx.core.widget.TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable s) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence text, int start, int count, int after) {
                action.invoke(text, java.lang.Integer.valueOf(start), java.lang.Integer.valueOf(count), java.lang.Integer.valueOf(after));
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final android.text.TextWatcher doOnTextChanged(android.widget.TextView textView, final kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        android.text.TextWatcher textWatcher = new android.text.TextWatcher() { // from class: androidx.core.widget.TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable s) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence text, int start, int before, int count) {
                action.invoke(text, java.lang.Integer.valueOf(start), java.lang.Integer.valueOf(before), java.lang.Integer.valueOf(count));
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    public static final android.text.TextWatcher doAfterTextChanged(android.widget.TextView textView, final kotlin.jvm.functions.Function1<? super android.text.Editable, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        android.text.TextWatcher textWatcher = new android.text.TextWatcher() { // from class: androidx.core.widget.TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable s) {
                action.invoke(s);
            }
        };
        textView.addTextChangedListener(textWatcher);
        return textWatcher;
    }
}
