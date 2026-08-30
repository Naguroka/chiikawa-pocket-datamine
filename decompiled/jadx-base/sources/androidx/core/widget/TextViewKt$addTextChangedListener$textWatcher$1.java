package androidx.core.widget;

/* JADX INFO: compiled from: TextView.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", androidx.media3.extractor.text.ttml.TtmlNode.START, "", "count", androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = org.objectweb.asm.Opcodes.ARETURN)
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements android.text.TextWatcher {
    final /* synthetic */ kotlin.jvm.functions.Function1<android.text.Editable, kotlin.Unit> $afterTextChanged;
    final /* synthetic */ kotlin.jvm.functions.Function4<java.lang.CharSequence, java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.Unit> $beforeTextChanged;
    final /* synthetic */ kotlin.jvm.functions.Function4<java.lang.CharSequence, java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.Unit> $onTextChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public TextViewKt$addTextChangedListener$textWatcher$1(kotlin.jvm.functions.Function1<? super android.text.Editable, kotlin.Unit> function1, kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> function4, kotlin.jvm.functions.Function4<? super java.lang.CharSequence, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> function5) {
        this.$afterTextChanged = function1;
        this.$beforeTextChanged = function4;
        this.$onTextChanged = function5;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s) {
        this.$afterTextChanged.invoke(s);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence text, int start, int count, int after) {
        this.$beforeTextChanged.invoke(text, java.lang.Integer.valueOf(start), java.lang.Integer.valueOf(count), java.lang.Integer.valueOf(after));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence text, int start, int before, int count) {
        this.$onTextChanged.invoke(text, java.lang.Integer.valueOf(start), java.lang.Integer.valueOf(before), java.lang.Integer.valueOf(count));
    }
}
