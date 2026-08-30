package kotlin.text;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010\u0011\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001f\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086\u0002\u001a\u001f\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086\u0002\u001a\u0015\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0087\n\u001a\u0018\u0010\u0017\u001a\u00020\u0010*\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u0018\u0010\u0018\u001a\u00020\u0010*\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001c\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a:\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001aE\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0002\b!\u001a:\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010#\u001a\u00020\u0010*\u00020\u00022\u0006\u0010$\u001a\u00020\u0006\u001a7\u0010%\u001a\u0002H&\"\f\b\u0000\u0010'*\u00020\u0002*\u0002H&\"\u0004\b\u0001\u0010&*\u0002H'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H&0)H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010*\u001a7\u0010+\u001a\u0002H&\"\f\b\u0000\u0010'*\u00020\u0002*\u0002H&\"\u0004\b\u0001\u0010&*\u0002H'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H&0)H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010*\u001a&\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a;\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0002\b.\u001a&\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010/\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u00100\u001a\u00020\u0006*\u00020\u00022\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a,\u00100\u001a\u00020\u0006*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\r\u00103\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a\r\u00104\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a\r\u00105\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a \u00106\u001a\u00020\u0010*\u0004\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a \u00107\u001a\u00020\u0010*\u0004\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u00108\u001a\u000209*\u00020\u0002H\u0086\u0002\u001a&\u0010:\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u0010:\u001a\u00020\u0006*\u00020\u00022\u0006\u0010/\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u0010;\u001a\u00020\u0006*\u00020\u00022\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a,\u0010;\u001a\u00020\u0006*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u0002\u001a\u0010\u0010>\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u0002\u001a\u0015\u0010@\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0087\f\u001a\u000f\u0010A\u001a\u00020\r*\u0004\u0018\u00010\rH\u0087\b\u001a\u001c\u0010B\u001a\u00020\u0002*\u00020\u00022\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001a\u001c\u0010B\u001a\u00020\r*\u00020\r2\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001a\u001c\u0010E\u001a\u00020\u0002*\u00020\u00022\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001a\u001c\u0010E\u001a\u00020\r*\u00020\r2\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001aG\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010=*\u00020\u00022\u000e\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0H2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\bI\u0010J\u001a=\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010=*\u00020\u00022\u0006\u0010G\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0002\bI\u001a4\u0010K\u001a\u00020\u0010*\u00020\u00022\u0006\u0010L\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010M\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\u0012\u0010N\u001a\u00020\u0002*\u00020\u00022\u0006\u0010O\u001a\u00020\u0002\u001a\u0012\u0010N\u001a\u00020\r*\u00020\r2\u0006\u0010O\u001a\u00020\u0002\u001a\u001a\u0010P\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006\u001a\u0012\u0010P\u001a\u00020\u0002*\u00020\u00022\u0006\u0010Q\u001a\u00020\u0001\u001a\u001d\u0010P\u001a\u00020\r*\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010P\u001a\u00020\r*\u00020\r2\u0006\u0010Q\u001a\u00020\u0001H\u0087\b\u001a\u0012\u0010R\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010R\u001a\u00020\r*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010S\u001a\u00020\u0002*\u00020\u00022\u0006\u0010T\u001a\u00020\u0002\u001a\u001a\u0010S\u001a\u00020\u0002*\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010S\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u0002\u001a\u001a\u0010S\u001a\u00020\r*\u00020\r2\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a.\u0010U\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0014\b\b\u0010V\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u00020WH\u0087\bø\u0001\u0000\u001a\u001d\u0010U\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\rH\u0087\b\u001a$\u0010Z\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010Z\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010\\\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010\\\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010]\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010]\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010^\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010^\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001d\u0010_\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\rH\u0087\b\u001a)\u0010`\u001a\u00020\r*\u00020\r2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140WH\u0087\bø\u0001\u0000¢\u0006\u0002\ba\u001a)\u0010`\u001a\u00020\r*\u00020\r2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020WH\u0087\bø\u0001\u0000¢\u0006\u0002\bb\u001a\"\u0010c\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020\u0002\u001a\u001a\u0010c\u001a\u00020\u0002*\u00020\u00022\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010Y\u001a\u00020\u0002\u001a%\u0010c\u001a\u00020\r*\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020\u0002H\u0087\b\u001a\u001d\u0010c\u001a\u00020\r*\u00020\r2\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010Y\u001a\u00020\u0002H\u0087\b\u001a=\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\u0012\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0H\"\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010e\u001a0\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\n\u0010G\u001a\u000202\"\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u001a/\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\u0006\u0010T\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0002\bf\u001a%\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0087\b\u001a=\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u00022\u0012\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0H\"\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010h\u001a0\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u00022\n\u0010G\u001a\u000202\"\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u001a%\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0087\b\u001a\u001c\u0010i\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010i\u001a\u00020\u0010*\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a$\u0010i\u001a\u00020\u0010*\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010j\u001a\u00020\u0002*\u00020\u00022\u0006\u0010Q\u001a\u00020\u0001\u001a\u001d\u0010j\u001a\u00020\u0002*\u00020\r2\u0006\u0010k\u001a\u00020\u00062\u0006\u0010l\u001a\u00020\u0006H\u0087\b\u001a\u001f\u0010m\u001a\u00020\r*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010-\u001a\u00020\u0006H\u0087\b\u001a\u0012\u0010m\u001a\u00020\r*\u00020\u00022\u0006\u0010Q\u001a\u00020\u0001\u001a\u0012\u0010m\u001a\u00020\r*\u00020\r2\u0006\u0010Q\u001a\u00020\u0001\u001a\u001c\u0010n\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010n\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010o\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010o\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010p\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010p\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010q\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010q\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\f\u0010r\u001a\u00020\u0010*\u00020\rH\u0007\u001a\u0013\u0010s\u001a\u0004\u0018\u00010\u0010*\u00020\rH\u0007¢\u0006\u0002\u0010t\u001a\n\u0010u\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010u\u001a\u00020\u0002*\u00020\u00022\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010u\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010u\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010u\u001a\u00020\r*\u00020\r2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010u\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\u001a\n\u0010w\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010w\u001a\u00020\u0002*\u00020\u00022\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010w\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010w\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010w\u001a\u00020\r*\u00020\r2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010w\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\u001a\n\u0010x\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010x\u001a\u00020\u0002*\u00020\u00022\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010x\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010x\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010x\u001a\u00020\r*\u00020\r2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010x\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006y"}, d2 = {"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "lastIndex", "", "getLastIndex", "(Ljava/lang/CharSequence;)I", "requireNonNegativeLimit", "", "limit", "commonPrefixWith", "", "other", "ignoreCase", "", "commonSuffixWith", "contains", "char", "", "regex", "Lkotlin/text/Regex;", "contentEqualsIgnoreCaseImpl", "contentEqualsImpl", "endsWith", "suffix", "findAnyOf", "Lkotlin/Pair;", "strings", "", "startIndex", "last", "findAnyOf$StringsKt__StringsKt", "findLastAnyOf", "hasSurrogatePairAt", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "ifBlank", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ifEmpty", "indexOf", "endIndex", "indexOf$StringsKt__StringsKt", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING, "indexOfAny", "chars", "", "isEmpty", "isNotBlank", "isNotEmpty", "isNullOrBlank", "isNullOrEmpty", "iterator", "Lkotlin/collections/CharIterator;", "lastIndexOf", "lastIndexOfAny", "lineSequence", "Lkotlin/sequences/Sequence;", "lines", "", "matches", "orEmpty", "padEnd", "length", "padChar", "padStart", "rangesDelimitedBy", "delimiters", "", "rangesDelimitedBy$StringsKt__StringsKt", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "regionMatchesImpl", "thisOffset", "otherOffset", "removePrefix", "prefix", "removeRange", "range", "removeSuffix", "removeSurrounding", androidx.media3.extractor.text.ttml.TtmlNode.RUBY_DELIMITER, "replace", "transform", "Lkotlin/Function1;", "Lkotlin/text/MatchResult;", "replacement", "replaceAfter", "missingDelimiterValue", "replaceAfterLast", "replaceBefore", "replaceBeforeLast", "replaceFirst", "replaceFirstChar", "replaceFirstCharWithChar", "replaceFirstCharWithCharSequence", "replaceRange", "split", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "split$StringsKt__StringsKt", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "startsWith", "subSequence", androidx.media3.extractor.text.ttml.TtmlNode.START, androidx.media3.extractor.text.ttml.TtmlNode.END, "substring", "substringAfter", "substringAfterLast", "substringBefore", "substringBeforeLast", "toBooleanStrict", "toBooleanStrictOrNull", "(Ljava/lang/String;)Ljava/lang/Boolean;", "trim", "predicate", "trimEnd", "trimStart", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class StringsKt__StringsKt extends kotlin.text.StringsKt__StringsJVMKt {
    private static final java.lang.String orEmpty(java.lang.String str) {
        return str == null ? "" : str;
    }

    public static final java.lang.CharSequence trim(java.lang.CharSequence charSequence, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zBooleanValue = predicate.invoke(java.lang.Character.valueOf(charSequence.charAt(!z ? i : length))).booleanValue();
            if (z) {
                if (!zBooleanValue) {
                    break;
                }
                length--;
            } else if (zBooleanValue) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final java.lang.String trim(java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "predicate");
        java.lang.String str2 = str;
        int length = str2.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zBooleanValue = predicate.invoke(java.lang.Character.valueOf(str2.charAt(!z ? i : length))).booleanValue();
            if (z) {
                if (!zBooleanValue) {
                    break;
                }
                length--;
            } else if (zBooleanValue) {
                i++;
            } else {
                z = true;
            }
        }
        return str2.subSequence(i, length + 1).toString();
    }

    public static final java.lang.CharSequence trimStart(java.lang.CharSequence charSequence, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!predicate.invoke(java.lang.Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static final java.lang.String trimStart(java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> predicate) {
        java.lang.String strSubSequence;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "predicate");
        java.lang.String str2 = str;
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            if (!predicate.invoke(java.lang.Character.valueOf(str2.charAt(i))).booleanValue()) {
                strSubSequence = str2.subSequence(i, str2.length());
                return strSubSequence.toString();
            }
        }
        return strSubSequence.toString();
    }

    public static final java.lang.CharSequence trimEnd(java.lang.CharSequence charSequence, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!predicate.invoke(java.lang.Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i >= 0) {
                    length = i;
                }
            }
        }
        return "";
    }

    public static final java.lang.String trimEnd(java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> predicate) {
        java.lang.String strSubSequence;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "predicate");
        java.lang.String str2 = str;
        int length = str2.length() - 1;
        if (length < 0) {
            break;
        }
        while (true) {
            int i = length - 1;
            if (!predicate.invoke(java.lang.Character.valueOf(str2.charAt(length))).booleanValue()) {
                strSubSequence = str2.subSequence(0, length + 1);
                break;
            }
            if (i < 0) {
                break;
            }
            length = i;
        }
        return strSubSequence.toString();
    }

    private static final java.lang.String trim(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return kotlin.text.StringsKt.trim((java.lang.CharSequence) str).toString();
    }

    private static final java.lang.String trimStart(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return kotlin.text.StringsKt.trimStart((java.lang.CharSequence) str).toString();
    }

    private static final java.lang.String trimEnd(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return kotlin.text.StringsKt.trimEnd((java.lang.CharSequence) str).toString();
    }

    public static /* synthetic */ java.lang.CharSequence padStart$default(java.lang.CharSequence charSequence, int i, char c, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return kotlin.text.StringsKt.padStart(charSequence, i, c);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.collections.IntIterator] */
    public static final java.lang.CharSequence padStart(java.lang.CharSequence charSequence, int i, char c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Desired length " + i + " is less than zero.");
        }
        if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i);
        ?? it = new kotlin.ranges.IntRange(1, i - charSequence.length()).iterator();
        while (it.hasNext()) {
            it.nextInt();
            sb.append(c);
        }
        sb.append(charSequence);
        return sb;
    }

    public static /* synthetic */ java.lang.String padStart$default(java.lang.String str, int i, char c, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return kotlin.text.StringsKt.padStart(str, i, c);
    }

    public static final java.lang.String padStart(java.lang.String str, int i, char c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return kotlin.text.StringsKt.padStart((java.lang.CharSequence) str, i, c).toString();
    }

    public static /* synthetic */ java.lang.CharSequence padEnd$default(java.lang.CharSequence charSequence, int i, char c, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return kotlin.text.StringsKt.padEnd(charSequence, i, c);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.collections.IntIterator] */
    public static final java.lang.CharSequence padEnd(java.lang.CharSequence charSequence, int i, char c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Desired length " + i + " is less than zero.");
        }
        if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i);
        sb.append(charSequence);
        ?? it = new kotlin.ranges.IntRange(1, i - charSequence.length()).iterator();
        while (it.hasNext()) {
            it.nextInt();
            sb.append(c);
        }
        return sb;
    }

    public static /* synthetic */ java.lang.String padEnd$default(java.lang.String str, int i, char c, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return kotlin.text.StringsKt.padEnd(str, i, c);
    }

    public static final java.lang.String padEnd(java.lang.String str, int i, char c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return kotlin.text.StringsKt.padEnd((java.lang.CharSequence) str, i, c).toString();
    }

    private static final boolean isNullOrEmpty(java.lang.CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    private static final boolean isEmpty(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    private static final boolean isNotEmpty(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0;
    }

    private static final boolean isNotBlank(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return !kotlin.text.StringsKt.isBlank(charSequence);
    }

    private static final boolean isNullOrBlank(java.lang.CharSequence charSequence) {
        return charSequence == null || kotlin.text.StringsKt.isBlank(charSequence);
    }

    public static final kotlin.collections.CharIterator iterator(final java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new kotlin.collections.CharIterator() { // from class: kotlin.text.StringsKt__StringsKt.iterator.1
            private int index;

            @Override // kotlin.collections.CharIterator
            public char nextChar() {
                java.lang.CharSequence charSequence2 = charSequence;
                int i = this.index;
                this.index = i + 1;
                return charSequence2.charAt(i);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < charSequence.length();
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <C extends java.lang.CharSequence & R, R> R ifEmpty(C c, kotlin.jvm.functions.Function0<? extends R> defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return c.length() == 0 ? defaultValue.invoke() : c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <C extends java.lang.CharSequence & R, R> R ifBlank(C c, kotlin.jvm.functions.Function0<? extends R> defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return kotlin.text.StringsKt.isBlank(c) ? defaultValue.invoke() : c;
    }

    public static final kotlin.ranges.IntRange getIndices(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new kotlin.ranges.IntRange(0, charSequence.length() - 1);
    }

    public static final int getLastIndex(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final boolean hasSurrogatePairAt(java.lang.CharSequence charSequence, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new kotlin.ranges.IntRange(0, charSequence.length() + (-2)).contains(i) && java.lang.Character.isHighSurrogate(charSequence.charAt(i)) && java.lang.Character.isLowSurrogate(charSequence.charAt(i + 1));
    }

    public static final java.lang.String substring(java.lang.String str, kotlin.ranges.IntRange range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        java.lang.String strSubstring = str.substring(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final java.lang.CharSequence subSequence(java.lang.CharSequence charSequence, kotlin.ranges.IntRange range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
    }

    @kotlin.Deprecated(message = "Use parameters named startIndex and endIndex.", replaceWith = @kotlin.ReplaceWith(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    private static final java.lang.CharSequence subSequence(java.lang.String str, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return str.subSequence(i, i2);
    }

    private static final java.lang.String substring(java.lang.CharSequence charSequence, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.subSequence(i, i2).toString();
    }

    static /* synthetic */ java.lang.String substring$default(java.lang.CharSequence charSequence, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = charSequence.length();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.subSequence(i, i2).toString();
    }

    public static final java.lang.String substring(java.lang.CharSequence charSequence, kotlin.ranges.IntRange range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1).toString();
    }

    public static /* synthetic */ java.lang.String substringBefore$default(java.lang.String str, char c, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return kotlin.text.StringsKt.substringBefore(str, c, str2);
    }

    public static final java.lang.String substringBefore(java.lang.String str, char c, java.lang.String missingDelimiterValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, c, 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        java.lang.String strSubstring = str.substring(0, iIndexOf$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ java.lang.String substringBefore$default(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return kotlin.text.StringsKt.substringBefore(str, str2, str3);
    }

    public static final java.lang.String substringBefore(java.lang.String str, java.lang.String delimiter, java.lang.String missingDelimiterValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, delimiter, 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        java.lang.String strSubstring = str.substring(0, iIndexOf$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ java.lang.String substringAfter$default(java.lang.String str, char c, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return kotlin.text.StringsKt.substringAfter(str, c, str2);
    }

    public static final java.lang.String substringAfter(java.lang.String str, char c, java.lang.String missingDelimiterValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, c, 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        java.lang.String strSubstring = str.substring(iIndexOf$default + 1, str.length());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ java.lang.String substringAfter$default(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return kotlin.text.StringsKt.substringAfter(str, str2, str3);
    }

    public static final java.lang.String substringAfter(java.lang.String str, java.lang.String delimiter, java.lang.String missingDelimiterValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, delimiter, 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        java.lang.String strSubstring = str.substring(iIndexOf$default + delimiter.length(), str.length());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ java.lang.String substringBeforeLast$default(java.lang.String str, char c, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return kotlin.text.StringsKt.substringBeforeLast(str, c, str2);
    }

    public static final java.lang.String substringBeforeLast(java.lang.String str, char c, java.lang.String missingDelimiterValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str, c, 0, false, 6, (java.lang.Object) null);
        if (iLastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        java.lang.String strSubstring = str.substring(0, iLastIndexOf$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ java.lang.String substringBeforeLast$default(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return kotlin.text.StringsKt.substringBeforeLast(str, str2, str3);
    }

    public static final java.lang.String substringBeforeLast(java.lang.String str, java.lang.String delimiter, java.lang.String missingDelimiterValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str, delimiter, 0, false, 6, (java.lang.Object) null);
        if (iLastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        java.lang.String strSubstring = str.substring(0, iLastIndexOf$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ java.lang.String substringAfterLast$default(java.lang.String str, char c, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return kotlin.text.StringsKt.substringAfterLast(str, c, str2);
    }

    public static final java.lang.String substringAfterLast(java.lang.String str, char c, java.lang.String missingDelimiterValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str, c, 0, false, 6, (java.lang.Object) null);
        if (iLastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        java.lang.String strSubstring = str.substring(iLastIndexOf$default + 1, str.length());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ java.lang.String substringAfterLast$default(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return kotlin.text.StringsKt.substringAfterLast(str, str2, str3);
    }

    public static final java.lang.String substringAfterLast(java.lang.String str, java.lang.String delimiter, java.lang.String missingDelimiterValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str, delimiter, 0, false, 6, (java.lang.Object) null);
        if (iLastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        java.lang.String strSubstring = str.substring(iLastIndexOf$default + delimiter.length(), str.length());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final java.lang.CharSequence replaceRange(java.lang.CharSequence charSequence, int i, int i2, java.lang.CharSequence replacement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacement, "replacement");
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb.append(charSequence, 0, i), "append(...)");
        sb.append(replacement);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb.append(charSequence, i2, charSequence.length()), "append(...)");
        return sb;
    }

    private static final java.lang.String replaceRange(java.lang.String str, int i, int i2, java.lang.CharSequence replacement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacement, "replacement");
        return kotlin.text.StringsKt.replaceRange((java.lang.CharSequence) str, i, i2, replacement).toString();
    }

    public static final java.lang.CharSequence replaceRange(java.lang.CharSequence charSequence, kotlin.ranges.IntRange range, java.lang.CharSequence replacement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacement, "replacement");
        return kotlin.text.StringsKt.replaceRange(charSequence, range.getStart().intValue(), range.getEndInclusive().intValue() + 1, replacement);
    }

    private static final java.lang.String replaceRange(java.lang.String str, kotlin.ranges.IntRange range, java.lang.CharSequence replacement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacement, "replacement");
        return kotlin.text.StringsKt.replaceRange((java.lang.CharSequence) str, range, replacement).toString();
    }

    public static final java.lang.CharSequence removeRange(java.lang.CharSequence charSequence, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
        }
        if (i2 == i) {
            return charSequence.subSequence(0, charSequence.length());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(charSequence.length() - (i2 - i));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb.append(charSequence, 0, i), "append(...)");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb.append(charSequence, i2, charSequence.length()), "append(...)");
        return sb;
    }

    private static final java.lang.String removeRange(java.lang.String str, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return kotlin.text.StringsKt.removeRange((java.lang.CharSequence) str, i, i2).toString();
    }

    public static final java.lang.CharSequence removeRange(java.lang.CharSequence charSequence, kotlin.ranges.IntRange range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        return kotlin.text.StringsKt.removeRange(charSequence, range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
    }

    private static final java.lang.String removeRange(java.lang.String str, kotlin.ranges.IntRange range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        return kotlin.text.StringsKt.removeRange((java.lang.CharSequence) str, range).toString();
    }

    public static final java.lang.CharSequence removePrefix(java.lang.CharSequence charSequence, java.lang.CharSequence prefix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (kotlin.text.StringsKt.startsWith$default(charSequence, prefix, false, 2, (java.lang.Object) null)) {
            return charSequence.subSequence(prefix.length(), charSequence.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final java.lang.String removePrefix(java.lang.String str, java.lang.CharSequence prefix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!kotlin.text.StringsKt.startsWith$default((java.lang.CharSequence) str, prefix, false, 2, (java.lang.Object) null)) {
            return str;
        }
        java.lang.String strSubstring = str.substring(prefix.length());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final java.lang.CharSequence removeSuffix(java.lang.CharSequence charSequence, java.lang.CharSequence suffix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (kotlin.text.StringsKt.endsWith$default(charSequence, suffix, false, 2, (java.lang.Object) null)) {
            return charSequence.subSequence(0, charSequence.length() - suffix.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final java.lang.String removeSuffix(java.lang.String str, java.lang.CharSequence suffix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!kotlin.text.StringsKt.endsWith$default((java.lang.CharSequence) str, suffix, false, 2, (java.lang.Object) null)) {
            return str;
        }
        java.lang.String strSubstring = str.substring(0, str.length() - suffix.length());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final java.lang.CharSequence removeSurrounding(java.lang.CharSequence charSequence, java.lang.CharSequence prefix, java.lang.CharSequence suffix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (charSequence.length() >= prefix.length() + suffix.length() && kotlin.text.StringsKt.startsWith$default(charSequence, prefix, false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.endsWith$default(charSequence, suffix, false, 2, (java.lang.Object) null)) {
            return charSequence.subSequence(prefix.length(), charSequence.length() - suffix.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final java.lang.String removeSurrounding(java.lang.String str, java.lang.CharSequence prefix, java.lang.CharSequence suffix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length()) {
            return str;
        }
        java.lang.String str2 = str;
        if (!kotlin.text.StringsKt.startsWith$default((java.lang.CharSequence) str2, prefix, false, 2, (java.lang.Object) null) || !kotlin.text.StringsKt.endsWith$default((java.lang.CharSequence) str2, suffix, false, 2, (java.lang.Object) null)) {
            return str;
        }
        java.lang.String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final java.lang.CharSequence removeSurrounding(java.lang.CharSequence charSequence, java.lang.CharSequence delimiter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return kotlin.text.StringsKt.removeSurrounding(charSequence, delimiter, delimiter);
    }

    public static final java.lang.String removeSurrounding(java.lang.String str, java.lang.CharSequence delimiter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return kotlin.text.StringsKt.removeSurrounding(str, delimiter, delimiter);
    }

    public static /* synthetic */ java.lang.String replaceBefore$default(java.lang.String str, char c, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return kotlin.text.StringsKt.replaceBefore(str, c, str2, str3);
    }

    public static final java.lang.String replaceBefore(java.lang.String str, char c, java.lang.String replacement, java.lang.String missingDelimiterValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacement, "replacement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        java.lang.String str2 = str;
        int iIndexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, c, 0, false, 6, (java.lang.Object) null);
        return iIndexOf$default == -1 ? missingDelimiterValue : kotlin.text.StringsKt.replaceRange((java.lang.CharSequence) str2, 0, iIndexOf$default, (java.lang.CharSequence) replacement).toString();
    }

    public static /* synthetic */ java.lang.String replaceBefore$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return kotlin.text.StringsKt.replaceBefore(str, str2, str3, str4);
    }

    public static final java.lang.String replaceBefore(java.lang.String str, java.lang.String delimiter, java.lang.String replacement, java.lang.String missingDelimiterValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacement, "replacement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        java.lang.String str2 = str;
        int iIndexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, delimiter, 0, false, 6, (java.lang.Object) null);
        return iIndexOf$default == -1 ? missingDelimiterValue : kotlin.text.StringsKt.replaceRange((java.lang.CharSequence) str2, 0, iIndexOf$default, (java.lang.CharSequence) replacement).toString();
    }

    public static /* synthetic */ java.lang.String replaceAfter$default(java.lang.String str, char c, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return kotlin.text.StringsKt.replaceAfter(str, c, str2, str3);
    }

    public static final java.lang.String replaceAfter(java.lang.String str, char c, java.lang.String replacement, java.lang.String missingDelimiterValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacement, "replacement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        java.lang.String str2 = str;
        int iIndexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, c, 0, false, 6, (java.lang.Object) null);
        return iIndexOf$default == -1 ? missingDelimiterValue : kotlin.text.StringsKt.replaceRange((java.lang.CharSequence) str2, iIndexOf$default + 1, str.length(), (java.lang.CharSequence) replacement).toString();
    }

    public static /* synthetic */ java.lang.String replaceAfter$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return kotlin.text.StringsKt.replaceAfter(str, str2, str3, str4);
    }

    public static final java.lang.String replaceAfter(java.lang.String str, java.lang.String delimiter, java.lang.String replacement, java.lang.String missingDelimiterValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacement, "replacement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        java.lang.String str2 = str;
        int iIndexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, delimiter, 0, false, 6, (java.lang.Object) null);
        return iIndexOf$default == -1 ? missingDelimiterValue : kotlin.text.StringsKt.replaceRange((java.lang.CharSequence) str2, iIndexOf$default + delimiter.length(), str.length(), (java.lang.CharSequence) replacement).toString();
    }

    public static /* synthetic */ java.lang.String replaceAfterLast$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return kotlin.text.StringsKt.replaceAfterLast(str, str2, str3, str4);
    }

    public static final java.lang.String replaceAfterLast(java.lang.String str, java.lang.String delimiter, java.lang.String replacement, java.lang.String missingDelimiterValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacement, "replacement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        java.lang.String str2 = str;
        int iLastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str2, delimiter, 0, false, 6, (java.lang.Object) null);
        return iLastIndexOf$default == -1 ? missingDelimiterValue : kotlin.text.StringsKt.replaceRange((java.lang.CharSequence) str2, iLastIndexOf$default + delimiter.length(), str.length(), (java.lang.CharSequence) replacement).toString();
    }

    public static /* synthetic */ java.lang.String replaceAfterLast$default(java.lang.String str, char c, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return kotlin.text.StringsKt.replaceAfterLast(str, c, str2, str3);
    }

    public static final java.lang.String replaceAfterLast(java.lang.String str, char c, java.lang.String replacement, java.lang.String missingDelimiterValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacement, "replacement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        java.lang.String str2 = str;
        int iLastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str2, c, 0, false, 6, (java.lang.Object) null);
        return iLastIndexOf$default == -1 ? missingDelimiterValue : kotlin.text.StringsKt.replaceRange((java.lang.CharSequence) str2, iLastIndexOf$default + 1, str.length(), (java.lang.CharSequence) replacement).toString();
    }

    public static /* synthetic */ java.lang.String replaceBeforeLast$default(java.lang.String str, char c, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return kotlin.text.StringsKt.replaceBeforeLast(str, c, str2, str3);
    }

    public static final java.lang.String replaceBeforeLast(java.lang.String str, char c, java.lang.String replacement, java.lang.String missingDelimiterValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacement, "replacement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        java.lang.String str2 = str;
        int iLastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str2, c, 0, false, 6, (java.lang.Object) null);
        return iLastIndexOf$default == -1 ? missingDelimiterValue : kotlin.text.StringsKt.replaceRange((java.lang.CharSequence) str2, 0, iLastIndexOf$default, (java.lang.CharSequence) replacement).toString();
    }

    public static /* synthetic */ java.lang.String replaceBeforeLast$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return kotlin.text.StringsKt.replaceBeforeLast(str, str2, str3, str4);
    }

    public static final java.lang.String replaceBeforeLast(java.lang.String str, java.lang.String delimiter, java.lang.String replacement, java.lang.String missingDelimiterValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacement, "replacement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        java.lang.String str2 = str;
        int iLastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str2, delimiter, 0, false, 6, (java.lang.Object) null);
        return iLastIndexOf$default == -1 ? missingDelimiterValue : kotlin.text.StringsKt.replaceRange((java.lang.CharSequence) str2, 0, iLastIndexOf$default, (java.lang.CharSequence) replacement).toString();
    }

    private static final java.lang.String replace(java.lang.CharSequence charSequence, kotlin.text.Regex regex, java.lang.String replacement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regex, "regex");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacement, "replacement");
        return regex.replace(charSequence, replacement);
    }

    private static final java.lang.String replace(java.lang.CharSequence charSequence, kotlin.text.Regex regex, kotlin.jvm.functions.Function1<? super kotlin.text.MatchResult, ? extends java.lang.CharSequence> transform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regex, "regex");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transform, "transform");
        return regex.replace(charSequence, transform);
    }

    private static final java.lang.String replaceFirst(java.lang.CharSequence charSequence, kotlin.text.Regex regex, java.lang.String replacement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regex, "regex");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacement, "replacement");
        return regex.replaceFirst(charSequence, replacement);
    }

    private static final java.lang.String replaceFirstCharWithChar(java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Character> transform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transform, "transform");
        if (!(str.length() > 0)) {
            return str;
        }
        char cCharValue = transform.invoke(java.lang.Character.valueOf(str.charAt(0))).charValue();
        java.lang.String strSubstring = str.substring(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return cCharValue + strSubstring;
    }

    private static final java.lang.String replaceFirstCharWithCharSequence(java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.Character, ? extends java.lang.CharSequence> transform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transform, "transform");
        if (!(str.length() > 0)) {
            return str;
        }
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append((java.lang.Object) transform.invoke(java.lang.Character.valueOf(str.charAt(0))));
        java.lang.String strSubstring = str.substring(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return sbAppend.append(strSubstring).toString();
    }

    private static final boolean matches(java.lang.CharSequence charSequence, kotlin.text.Regex regex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.matches(charSequence);
    }

    public static final boolean regionMatchesImpl(java.lang.CharSequence charSequence, int i, java.lang.CharSequence other, int i2, int i3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > other.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!kotlin.text.CharsKt.equals(charSequence.charAt(i + i4), other.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean startsWith$default(java.lang.CharSequence charSequence, char c, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.startsWith(charSequence, c, z);
    }

    public static final boolean startsWith(java.lang.CharSequence charSequence, char c, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && kotlin.text.CharsKt.equals(charSequence.charAt(0), c, z);
    }

    public static /* synthetic */ boolean endsWith$default(java.lang.CharSequence charSequence, char c, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.endsWith(charSequence, c, z);
    }

    public static final boolean endsWith(java.lang.CharSequence charSequence, char c, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && kotlin.text.CharsKt.equals(charSequence.charAt(kotlin.text.StringsKt.getLastIndex(charSequence)), c, z);
    }

    public static /* synthetic */ boolean startsWith$default(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.startsWith(charSequence, charSequence2, z);
    }

    public static final boolean startsWith(java.lang.CharSequence charSequence, java.lang.CharSequence prefix, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!z && (charSequence instanceof java.lang.String) && (prefix instanceof java.lang.String)) {
            return kotlin.text.StringsKt.startsWith$default((java.lang.String) charSequence, (java.lang.String) prefix, false, 2, (java.lang.Object) null);
        }
        return kotlin.text.StringsKt.regionMatchesImpl(charSequence, 0, prefix, 0, prefix.length(), z);
    }

    public static /* synthetic */ boolean startsWith$default(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.startsWith(charSequence, charSequence2, i, z);
    }

    public static final boolean startsWith(java.lang.CharSequence charSequence, java.lang.CharSequence prefix, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!z && (charSequence instanceof java.lang.String) && (prefix instanceof java.lang.String)) {
            return kotlin.text.StringsKt.startsWith$default((java.lang.String) charSequence, (java.lang.String) prefix, i, false, 4, (java.lang.Object) null);
        }
        return kotlin.text.StringsKt.regionMatchesImpl(charSequence, i, prefix, 0, prefix.length(), z);
    }

    public static /* synthetic */ boolean endsWith$default(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.endsWith(charSequence, charSequence2, z);
    }

    public static final boolean endsWith(java.lang.CharSequence charSequence, java.lang.CharSequence suffix, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!z && (charSequence instanceof java.lang.String) && (suffix instanceof java.lang.String)) {
            return kotlin.text.StringsKt.endsWith$default((java.lang.String) charSequence, (java.lang.String) suffix, false, 2, (java.lang.Object) null);
        }
        return kotlin.text.StringsKt.regionMatchesImpl(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z);
    }

    public static /* synthetic */ java.lang.String commonPrefixWith$default(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.commonPrefixWith(charSequence, charSequence2, z);
    }

    public static final java.lang.String commonPrefixWith(java.lang.CharSequence charSequence, java.lang.CharSequence other, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        int iMin = java.lang.Math.min(charSequence.length(), other.length());
        int i = 0;
        while (i < iMin && kotlin.text.CharsKt.equals(charSequence.charAt(i), other.charAt(i), z)) {
            i++;
        }
        int i2 = i - 1;
        if (kotlin.text.StringsKt.hasSurrogatePairAt(charSequence, i2) || kotlin.text.StringsKt.hasSurrogatePairAt(other, i2)) {
            i--;
        }
        return charSequence.subSequence(0, i).toString();
    }

    public static /* synthetic */ java.lang.String commonSuffixWith$default(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.commonSuffixWith(charSequence, charSequence2, z);
    }

    public static final java.lang.String commonSuffixWith(java.lang.CharSequence charSequence, java.lang.CharSequence other, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        int length = charSequence.length();
        int length2 = other.length();
        int iMin = java.lang.Math.min(length, length2);
        int i = 0;
        while (i < iMin && kotlin.text.CharsKt.equals(charSequence.charAt((length - i) - 1), other.charAt((length2 - i) - 1), z)) {
            i++;
        }
        if (kotlin.text.StringsKt.hasSurrogatePairAt(charSequence, (length - i) - 1) || kotlin.text.StringsKt.hasSurrogatePairAt(other, (length2 - i) - 1)) {
            i--;
        }
        return charSequence.subSequence(length - i, length).toString();
    }

    public static /* synthetic */ int indexOfAny$default(java.lang.CharSequence charSequence, char[] cArr, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.indexOfAny(charSequence, cArr, i, z);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.collections.IntIterator] */
    public static final int indexOfAny(java.lang.CharSequence charSequence, char[] chars, int i, boolean z) {
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z && chars.length == 1 && (charSequence instanceof java.lang.String)) {
            return ((java.lang.String) charSequence).indexOf(kotlin.collections.ArraysKt.single(chars), i);
        }
        ?? it = new kotlin.ranges.IntRange(kotlin.ranges.RangesKt.coerceAtLeast(i, 0), kotlin.text.StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            char cCharAt = charSequence.charAt(iNextInt);
            int length = chars.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = false;
                    break;
                }
                if (kotlin.text.CharsKt.equals(chars[i2], cCharAt, z)) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2) {
                return iNextInt;
            }
        }
        return -1;
    }

    public static /* synthetic */ int lastIndexOfAny$default(java.lang.CharSequence charSequence, char[] cArr, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = kotlin.text.StringsKt.getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.lastIndexOfAny(charSequence, cArr, i, z);
    }

    public static final int lastIndexOfAny(java.lang.CharSequence charSequence, char[] chars, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z && chars.length == 1 && (charSequence instanceof java.lang.String)) {
            return ((java.lang.String) charSequence).lastIndexOf(kotlin.collections.ArraysKt.single(chars), i);
        }
        for (int iCoerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(i, kotlin.text.StringsKt.getLastIndex(charSequence)); -1 < iCoerceAtMost; iCoerceAtMost--) {
            char cCharAt = charSequence.charAt(iCoerceAtMost);
            boolean z2 = false;
            for (char c : chars) {
                if (kotlin.text.CharsKt.equals(c, cCharAt, z)) {
                    z2 = true;
                    break;
                }
            }
            if (z2) {
                return iCoerceAtMost;
            }
        }
        return -1;
    }

    static /* synthetic */ int indexOf$StringsKt__StringsKt$default(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, java.lang.Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return indexOf$StringsKt__StringsKt(charSequence, charSequence2, i, i2, z, z2);
    }

    private static final int indexOf$StringsKt__StringsKt(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        kotlin.ranges.IntRange intRangeDownTo;
        if (!z2) {
            intRangeDownTo = new kotlin.ranges.IntRange(kotlin.ranges.RangesKt.coerceAtLeast(i, 0), kotlin.ranges.RangesKt.coerceAtMost(i2, charSequence.length()));
        } else {
            intRangeDownTo = kotlin.ranges.RangesKt.downTo(kotlin.ranges.RangesKt.coerceAtMost(i, kotlin.text.StringsKt.getLastIndex(charSequence)), kotlin.ranges.RangesKt.coerceAtLeast(i2, 0));
        }
        if ((charSequence instanceof java.lang.String) && (charSequence2 instanceof java.lang.String)) {
            int first = intRangeDownTo.getFirst();
            int last = intRangeDownTo.getLast();
            int step = intRangeDownTo.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return -1;
            }
            while (!kotlin.text.StringsKt.regionMatches((java.lang.String) charSequence2, 0, (java.lang.String) charSequence, first, charSequence2.length(), z)) {
                if (first == last) {
                    return -1;
                }
                first += step;
            }
            return first;
        }
        int first2 = intRangeDownTo.getFirst();
        int last2 = intRangeDownTo.getLast();
        int step2 = intRangeDownTo.getStep();
        if ((step2 <= 0 || first2 > last2) && (step2 >= 0 || last2 > first2)) {
            return -1;
        }
        while (!kotlin.text.StringsKt.regionMatchesImpl(charSequence2, 0, charSequence, first2, charSequence2.length(), z)) {
            if (first2 == last2) {
                return -1;
            }
            first2 += step2;
        }
        return first2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair<java.lang.Integer, java.lang.String> findAnyOf$StringsKt__StringsKt(java.lang.CharSequence charSequence, java.util.Collection<java.lang.String> collection, int i, boolean z, boolean z2) {
        java.lang.Object next;
        java.lang.String str;
        java.lang.Object next2;
        java.lang.String str2;
        if (!z && collection.size() == 1) {
            java.lang.String str3 = (java.lang.String) kotlin.collections.CollectionsKt.single(collection);
            int iIndexOf$default = !z2 ? kotlin.text.StringsKt.indexOf$default(charSequence, str3, i, false, 4, (java.lang.Object) null) : kotlin.text.StringsKt.lastIndexOf$default(charSequence, str3, i, false, 4, (java.lang.Object) null);
            if (iIndexOf$default < 0) {
                return null;
            }
            return kotlin.TuplesKt.to(java.lang.Integer.valueOf(iIndexOf$default), str3);
        }
        kotlin.ranges.IntRange intRange = !z2 ? new kotlin.ranges.IntRange(kotlin.ranges.RangesKt.coerceAtLeast(i, 0), charSequence.length()) : kotlin.ranges.RangesKt.downTo(kotlin.ranges.RangesKt.coerceAtMost(i, kotlin.text.StringsKt.getLastIndex(charSequence)), 0);
        if (charSequence instanceof java.lang.String) {
            int first = intRange.getFirst();
            int last = intRange.getLast();
            int step = intRange.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    java.util.Iterator<T> it = collection.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        str2 = (java.lang.String) next2;
                    } while (!kotlin.text.StringsKt.regionMatches(str2, 0, (java.lang.String) charSequence, first, str2.length(), z));
                    java.lang.String str4 = (java.lang.String) next2;
                    if (str4 != null) {
                        return kotlin.TuplesKt.to(java.lang.Integer.valueOf(first), str4);
                    }
                    if (first != last) {
                        first += step;
                    }
                }
            }
        } else {
            int first2 = intRange.getFirst();
            int last2 = intRange.getLast();
            int step2 = intRange.getStep();
            if ((step2 > 0 && first2 <= last2) || (step2 < 0 && last2 <= first2)) {
                while (true) {
                    java.util.Iterator<T> it2 = collection.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        str = (java.lang.String) next;
                    } while (!kotlin.text.StringsKt.regionMatchesImpl(str, 0, charSequence, first2, str.length(), z));
                    java.lang.String str5 = (java.lang.String) next;
                    if (str5 != null) {
                        return kotlin.TuplesKt.to(java.lang.Integer.valueOf(first2), str5);
                    }
                    if (first2 != last2) {
                        first2 += step2;
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ kotlin.Pair findAnyOf$default(java.lang.CharSequence charSequence, java.util.Collection collection, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.findAnyOf(charSequence, collection, i, z);
    }

    public static final kotlin.Pair<java.lang.Integer, java.lang.String> findAnyOf(java.lang.CharSequence charSequence, java.util.Collection<java.lang.String> strings, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strings, "strings");
        return findAnyOf$StringsKt__StringsKt(charSequence, strings, i, z, false);
    }

    public static /* synthetic */ kotlin.Pair findLastAnyOf$default(java.lang.CharSequence charSequence, java.util.Collection collection, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = kotlin.text.StringsKt.getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.findLastAnyOf(charSequence, collection, i, z);
    }

    public static final kotlin.Pair<java.lang.Integer, java.lang.String> findLastAnyOf(java.lang.CharSequence charSequence, java.util.Collection<java.lang.String> strings, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strings, "strings");
        return findAnyOf$StringsKt__StringsKt(charSequence, strings, i, z, true);
    }

    public static /* synthetic */ int indexOfAny$default(java.lang.CharSequence charSequence, java.util.Collection collection, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.indexOfAny(charSequence, (java.util.Collection<java.lang.String>) collection, i, z);
    }

    public static final int indexOfAny(java.lang.CharSequence charSequence, java.util.Collection<java.lang.String> strings, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strings, "strings");
        kotlin.Pair<java.lang.Integer, java.lang.String> pairFindAnyOf$StringsKt__StringsKt = findAnyOf$StringsKt__StringsKt(charSequence, strings, i, z, false);
        if (pairFindAnyOf$StringsKt__StringsKt != null) {
            return pairFindAnyOf$StringsKt__StringsKt.getFirst().intValue();
        }
        return -1;
    }

    public static /* synthetic */ int lastIndexOfAny$default(java.lang.CharSequence charSequence, java.util.Collection collection, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = kotlin.text.StringsKt.getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.lastIndexOfAny(charSequence, (java.util.Collection<java.lang.String>) collection, i, z);
    }

    public static final int lastIndexOfAny(java.lang.CharSequence charSequence, java.util.Collection<java.lang.String> strings, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strings, "strings");
        kotlin.Pair<java.lang.Integer, java.lang.String> pairFindAnyOf$StringsKt__StringsKt = findAnyOf$StringsKt__StringsKt(charSequence, strings, i, z, true);
        if (pairFindAnyOf$StringsKt__StringsKt != null) {
            return pairFindAnyOf$StringsKt__StringsKt.getFirst().intValue();
        }
        return -1;
    }

    public static /* synthetic */ int indexOf$default(java.lang.CharSequence charSequence, char c, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.indexOf(charSequence, c, i, z);
    }

    public static final int indexOf(java.lang.CharSequence charSequence, char c, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (z || !(charSequence instanceof java.lang.String)) {
            return kotlin.text.StringsKt.indexOfAny(charSequence, new char[]{c}, i, z);
        }
        return ((java.lang.String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int indexOf$default(java.lang.CharSequence charSequence, java.lang.String str, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.indexOf(charSequence, str, i, z);
    }

    public static final int indexOf(java.lang.CharSequence charSequence, java.lang.String string, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        if (z || !(charSequence instanceof java.lang.String)) {
            return indexOf$StringsKt__StringsKt$default(charSequence, string, i, charSequence.length(), z, false, 16, null);
        }
        return ((java.lang.String) charSequence).indexOf(string, i);
    }

    public static /* synthetic */ int lastIndexOf$default(java.lang.CharSequence charSequence, char c, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = kotlin.text.StringsKt.getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.lastIndexOf(charSequence, c, i, z);
    }

    public static final int lastIndexOf(java.lang.CharSequence charSequence, char c, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (z || !(charSequence instanceof java.lang.String)) {
            return kotlin.text.StringsKt.lastIndexOfAny(charSequence, new char[]{c}, i, z);
        }
        return ((java.lang.String) charSequence).lastIndexOf(c, i);
    }

    public static /* synthetic */ int lastIndexOf$default(java.lang.CharSequence charSequence, java.lang.String str, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = kotlin.text.StringsKt.getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.lastIndexOf(charSequence, str, i, z);
    }

    public static final int lastIndexOf(java.lang.CharSequence charSequence, java.lang.String string, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        if (z || !(charSequence instanceof java.lang.String)) {
            return indexOf$StringsKt__StringsKt(charSequence, string, i, 0, z, true);
        }
        return ((java.lang.String) charSequence).lastIndexOf(string, i);
    }

    public static /* synthetic */ boolean contains$default(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.contains(charSequence, charSequence2, z);
    }

    public static final boolean contains(java.lang.CharSequence charSequence, java.lang.CharSequence other, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof java.lang.String) {
            if (kotlin.text.StringsKt.indexOf$default(charSequence, (java.lang.String) other, 0, z, 2, (java.lang.Object) null) >= 0) {
                return true;
            }
        } else if (indexOf$StringsKt__StringsKt$default(charSequence, other, 0, charSequence.length(), z, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean contains$default(java.lang.CharSequence charSequence, char c, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.contains(charSequence, c, z);
    }

    public static final boolean contains(java.lang.CharSequence charSequence, char c, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return kotlin.text.StringsKt.indexOf$default(charSequence, c, 0, z, 2, (java.lang.Object) null) >= 0;
    }

    private static final boolean contains(java.lang.CharSequence charSequence, kotlin.text.Regex regex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.containsMatchIn(charSequence);
    }

    static /* synthetic */ kotlin.sequences.Sequence rangesDelimitedBy$StringsKt__StringsKt$default(java.lang.CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return rangesDelimitedBy$StringsKt__StringsKt(charSequence, cArr, i, z, i2);
    }

    private static final kotlin.sequences.Sequence<kotlin.ranges.IntRange> rangesDelimitedBy$StringsKt__StringsKt(java.lang.CharSequence charSequence, final char[] cArr, int i, final boolean z, int i2) {
        kotlin.text.StringsKt.requireNonNegativeLimit(i2);
        return new kotlin.text.DelimitedRangesSequence(charSequence, i, i2, new kotlin.jvm.functions.Function2<java.lang.CharSequence, java.lang.Integer, kotlin.Pair<? extends java.lang.Integer, ? extends java.lang.Integer>>() { // from class: kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Pair<? extends java.lang.Integer, ? extends java.lang.Integer> invoke(java.lang.CharSequence charSequence2, java.lang.Integer num) {
                return invoke(charSequence2, num.intValue());
            }

            public final kotlin.Pair<java.lang.Integer, java.lang.Integer> invoke(java.lang.CharSequence $receiver, int i3) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                int iIndexOfAny = kotlin.text.StringsKt.indexOfAny($receiver, cArr, i3, z);
                if (iIndexOfAny < 0) {
                    return null;
                }
                return kotlin.TuplesKt.to(java.lang.Integer.valueOf(iIndexOfAny), 1);
            }
        });
    }

    static /* synthetic */ kotlin.sequences.Sequence rangesDelimitedBy$StringsKt__StringsKt$default(java.lang.CharSequence charSequence, java.lang.String[] strArr, int i, boolean z, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return rangesDelimitedBy$StringsKt__StringsKt(charSequence, strArr, i, z, i2);
    }

    private static final kotlin.sequences.Sequence<kotlin.ranges.IntRange> rangesDelimitedBy$StringsKt__StringsKt(java.lang.CharSequence charSequence, java.lang.String[] strArr, int i, final boolean z, int i2) {
        kotlin.text.StringsKt.requireNonNegativeLimit(i2);
        final java.util.List listAsList = kotlin.collections.ArraysKt.asList(strArr);
        return new kotlin.text.DelimitedRangesSequence(charSequence, i, i2, new kotlin.jvm.functions.Function2<java.lang.CharSequence, java.lang.Integer, kotlin.Pair<? extends java.lang.Integer, ? extends java.lang.Integer>>() { // from class: kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Pair<? extends java.lang.Integer, ? extends java.lang.Integer> invoke(java.lang.CharSequence charSequence2, java.lang.Integer num) {
                return invoke(charSequence2, num.intValue());
            }

            public final kotlin.Pair<java.lang.Integer, java.lang.Integer> invoke(java.lang.CharSequence $receiver, int i3) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                kotlin.Pair pairFindAnyOf$StringsKt__StringsKt = kotlin.text.StringsKt__StringsKt.findAnyOf$StringsKt__StringsKt($receiver, listAsList, i3, z, false);
                if (pairFindAnyOf$StringsKt__StringsKt != null) {
                    return kotlin.TuplesKt.to(pairFindAnyOf$StringsKt__StringsKt.getFirst(), java.lang.Integer.valueOf(((java.lang.String) pairFindAnyOf$StringsKt__StringsKt.getSecond()).length()));
                }
                return null;
            }
        });
    }

    public static final void requireNonNegativeLimit(int i) {
        if (!(i >= 0)) {
            throw new java.lang.IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
        }
    }

    public static /* synthetic */ kotlin.sequences.Sequence splitToSequence$default(java.lang.CharSequence charSequence, java.lang.String[] strArr, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return kotlin.text.StringsKt.splitToSequence(charSequence, strArr, z, i);
    }

    public static final kotlin.sequences.Sequence<java.lang.String> splitToSequence(final java.lang.CharSequence charSequence, java.lang.String[] delimiters, boolean z, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        return kotlin.sequences.SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, delimiters, 0, z, i, 2, (java.lang.Object) null), new kotlin.jvm.functions.Function1<kotlin.ranges.IntRange, java.lang.String>() { // from class: kotlin.text.StringsKt__StringsKt.splitToSequence.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.String invoke(kotlin.ranges.IntRange it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                return kotlin.text.StringsKt.substring(charSequence, it);
            }
        });
    }

    public static /* synthetic */ java.util.List split$default(java.lang.CharSequence charSequence, java.lang.String[] strArr, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return kotlin.text.StringsKt.split(charSequence, strArr, z, i);
    }

    public static final java.util.List<java.lang.String> split(java.lang.CharSequence charSequence, java.lang.String[] delimiters, boolean z, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            java.lang.String str = delimiters[0];
            if (!(str.length() == 0)) {
                return split$StringsKt__StringsKt(charSequence, str, z, i);
            }
        }
        java.lang.Iterable iterableAsIterable = kotlin.sequences.SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, delimiters, 0, z, i, 2, (java.lang.Object) null));
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterableAsIterable, 10));
        java.util.Iterator it = iterableAsIterable.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.text.StringsKt.substring(charSequence, (kotlin.ranges.IntRange) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ kotlin.sequences.Sequence splitToSequence$default(java.lang.CharSequence charSequence, char[] cArr, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return kotlin.text.StringsKt.splitToSequence(charSequence, cArr, z, i);
    }

    public static final kotlin.sequences.Sequence<java.lang.String> splitToSequence(final java.lang.CharSequence charSequence, char[] delimiters, boolean z, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        return kotlin.sequences.SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, delimiters, 0, z, i, 2, (java.lang.Object) null), new kotlin.jvm.functions.Function1<kotlin.ranges.IntRange, java.lang.String>() { // from class: kotlin.text.StringsKt__StringsKt.splitToSequence.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.String invoke(kotlin.ranges.IntRange it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                return kotlin.text.StringsKt.substring(charSequence, it);
            }
        });
    }

    public static /* synthetic */ java.util.List split$default(java.lang.CharSequence charSequence, char[] cArr, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return kotlin.text.StringsKt.split(charSequence, cArr, z, i);
    }

    public static final java.util.List<java.lang.String> split(java.lang.CharSequence charSequence, char[] delimiters, boolean z, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return split$StringsKt__StringsKt(charSequence, java.lang.String.valueOf(delimiters[0]), z, i);
        }
        java.lang.Iterable iterableAsIterable = kotlin.sequences.SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, delimiters, 0, z, i, 2, (java.lang.Object) null));
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterableAsIterable, 10));
        java.util.Iterator it = iterableAsIterable.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.text.StringsKt.substring(charSequence, (kotlin.ranges.IntRange) it.next()));
        }
        return arrayList;
    }

    private static final java.util.List<java.lang.String> split$StringsKt__StringsKt(java.lang.CharSequence charSequence, java.lang.String str, boolean z, int i) {
        kotlin.text.StringsKt.requireNonNegativeLimit(i);
        int length = 0;
        int iIndexOf = kotlin.text.StringsKt.indexOf(charSequence, str, 0, z);
        if (iIndexOf == -1 || i == 1) {
            return kotlin.collections.CollectionsKt.listOf(charSequence.toString());
        }
        boolean z2 = i > 0;
        java.util.ArrayList arrayList = new java.util.ArrayList(z2 ? kotlin.ranges.RangesKt.coerceAtMost(i, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iIndexOf).toString());
            length = str.length() + iIndexOf;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iIndexOf = kotlin.text.StringsKt.indexOf(charSequence, str, length, z);
        } while (iIndexOf != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    private static final java.util.List<java.lang.String> split(java.lang.CharSequence charSequence, kotlin.text.Regex regex, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.split(charSequence, i);
    }

    static /* synthetic */ java.util.List split$default(java.lang.CharSequence charSequence, kotlin.text.Regex regex, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.split(charSequence, i);
    }

    private static final kotlin.sequences.Sequence<java.lang.String> splitToSequence(java.lang.CharSequence charSequence, kotlin.text.Regex regex, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.splitToSequence(charSequence, i);
    }

    static /* synthetic */ kotlin.sequences.Sequence splitToSequence$default(java.lang.CharSequence charSequence, kotlin.text.Regex regex, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.splitToSequence(charSequence, i);
    }

    public static final kotlin.sequences.Sequence<java.lang.String> lineSequence(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return kotlin.text.StringsKt.splitToSequence$default(charSequence, new java.lang.String[]{"\r\n", "\n", "\r"}, false, 0, 6, (java.lang.Object) null);
    }

    public static final java.util.List<java.lang.String> lines(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return kotlin.sequences.SequencesKt.toList(kotlin.text.StringsKt.lineSequence(charSequence));
    }

    public static final boolean contentEqualsIgnoreCaseImpl(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        if ((charSequence instanceof java.lang.String) && (charSequence2 instanceof java.lang.String)) {
            return kotlin.text.StringsKt.equals((java.lang.String) charSequence, (java.lang.String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!kotlin.text.CharsKt.equals(charSequence.charAt(i), charSequence2.charAt(i), true)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean contentEqualsImpl(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        if ((charSequence instanceof java.lang.String) && (charSequence2 instanceof java.lang.String)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean toBooleanStrict(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.json.mediationsdk.metadata.a.g)) {
            return true;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "false")) {
            return false;
        }
        throw new java.lang.IllegalArgumentException("The string doesn't represent a boolean value: " + str);
    }

    public static final java.lang.Boolean toBooleanStrictOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.json.mediationsdk.metadata.a.g)) {
            return true;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(str, "false") ? false : null;
    }

    public static final java.lang.CharSequence trim(java.lang.CharSequence charSequence, char... chars) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chars, "chars");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zContains = kotlin.collections.ArraysKt.contains(chars, charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zContains) {
                    break;
                }
                length--;
            } else if (zContains) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final java.lang.String trim(java.lang.String str, char... chars) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chars, "chars");
        java.lang.String str2 = str;
        int length = str2.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zContains = kotlin.collections.ArraysKt.contains(chars, str2.charAt(!z ? i : length));
            if (z) {
                if (!zContains) {
                    break;
                }
                length--;
            } else if (zContains) {
                i++;
            } else {
                z = true;
            }
        }
        return str2.subSequence(i, length + 1).toString();
    }

    public static final java.lang.CharSequence trimStart(java.lang.CharSequence charSequence, char... chars) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chars, "chars");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!kotlin.collections.ArraysKt.contains(chars, charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static final java.lang.String trimStart(java.lang.String str, char... chars) {
        java.lang.String strSubSequence;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chars, "chars");
        java.lang.String str2 = str;
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            if (!kotlin.collections.ArraysKt.contains(chars, str2.charAt(i))) {
                strSubSequence = str2.subSequence(i, str2.length());
                return strSubSequence.toString();
            }
        }
        return strSubSequence.toString();
    }

    public static final java.lang.CharSequence trimEnd(java.lang.CharSequence charSequence, char... chars) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chars, "chars");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!kotlin.collections.ArraysKt.contains(chars, charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i >= 0) {
                    length = i;
                }
            }
        }
        return "";
    }

    public static final java.lang.String trimEnd(java.lang.String str, char... chars) {
        java.lang.String strSubSequence;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chars, "chars");
        java.lang.String str2 = str;
        int length = str2.length() - 1;
        if (length < 0) {
            break;
        }
        while (true) {
            int i = length - 1;
            if (!kotlin.collections.ArraysKt.contains(chars, str2.charAt(length))) {
                strSubSequence = str2.subSequence(0, length + 1);
                break;
            }
            if (i < 0) {
                break;
            }
            length = i;
        }
        return strSubSequence.toString();
    }

    public static final java.lang.CharSequence trim(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zIsWhitespace = kotlin.text.CharsKt.isWhitespace(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zIsWhitespace) {
                    break;
                }
                length--;
            } else if (zIsWhitespace) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final java.lang.CharSequence trimStart(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!kotlin.text.CharsKt.isWhitespace(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static final java.lang.CharSequence trimEnd(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!kotlin.text.CharsKt.isWhitespace(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i >= 0) {
                    length = i;
                }
            }
        }
        return "";
    }
}
