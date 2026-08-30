package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000 \u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aJ\u0010\u0000\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u00072\u001a\u0010\b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t\"\u0006\u0012\u0002\b\u00030\nH\u0001¢\u0006\u0002\u0010\u000b\u001a!\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a1\u0010\u0010\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007*\u0006\u0012\u0002\b\u00030\nH\u0001\u001a!\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0007\u001aZ\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a0\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007\u001aT\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a)\u0010!\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\"\u001a\u00020\u0012H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010#\u001a+\u0010$\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\"\u001a\u00020\u0012H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010#\u001aT\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001ai\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u001727\u0010 \u001a3\b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0'H\u0007ø\u0001\u0000¢\u0006\u0002\u0010(\u001aT\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a$\u0010*\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\b\b\u0000\u0010\u000e*\u00020\u001b*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\nH\u0001\u001aA\u0010+\u001a\u0002H,\"\b\b\u0000\u0010\u000e*\u00020\u001b\"\u0010\b\u0001\u0010,*\n\u0012\u0006\b\u0000\u0012\u0002H\u000e0-*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\n2\u0006\u0010.\u001a\u0002H,H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010/\u001a?\u0010+\u001a\u0002H,\"\b\b\u0000\u0010\u000e*\u00020\u001b\"\u000e\b\u0001\u0010,*\b\u0012\u0004\u0012\u0002H\u000e00*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\n2\u0006\u0010.\u001a\u0002H,H\u0087@ø\u0001\u0000¢\u0006\u0002\u00101\u001a!\u00102\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a#\u00103\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a`\u00104\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172(\u00106\u001a$\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H50\n0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a)\u00107\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u00108\u001a\u0002H\u000eH\u0087@ø\u0001\u0000¢\u0006\u0002\u00109\u001a!\u0010:\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a)\u0010;\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u00108\u001a\u0002H\u000eH\u0087@ø\u0001\u0000¢\u0006\u0002\u00109\u001a#\u0010<\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001aZ\u0010=\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u00106\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H50\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001ao\u0010>\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u001727\u00106\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H50\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0'H\u0001ø\u0001\u0000¢\u0006\u0002\u0010(\u001au\u0010?\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u00105*\u00020\u001b*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u001729\u00106\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H50\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0'H\u0007ø\u0001\u0000¢\u0006\u0002\u0010(\u001a`\u0010@\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u00105*\u00020\u001b*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172$\u00106\u001a \b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H50\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a?\u0010A\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u001a\u0010B\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0Cj\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`DH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010E\u001a?\u0010F\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u001a\u0010B\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0Cj\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`DH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010E\u001a!\u0010G\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a$\u0010H\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\b\b\u0000\u0010\u000e*\u00020\u001b*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\nH\u0007\u001a!\u0010I\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a#\u0010J\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a0\u0010K\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007\u001aT\u0010L\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a9\u0010M\u001a\u0002H,\"\u0004\b\u0000\u0010\u000e\"\u000e\b\u0001\u0010,*\b\u0012\u0004\u0012\u0002H\u000e00*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010.\u001a\u0002H,H\u0081@ø\u0001\u0000¢\u0006\u0002\u00101\u001a;\u0010N\u001a\u0002H,\"\u0004\b\u0000\u0010\u000e\"\u0010\b\u0001\u0010,*\n\u0012\u0006\b\u0000\u0012\u0002H\u000e0-*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010.\u001a\u0002H,H\u0081@ø\u0001\u0000¢\u0006\u0002\u0010/\u001a?\u0010O\u001a\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002HQ0P\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010Q*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002HQ0R0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001aU\u0010O\u001a\u0002HS\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010Q\"\u0018\b\u0002\u0010S*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0015\u0012\u0006\b\u0000\u0012\u0002HQ0T*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002HQ0R0\n2\u0006\u0010.\u001a\u0002HSH\u0081@ø\u0001\u0000¢\u0006\u0002\u0010U\u001a'\u0010V\u001a\b\u0012\u0004\u0012\u0002H\u000e0W\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a'\u0010X\u001a\b\u0012\u0004\u0012\u0002H\u000e0Y\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0081@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a'\u0010Z\u001a\b\u0012\u0004\u0012\u0002H\u000e0[\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a.\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0]0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007\u001a?\u0010^\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H50R0\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e0\n2\f\u0010_\u001a\b\u0012\u0004\u0012\u0002H50\nH\u0087\u0004\u001az\u0010^\u001a\b\u0012\u0004\u0012\u0002HQ0\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105\"\u0004\b\u0002\u0010Q*\b\u0012\u0004\u0012\u0002H\u000e0\n2\f\u0010_\u001a\b\u0012\u0004\u0012\u0002H50\n2\b\b\u0002\u0010\u0016\u001a\u00020\u001726\u00106\u001a2\u0012\u0013\u0012\u0011H\u000e¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(`\u0012\u0013\u0012\u0011H5¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(a\u0012\u0004\u0012\u0002HQ0\u0019H\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006b"}, d2 = {"consumesAll", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "channels", "", "Lkotlinx/coroutines/channels/ReceiveChannel;", "([Lkotlinx/coroutines/channels/ReceiveChannel;)Lkotlin/jvm/functions/Function1;", "any", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumes", "count", "", "distinct", "distinctBy", "K", "context", "Lkotlin/coroutines/CoroutineContext;", "selector", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "drop", com.json.zb.q, "dropWhile", "predicate", "elementAt", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "(Lkotlinx/coroutines/channels/ReceiveChannel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "elementAtOrNull", "filter", "filterIndexed", "Lkotlin/Function3;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/channels/ReceiveChannel;", "filterNot", "filterNotNull", "filterNotNullTo", "C", "", com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/SendChannel;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlinx/coroutines/channels/SendChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "first", "firstOrNull", "flatMap", "R", "transform", "indexOf", "element", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "last", "lastIndexOf", "lastOrNull", "map", "mapIndexed", "mapIndexedNotNull", "mapNotNull", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Comparator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "minWith", "none", "requireNoNulls", "single", "singleOrNull", "take", "takeWhile", "toChannel", "toCollection", "toMap", "", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Pair;", "M", "", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toMutableList", "", "toMutableSet", "", "toSet", "", "withIndex", "Lkotlin/collections/IndexedValue;", "zip", "other", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
final /* synthetic */ class ChannelsKt__DeprecatedKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1, reason: invalid class name */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {404}, m = "any", n = {"$this$consume$iv"}, s = {"L$0"})
    static final class AnonymousClass1<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.any(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "count", n = {"count", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    static final class C18101<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C18101(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.count(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {38}, m = "elementAt", n = {"$this$consume$iv", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "count"}, s = {"L$0", "I$0", "I$1"})
    static final class C18151<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        int I$1;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C18151(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.elementAt(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {53}, m = "elementAtOrNull", n = {"$this$consume$iv", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "count"}, s = {"L$0", "I$0", "I$1"})
    static final class C18161<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        int I$1;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C18161(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.elementAtOrNull(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "filterNotNullTo", n = {com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    static final class C18211<E, C extends java.util.Collection<? super E>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C18211(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNullTo((kotlinx.coroutines.channels.ReceiveChannel) null, (java.util.Collection) null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3, reason: invalid class name */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {487, 242}, m = "filterNotNullTo", n = {com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, "$this$consume$iv$iv", com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class AnonymousClass3<E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass3(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass3> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNullTo((kotlinx.coroutines.channels.ReceiveChannel) null, (kotlinx.coroutines.channels.SendChannel) null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {65}, m = "first", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    static final class C18221<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C18221(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.first(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {75}, m = "firstOrNull", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    static final class C18231<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C18231(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.firstOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {487}, m = "indexOf", n = {"element", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class C18251<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        C18251(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.indexOf(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {97, 100}, m = "last", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class C18261<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C18261(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.last(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 0}, l = {487}, m = "lastIndexOf", n = {"element", "lastIndex", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class C18271<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        int label;
        /* synthetic */ java.lang.Object result;

        C18271(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.lastIndexOf(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {123, 126}, m = "lastOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class C18281<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C18281(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.lastOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE}, m = "maxWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", com.applovin.sdk.AppLovinMediationProvider.MAX}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    static final class C18311<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        C18311(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.maxWith(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {434, 436}, m = "minWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "min"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    static final class C18321<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        C18321(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.minWith(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {447}, m = "none", n = {"$this$consume$iv"}, s = {"L$0"})
    static final class C18331<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C18331(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.none(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {136, 139}, m = "single", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C18351<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C18351(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.single(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {org.objectweb.asm.Opcodes.FCMPL, org.objectweb.asm.Opcodes.DCMPG}, m = "singleOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C18361<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C18361(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.singleOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {487, 278}, m = "toChannel", n = {com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, "$this$consume$iv$iv", com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C18391<E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C18391(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.ChannelsKt.toChannel(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "toCollection", n = {com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    static final class C18401<E, C extends java.util.Collection<? super E>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C18401(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.ChannelsKt.toCollection(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2, reason: invalid class name */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "toMap", n = {com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    static final class AnonymousClass2<K, V, M extends java.util.Map<? super K, ? super V>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass2(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass2> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.ChannelsKt.toMap(null, null, this);
        }
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> consumesAll(final kotlinx.coroutines.channels.ReceiveChannel<?>... receiveChannelArr) {
        return new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.consumesAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) throws java.lang.Throwable {
                invoke2(th);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.Throwable th) throws java.lang.Throwable {
                java.lang.Throwable th2 = null;
                for (kotlinx.coroutines.channels.ReceiveChannel<?> receiveChannel : receiveChannelArr) {
                    try {
                        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, th);
                    } catch (java.lang.Throwable th3) {
                        if (th2 == null) {
                            th2 = th3;
                        } else {
                            kotlin.ExceptionsKt.addSuppressed(th2, th3);
                        }
                    }
                }
                if (th2 != null) {
                    throw th2;
                }
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:27:0x006d A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #2 {all -> 0x003a, blocks: (B:12:0x0036, B:25:0x0065, B:27:0x006d, B:33:0x007e, B:34:0x0098), top: B:46:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0060 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object elementAt(kotlinx.coroutines.channels.ReceiveChannel r9, int r10, kotlin.coroutines.Continuation r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18151
            if (r0 == 0) goto L14
            r0 = r11
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18151) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1
            r0.<init>(r11)
        L19:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 46
            r4 = 1
            java.lang.String r5 = "ReceiveChannel doesn't contain element at index "
            if (r2 == 0) goto L45
            if (r2 != r4) goto L3d
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L3a
            goto L65
        L3a:
            r9 = move-exception
            goto Lb4
        L3d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L45:
            kotlin.ResultKt.throwOnFailure(r11)
            if (r10 < 0) goto L9d
            kotlinx.coroutines.channels.ChannelIterator r11 = r9.iterator()     // Catch: java.lang.Throwable -> L99
            r2 = 0
        L4f:
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L99
            r0.L$1 = r11     // Catch: java.lang.Throwable -> L99
            r0.I$0 = r10     // Catch: java.lang.Throwable -> L99
            r0.I$1 = r2     // Catch: java.lang.Throwable -> L99
            r0.label = r4     // Catch: java.lang.Throwable -> L99
            java.lang.Object r6 = r11.hasNext(r0)     // Catch: java.lang.Throwable -> L99
            if (r6 != r1) goto L60
            return r1
        L60:
            r8 = r6
            r6 = r9
            r9 = r2
            r2 = r11
            r11 = r8
        L65:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L3a
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L3a
            if (r11 == 0) goto L7e
            java.lang.Object r11 = r2.next()     // Catch: java.lang.Throwable -> L3a
            int r7 = r9 + 1
            if (r10 != r9) goto L7a
            r9 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r9)
            return r11
        L7a:
            r11 = r2
            r9 = r6
            r2 = r7
            goto L4f
        L7e:
            java.lang.IndexOutOfBoundsException r9 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r11.<init>()     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r11 = r11.append(r5)     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r10 = r11.append(r10)     // Catch: java.lang.Throwable -> L3a
            java.lang.StringBuilder r10 = r10.append(r3)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L3a
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L3a
            throw r9     // Catch: java.lang.Throwable -> L3a
        L99:
            r10 = move-exception
            r6 = r9
            r9 = r10
            goto Lb4
        L9d:
            java.lang.IndexOutOfBoundsException r11 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L99
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L99
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L99
            java.lang.StringBuilder r10 = r0.append(r10)     // Catch: java.lang.Throwable -> L99
            java.lang.StringBuilder r10 = r10.append(r3)     // Catch: java.lang.Throwable -> L99
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L99
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L99
            throw r11     // Catch: java.lang.Throwable -> L99
        Lb4:
            throw r9     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            r10 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.elementAt(kotlinx.coroutines.channels.ReceiveChannel, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0065 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073 A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #0 {all -> 0x0088, blocks: (B:27:0x006b, B:29:0x0073, B:23:0x0055, B:22:0x0050), top: B:43:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:34:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0066 -> B:27:0x006b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object elementAtOrNull(kotlinx.coroutines.channels.ReceiveChannel r8, int r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18161
            if (r0 == 0) goto L14
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18161) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1
            r0.<init>(r10)
        L19:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            int r8 = r0.I$1
            int r9 = r0.I$0
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L3d
            r7 = r2
            r2 = r8
            r8 = r5
            r5 = r1
            r1 = r0
            r0 = r7
            goto L6b
        L3d:
            r8 = move-exception
            goto L8b
        L3f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L47:
            kotlin.ResultKt.throwOnFailure(r10)
            if (r9 >= 0) goto L50
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r4)
            return r4
        L50:
            kotlinx.coroutines.channels.ChannelIterator r10 = r8.iterator()     // Catch: java.lang.Throwable -> L88
            r2 = 0
        L55:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L88
            r0.L$1 = r10     // Catch: java.lang.Throwable -> L88
            r0.I$0 = r9     // Catch: java.lang.Throwable -> L88
            r0.I$1 = r2     // Catch: java.lang.Throwable -> L88
            r0.label = r3     // Catch: java.lang.Throwable -> L88
            java.lang.Object r5 = r10.hasNext(r0)     // Catch: java.lang.Throwable -> L88
            if (r5 != r1) goto L66
            return r1
        L66:
            r7 = r0
            r0 = r10
            r10 = r5
            r5 = r1
            r1 = r7
        L6b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L88
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L88
            if (r10 == 0) goto L84
            java.lang.Object r10 = r0.next()     // Catch: java.lang.Throwable -> L88
            int r6 = r2 + 1
            if (r9 != r2) goto L7f
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r4)
            return r10
        L7f:
            r10 = r0
            r0 = r1
            r1 = r5
            r2 = r6
            goto L55
        L84:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r4)
            return r4
        L88:
            r9 = move-exception
            r5 = r8
            r8 = r9
        L8b:
            throw r8     // Catch: java.lang.Throwable -> L8c
        L8c:
            r9 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.elementAtOrNull(kotlinx.coroutines.channels.ReceiveChannel, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #1 {all -> 0x0032, blocks: (B:12:0x002e, B:23:0x0054, B:25:0x005c, B:28:0x0065, B:29:0x006c), top: B:38:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0065 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #1 {all -> 0x0032, blocks: (B:12:0x002e, B:23:0x0054, B:25:0x005c, B:28:0x0065, B:29:0x006c), top: B:38:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object first(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18221 c18221;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ChannelIterator channelIterator;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18221) {
            c18221 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18221) continuation;
            if ((c18221.label & Integer.MIN_VALUE) != 0) {
                c18221.label -= Integer.MIN_VALUE;
            } else {
                c18221 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18221(continuation);
            }
        } else {
            c18221 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18221(continuation);
        }
        java.lang.Object obj = c18221.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c18221.label;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channelIterator = (kotlinx.coroutines.channels.ChannelIterator) c18221.L$1;
            receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) c18221.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
                if (((java.lang.Boolean) obj).booleanValue()) {
                    throw new java.util.NoSuchElementException("ReceiveChannel is empty.");
                }
                java.lang.Object next = channelIterator.next();
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                return next;
            } catch (java.lang.Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (java.lang.Throwable th3) {
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                    throw th3;
                }
            }
        }
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            kotlinx.coroutines.channels.ChannelIterator it = receiveChannel.iterator();
            c18221.L$0 = receiveChannel;
            c18221.L$1 = it;
            c18221.label = 1;
            java.lang.Object objHasNext = it.hasNext(c18221);
            if (objHasNext == coroutine_suspended) {
                return coroutine_suspended;
            }
            receiveChannel2 = receiveChannel;
            channelIterator = it;
            obj = objHasNext;
            if (((java.lang.Boolean) obj).booleanValue()) {
                throw new java.util.NoSuchElementException("ReceiveChannel is empty.");
            }
            java.lang.Object next2 = channelIterator.next();
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
            return next2;
        } catch (java.lang.Throwable th4) {
            receiveChannel2 = receiveChannel;
            th = th4;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object firstOrNull(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18231 c18231;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ChannelIterator channelIterator;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18231) {
            c18231 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18231) continuation;
            if ((c18231.label & Integer.MIN_VALUE) != 0) {
                c18231.label -= Integer.MIN_VALUE;
            } else {
                c18231 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18231(continuation);
            }
        } else {
            c18231 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18231(continuation);
        }
        java.lang.Object obj = c18231.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c18231.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            try {
                kotlinx.coroutines.channels.ChannelIterator it = receiveChannel.iterator();
                c18231.L$0 = receiveChannel;
                c18231.L$1 = it;
                c18231.label = 1;
                java.lang.Object objHasNext = it.hasNext(c18231);
                if (objHasNext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                receiveChannel2 = receiveChannel;
                channelIterator = it;
                obj = objHasNext;
            } catch (java.lang.Throwable th2) {
                receiveChannel2 = receiveChannel;
                th = th2;
                throw th;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channelIterator = (kotlinx.coroutines.channels.ChannelIterator) c18231.L$1;
            receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) c18231.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (java.lang.Throwable th4) {
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                    throw th4;
                }
            }
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            java.lang.Object next = channelIterator.next();
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
            return next;
        }
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:12:0x0034, B:25:0x0068, B:27:0x0071, B:29:0x007b, B:32:0x0085, B:21:0x0054, B:33:0x008c), top: B:44:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x007b A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #1 {all -> 0x0038, blocks: (B:12:0x0034, B:25:0x0068, B:27:0x0071, B:29:0x007b, B:32:0x0085, B:21:0x0054, B:33:0x008c), top: B:44:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0085 A[Catch: all -> 0x0038, TRY_ENTER, TryCatch #1 {all -> 0x0038, blocks: (B:12:0x0034, B:25:0x0068, B:27:0x0071, B:29:0x007b, B:32:0x0085, B:21:0x0054, B:33:0x008c), top: B:44:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008c A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #1 {all -> 0x0038, blocks: (B:12:0x0034, B:25:0x0068, B:27:0x0071, B:29:0x007b, B:32:0x0085, B:21:0x0054, B:33:0x008c), top: B:44:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0065 -> B:25:0x0068). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object indexOf(kotlinx.coroutines.channels.ReceiveChannel r7, java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18251
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18251) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r7 = r0.L$3
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r2 = r0.L$1
            kotlin.jvm.internal.Ref$IntRef r2 = (kotlin.jvm.internal.Ref.IntRef) r2
            java.lang.Object r4 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L38
            goto L68
        L38:
            r7 = move-exception
            goto L9b
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L43:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.jvm.internal.Ref$IntRef r9 = new kotlin.jvm.internal.Ref$IntRef
            r9.<init>()
            kotlinx.coroutines.channels.ChannelIterator r2 = r7.iterator()     // Catch: java.lang.Throwable -> L97
            r6 = r8
            r8 = r7
            r7 = r2
            r2 = r9
            r9 = r6
        L54:
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L38
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L38
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L38
            r0.L$3 = r7     // Catch: java.lang.Throwable -> L38
            r0.label = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r4 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L38
            if (r4 != r1) goto L65
            return r1
        L65:
            r6 = r4
            r4 = r9
            r9 = r6
        L68:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L38
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L38
            r5 = 0
            if (r9 == 0) goto L8c
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L38
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r9)     // Catch: java.lang.Throwable -> L38
            if (r9 == 0) goto L85
            int r7 = r2.element     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)     // Catch: java.lang.Throwable -> L38
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r5)
            return r7
        L85:
            int r9 = r2.element     // Catch: java.lang.Throwable -> L38
            int r9 = r9 + r3
            r2.element = r9     // Catch: java.lang.Throwable -> L38
            r9 = r4
            goto L54
        L8c:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L38
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r5)
            r7 = -1
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)
            return r7
        L97:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L9b:
            throw r7     // Catch: java.lang.Throwable -> L9c
        L9c:
            r9 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.indexOf(kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:39:0x0093 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0033, B:37:0x008b, B:39:0x0093), top: B:53:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0087 -> B:37:0x008b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object last(kotlinx.coroutines.channels.ReceiveChannel r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18261
            if (r0 == 0) goto L14
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18261) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L51
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r6 = r0.L$2
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L37
            goto L8b
        L37:
            r6 = move-exception
            r2 = r4
            goto La9
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L4f
            goto L69
        L4f:
            r6 = move-exception
            goto La9
        L51:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.channels.ChannelIterator r7 = r6.iterator()     // Catch: java.lang.Throwable -> La6
            r0.L$0 = r6     // Catch: java.lang.Throwable -> La6
            r0.L$1 = r7     // Catch: java.lang.Throwable -> La6
            r0.label = r4     // Catch: java.lang.Throwable -> La6
            java.lang.Object r2 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> La6
            if (r2 != r1) goto L65
            return r1
        L65:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L69:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L4f
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L4f
            if (r7 == 0) goto L9e
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L4f
            r5 = r2
            r2 = r6
            r6 = r5
        L78:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> La6
            r0.L$1 = r2     // Catch: java.lang.Throwable -> La6
            r0.L$2 = r7     // Catch: java.lang.Throwable -> La6
            r0.label = r3     // Catch: java.lang.Throwable -> La6
            java.lang.Object r4 = r2.hasNext(r0)     // Catch: java.lang.Throwable -> La6
            if (r4 != r1) goto L87
            return r1
        L87:
            r5 = r4
            r4 = r6
            r6 = r7
            r7 = r5
        L8b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L37
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L99
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L37
            r6 = r4
            goto L78
        L99:
            r7 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r7)
            return r6
        L9e:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L4f
            java.lang.String r7 = "ReceiveChannel is empty."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4f
            throw r6     // Catch: java.lang.Throwable -> L4f
        La6:
            r7 = move-exception
            r2 = r6
            r6 = r7
        La9:
            throw r6     // Catch: java.lang.Throwable -> Laa
        Laa:
            r7 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.last(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    /* JADX WARN: Code duplicated, block: B:27:0x007e A[Catch: all -> 0x003c, TryCatch #2 {all -> 0x003c, blocks: (B:12:0x0038, B:25:0x0076, B:27:0x007e, B:29:0x0088, B:30:0x008c, B:21:0x0060, B:31:0x0093), top: B:44:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0088 A[Catch: all -> 0x003c, TryCatch #2 {all -> 0x003c, blocks: (B:12:0x0038, B:25:0x0076, B:27:0x007e, B:29:0x0088, B:30:0x008c, B:21:0x0060, B:31:0x0093), top: B:44:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0093 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #2 {all -> 0x003c, blocks: (B:12:0x0038, B:25:0x0076, B:27:0x007e, B:29:0x0088, B:30:0x008c, B:21:0x0060, B:31:0x0093), top: B:44:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0073 -> B:25:0x0076). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object lastIndexOf(kotlinx.coroutines.channels.ReceiveChannel r7, java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18271
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18271) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r7 = r0.L$4
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r2 = r0.L$2
            kotlin.jvm.internal.Ref$IntRef r2 = (kotlin.jvm.internal.Ref.IntRef) r2
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.internal.Ref$IntRef r4 = (kotlin.jvm.internal.Ref.IntRef) r4
            java.lang.Object r5 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L3c
            goto L76
        L3c:
            r7 = move-exception
            goto La4
        L3f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L47:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.jvm.internal.Ref$IntRef r9 = new kotlin.jvm.internal.Ref$IntRef
            r9.<init>()
            r2 = -1
            r9.element = r2
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            kotlinx.coroutines.channels.ChannelIterator r4 = r7.iterator()     // Catch: java.lang.Throwable -> La0
            r6 = r8
            r8 = r7
            r7 = r4
            r4 = r9
            r9 = r6
        L60:
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L3c
            r0.L$1 = r4     // Catch: java.lang.Throwable -> L3c
            r0.L$2 = r2     // Catch: java.lang.Throwable -> L3c
            r0.L$3 = r8     // Catch: java.lang.Throwable -> L3c
            r0.L$4 = r7     // Catch: java.lang.Throwable -> L3c
            r0.label = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r5 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L3c
            if (r5 != r1) goto L73
            return r1
        L73:
            r6 = r5
            r5 = r9
            r9 = r6
        L76:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L93
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L3c
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r9)     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L8c
            int r9 = r2.element     // Catch: java.lang.Throwable -> L3c
            r4.element = r9     // Catch: java.lang.Throwable -> L3c
        L8c:
            int r9 = r2.element     // Catch: java.lang.Throwable -> L3c
            int r9 = r9 + r3
            r2.element = r9     // Catch: java.lang.Throwable -> L3c
            r9 = r5
            goto L60
        L93:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3c
            r7 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r7)
            int r7 = r4.element
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)
            return r7
        La0:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        La4:
            throw r7     // Catch: java.lang.Throwable -> La5
        La5:
            r9 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.lastIndexOf(kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x008c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0098 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #3 {all -> 0x0038, blocks: (B:13:0x0034, B:39:0x0090, B:41:0x0098), top: B:57:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x008c -> B:39:0x0090). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object lastOrNull(kotlinx.coroutines.channels.ReceiveChannel r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18281
            if (r0 == 0) goto L14
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18281) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L52
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r7 = r0.L$2
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L38
            goto L90
        L38:
            r7 = move-exception
            r2 = r4
            goto La5
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L44:
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L50
            goto L6a
        L50:
            r7 = move-exception
            goto La5
        L52:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r7.iterator()     // Catch: java.lang.Throwable -> La2
            r0.L$0 = r7     // Catch: java.lang.Throwable -> La2
            r0.L$1 = r8     // Catch: java.lang.Throwable -> La2
            r0.label = r4     // Catch: java.lang.Throwable -> La2
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> La2
            if (r2 != r1) goto L66
            return r1
        L66:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L6a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L50
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L50
            if (r8 != 0) goto L76
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r5)
            return r5
        L76:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L50
            r6 = r2
            r2 = r7
            r7 = r6
        L7d:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> La2
            r0.L$1 = r2     // Catch: java.lang.Throwable -> La2
            r0.L$2 = r8     // Catch: java.lang.Throwable -> La2
            r0.label = r3     // Catch: java.lang.Throwable -> La2
            java.lang.Object r4 = r2.hasNext(r0)     // Catch: java.lang.Throwable -> La2
            if (r4 != r1) goto L8c
            return r1
        L8c:
            r6 = r4
            r4 = r7
            r7 = r8
            r8 = r6
        L90:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L38
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r8 == 0) goto L9e
            java.lang.Object r8 = r2.next()     // Catch: java.lang.Throwable -> L38
            r7 = r4
            goto L7d
        L9e:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r5)
            return r7
        La2:
            r8 = move-exception
            r2 = r7
            r7 = r8
        La5:
            throw r7     // Catch: java.lang.Throwable -> La6
        La6:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.lastOrNull(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006d A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #2 {all -> 0x004b, blocks: (B:20:0x0047, B:29:0x0065, B:31:0x006d, B:41:0x0097, B:42:0x009e), top: B:53:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0097 A[Catch: all -> 0x004b, TRY_ENTER, TryCatch #2 {all -> 0x004b, blocks: (B:20:0x0047, B:29:0x0065, B:31:0x006d, B:41:0x0097, B:42:0x009e), top: B:53:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object single(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18351 c18351;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ChannelIterator channelIterator;
        java.lang.Object next;
        java.lang.Object objHasNext;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel3;
        java.lang.Object obj;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18351) {
            c18351 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18351) continuation;
            if ((c18351.label & Integer.MIN_VALUE) != 0) {
                c18351.label -= Integer.MIN_VALUE;
            } else {
                c18351 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18351(continuation);
            }
        } else {
            c18351 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18351(continuation);
        }
        java.lang.Object obj2 = c18351.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c18351.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj2);
            try {
                kotlinx.coroutines.channels.ChannelIterator it = receiveChannel.iterator();
                c18351.L$0 = receiveChannel;
                c18351.L$1 = it;
                c18351.label = 1;
                java.lang.Object objHasNext2 = it.hasNext(c18351);
                if (objHasNext2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                receiveChannel2 = receiveChannel;
                channelIterator = it;
                obj2 = objHasNext2;
                if (((java.lang.Boolean) obj2).booleanValue()) {
                    throw new java.util.NoSuchElementException("ReceiveChannel is empty.");
                }
                next = channelIterator.next();
                c18351.L$0 = receiveChannel2;
                c18351.L$1 = next;
                c18351.label = 2;
                objHasNext = channelIterator.hasNext(c18351);
                if (objHasNext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                receiveChannel3 = receiveChannel2;
                obj2 = objHasNext;
                obj = next;
            } catch (java.lang.Throwable th2) {
                receiveChannel2 = receiveChannel;
                th = th2;
                throw th;
            }
        } else if (i == 1) {
            channelIterator = (kotlinx.coroutines.channels.ChannelIterator) c18351.L$1;
            receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) c18351.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(obj2);
                if (((java.lang.Boolean) obj2).booleanValue()) {
                    throw new java.util.NoSuchElementException("ReceiveChannel is empty.");
                }
                next = channelIterator.next();
                c18351.L$0 = receiveChannel2;
                c18351.L$1 = next;
                c18351.label = 2;
                objHasNext = channelIterator.hasNext(c18351);
                if (objHasNext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                receiveChannel3 = receiveChannel2;
                obj2 = objHasNext;
                obj = next;
            } catch (java.lang.Throwable th3) {
                th = th3;
                throw th;
            }
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = c18351.L$1;
            receiveChannel3 = (kotlinx.coroutines.channels.ReceiveChannel) c18351.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(obj2);
            } catch (java.lang.Throwable th4) {
                th = th4;
                receiveChannel2 = receiveChannel3;
                try {
                    throw th;
                } catch (java.lang.Throwable th5) {
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                    throw th5;
                }
            }
        }
        if (((java.lang.Boolean) obj2).booleanValue()) {
            throw new java.lang.IllegalArgumentException("ReceiveChannel has more than one element.");
        }
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel3, null);
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object singleOrNull(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18361 c18361;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ChannelIterator channelIterator;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel3;
        java.lang.Object obj;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18361) {
            c18361 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18361) continuation;
            if ((c18361.label & Integer.MIN_VALUE) != 0) {
                c18361.label -= Integer.MIN_VALUE;
            } else {
                c18361 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18361(continuation);
            }
        } else {
            c18361 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18361(continuation);
        }
        java.lang.Object obj2 = c18361.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c18361.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj2);
            try {
                kotlinx.coroutines.channels.ChannelIterator it = receiveChannel.iterator();
                c18361.L$0 = receiveChannel;
                c18361.L$1 = it;
                c18361.label = 1;
                java.lang.Object objHasNext = it.hasNext(c18361);
                if (objHasNext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                receiveChannel2 = receiveChannel;
                channelIterator = it;
                obj2 = objHasNext;
            } catch (java.lang.Throwable th2) {
                receiveChannel2 = receiveChannel;
                th = th2;
                throw th;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = c18361.L$1;
                receiveChannel3 = (kotlinx.coroutines.channels.ReceiveChannel) c18361.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    if (((java.lang.Boolean) obj2).booleanValue()) {
                        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel3, null);
                        return null;
                    }
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel3, null);
                    return obj;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    receiveChannel2 = receiveChannel3;
                    try {
                        throw th;
                    } catch (java.lang.Throwable th4) {
                        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                        throw th4;
                    }
                }
            }
            channelIterator = (kotlinx.coroutines.channels.ChannelIterator) c18361.L$1;
            receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) c18361.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(obj2);
            } catch (java.lang.Throwable th5) {
                th = th5;
                throw th;
            }
        }
        if (((java.lang.Boolean) obj2).booleanValue()) {
            java.lang.Object next = channelIterator.next();
            c18361.L$0 = receiveChannel2;
            c18361.L$1 = next;
            c18361.label = 2;
            java.lang.Object objHasNext2 = channelIterator.hasNext(c18361);
            if (objHasNext2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            receiveChannel3 = receiveChannel2;
            obj2 = objHasNext2;
            obj = next;
            if (((java.lang.Boolean) obj2).booleanValue()) {
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel3, null);
                return null;
            }
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel3, null);
            return obj;
        }
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
        return null;
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", f = "Deprecated.kt", i = {0, 0, 1, 2}, l = {org.objectweb.asm.Opcodes.IF_ICMPLE, org.objectweb.asm.Opcodes.RET, org.objectweb.asm.Opcodes.TABLESWITCH}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, s = {"L$0", "I$0", "L$0", "L$0"})
    static final class C18131<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ int $n;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_drop;
        int I$0;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C18131(int i, kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18131> continuation) {
            super(2, continuation);
            this.$n = i;
            this.$this_drop = receiveChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18131 c18131 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18131(this.$n, this.$this_drop, continuation);
            c18131.L$0 = obj;
            return c18131;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18131) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0079 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:22:0x007a  */
        /* JADX WARN: Code duplicated, block: B:25:0x0089  */
        /* JADX WARN: Code duplicated, block: B:28:0x0091  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007a -> B:23:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d1 -> B:32:0x00a2). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 245
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18131.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel drop$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, int i, kotlin.coroutines.CoroutineContext coroutineContext, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return drop(receiveChannel, i, coroutineContext);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel drop(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, int i, kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, 0, null, kotlinx.coroutines.channels.ChannelsKt.consumes(receiveChannel), new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18131(i, receiveChannel, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel dropWhile$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return dropWhile(receiveChannel, coroutineContext, function2);
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2, 3, 4}, l = {org.objectweb.asm.Opcodes.PUTFIELD, org.objectweb.asm.Opcodes.INVOKEVIRTUAL, org.objectweb.asm.Opcodes.INVOKESPECIAL, org.objectweb.asm.Opcodes.NEW, 188}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
    static final class C18141<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_dropWhile;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C18141(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18141> continuation) {
            super(2, continuation);
            this.$this_dropWhile = receiveChannel;
            this.$predicate = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18141 c18141 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18141(this.$this_dropWhile, this.$predicate, continuation);
            c18141.L$0 = obj;
            return c18141;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18141) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0091 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x0092  */
        /* JADX WARN: Code duplicated, block: B:23:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:25:0x00b4 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:29:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:33:0x00d5  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v2 */
        /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlinx.coroutines.channels.ProducerScope] */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5 */
        /* JADX WARN: Type inference failed for: r10v6 */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r8v0 */
        /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v20 */
        /* JADX WARN: Type inference failed for: r9v5 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v8 */
        /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, kotlinx.coroutines.channels.ProducerScope] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b5 -> B:27:0x00b9). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x010f -> B:35:0x00e0). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 276
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18141.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel dropWhile(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, 0, null, kotlinx.coroutines.channels.ChannelsKt.consumes(receiveChannel), new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18141(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filter$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return kotlinx.coroutines.channels.ChannelsKt.filter(receiveChannel, coroutineContext, function2);
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {org.objectweb.asm.Opcodes.IFNULL, org.objectweb.asm.Opcodes.IFNONNULL, org.objectweb.asm.Opcodes.IFNONNULL}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    static final class C18171<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_filter;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C18171(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18171> continuation) {
            super(2, continuation);
            this.$this_filter = receiveChannel;
            this.$predicate = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18171 c18171 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18171(this.$this_filter, this.$predicate, continuation);
            c18171.L$0 = obj;
            return c18171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18171) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0069 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x006a  */
        /* JADX WARN: Code duplicated, block: B:20:0x0078  */
        /* JADX WARN: Code duplicated, block: B:22:0x008c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x008d  */
        /* JADX WARN: Code duplicated, block: B:26:0x0099  */
        /* JADX WARN: Code duplicated, block: B:28:0x00aa A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x00ab  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlinx.coroutines.channels.ProducerScope] */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v4 */
        /* JADX WARN: Type inference failed for: r9v0 */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L49
                if (r1 == r5) goto L39
                if (r1 == r4) goto L26
                if (r1 != r3) goto L1e
                java.lang.Object r1 = r10.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r6 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlin.ResultKt.throwOnFailure(r11)
                goto L57
            L1e:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L26:
                java.lang.Object r1 = r10.L$2
                java.lang.Object r6 = r10.L$1
                kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
                java.lang.Object r7 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                kotlin.ResultKt.throwOnFailure(r11)
                r8 = r7
                r7 = r1
                r1 = r0
                r0 = r10
                goto L91
            L39:
                java.lang.Object r1 = r10.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r6 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlin.ResultKt.throwOnFailure(r11)
                r7 = r6
                r6 = r1
                r1 = r0
                r0 = r10
                goto L70
            L49:
                kotlin.ResultKt.throwOnFailure(r11)
                java.lang.Object r11 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r11 = (kotlinx.coroutines.channels.ProducerScope) r11
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r10.$this_filter
                kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
                r6 = r11
            L57:
                r11 = r10
            L58:
                r7 = r11
                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                r11.L$0 = r6
                r11.L$1 = r1
                r11.L$2 = r2
                r11.label = r5
                java.lang.Object r7 = r1.hasNext(r7)
                if (r7 != r0) goto L6a
                return r0
            L6a:
                r9 = r0
                r0 = r11
                r11 = r7
                r7 = r6
                r6 = r1
                r1 = r9
            L70:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lb0
                java.lang.Object r11 = r6.next()
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r8 = r0.$predicate
                r0.L$0 = r7
                r0.L$1 = r6
                r0.L$2 = r11
                r0.label = r4
                java.lang.Object r8 = r8.invoke(r11, r0)
                if (r8 != r1) goto L8d
                return r1
            L8d:
                r9 = r7
                r7 = r11
                r11 = r8
                r8 = r9
            L91:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lab
                r11 = r0
                kotlin.coroutines.Continuation r11 = (kotlin.coroutines.Continuation) r11
                r0.L$0 = r8
                r0.L$1 = r6
                r0.L$2 = r2
                r0.label = r3
                java.lang.Object r11 = r8.send(r7, r11)
                if (r11 != r1) goto Lab
                return r1
            Lab:
                r11 = r0
                r0 = r1
                r1 = r6
                r6 = r8
                goto L58
            Lb0:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18171.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> filter(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, 0, null, kotlinx.coroutines.channels.ChannelsKt.consumes(receiveChannel), new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18171(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterIndexed$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function3 function3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return filterIndexed(receiveChannel, coroutineContext, function3);
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {211, 212, 212}, m = "invokeSuspend", n = {"$this$produce", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "$this$produce", "e", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "$this$produce", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX}, s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
    static final class C18181<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_filterIndexed;
        int I$0;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C18181(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18181> continuation) {
            super(2, continuation);
            this.$this_filterIndexed = receiveChannel;
            this.$predicate = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18181 c18181 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18181(this.$this_filterIndexed, this.$predicate, continuation);
            c18181.L$0 = obj;
            return c18181;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18181) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0079 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x007a  */
        /* JADX WARN: Code duplicated, block: B:20:0x0089  */
        /* JADX WARN: Code duplicated, block: B:22:0x00a5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:28:0x00c5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x00c6  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v15, types: [kotlinx.coroutines.channels.ProducerScope] */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlinx.coroutines.channels.ProducerScope] */
        /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v10 */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v9 */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 206
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18181.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterIndexed(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function3 function3) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, 0, null, kotlinx.coroutines.channels.ChannelsKt.consumes(receiveChannel), new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18181(receiveChannel, function3, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterNot$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return filterNot(receiveChannel, coroutineContext, function2);
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", f = "Deprecated.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
    static final class C18191<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;
        /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C18191(kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18191> continuation) {
            super(2, continuation);
            this.$predicate = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18191 c18191 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18191(this.$predicate, continuation);
            c18191.L$0 = obj;
            return c18191;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(E e, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18191) create(e, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1<E> for r3v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r4)
                goto L27
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.ResultKt.throwOnFailure(r4)
                java.lang.Object r4 = r3.L$0
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r1 = r3.$predicate
                r3.label = r2
                java.lang.Object r4 = r1.invoke(r4, r3)
                if (r4 != r0) goto L27
                return r0
            L27:
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                r4 = r4 ^ r2
                java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18191.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterNot(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2) {
        return kotlinx.coroutines.channels.ChannelsKt.filter(receiveChannel, coroutineContext, new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18191(function2, null));
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0002H\u008a@"}, d2 = {"<anonymous>", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C18201<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        /* synthetic */ java.lang.Object L$0;
        int label;

        C18201(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18201> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18201 c18201 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18201(continuation);
            c18201.L$0 = obj;
            return c18201;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(E e, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18201) create(e, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.L$0 != null);
        }
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> filterNotNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel) {
        kotlinx.coroutines.channels.ReceiveChannel<E> receiveChannelFilter$default = filter$default(receiveChannel, null, new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18201(null), 1, null);
        kotlin.jvm.internal.Intrinsics.checkNotNull(receiveChannelFilter$default, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNull>");
        return receiveChannelFilter$default;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x0032, B:25:0x005d, B:27:0x0065, B:29:0x006b, B:21:0x004b, B:31:0x0070), top: B:40:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x006b A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x0032, B:25:0x005d, B:27:0x0065, B:29:0x006b, B:21:0x004b, B:31:0x0070), top: B:40:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0070 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x0032, B:25:0x005d, B:27:0x0065, B:29:0x006b, B:21:0x004b, B:31:0x0070), top: B:40:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005a -> B:25:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel r5, java.util.Collection r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18211
            if (r0 == 0) goto L14
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18211) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r2 = r0.L$0
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L36
            goto L5d
        L36:
            r5 = move-exception
            goto L7b
        L38:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L40:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> L77
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4b:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L36
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L36
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L36
            r0.label = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L36
            if (r2 != r1) goto L5a
            return r1
        L5a:
            r4 = r2
            r2 = r7
            r7 = r4
        L5d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L36
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r7 == 0) goto L70
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L36
            if (r7 == 0) goto L6e
            r2.add(r7)     // Catch: java.lang.Throwable -> L36
        L6e:
            r7 = r2
            goto L4b
        L70:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L36
            r5 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            return r2
        L77:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L7b:
            throw r5     // Catch: java.lang.Throwable -> L7c
        L7c:
            r7 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0068 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:13:0x0035, B:28:0x006e, B:30:0x0076, B:32:0x007c, B:36:0x008f, B:18:0x004d), top: B:45:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007c A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:13:0x0035, B:28:0x006e, B:30:0x0076, B:32:0x007c, B:36:0x008f, B:18:0x004d), top: B:45:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x008f A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:13:0x0035, B:28:0x006e, B:30:0x0076, B:32:0x007c, B:36:0x008f, B:18:0x004d), top: B:45:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007a -> B:35:0x008b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0088 -> B:35:0x008b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel r6, kotlinx.coroutines.channels.SendChannel r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass3
            if (r0 == 0) goto L14
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L53
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r2 = (kotlinx.coroutines.channels.SendChannel) r2
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L51
            goto L8b
        L39:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L41:
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r2 = (kotlinx.coroutines.channels.SendChannel) r2
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L51
            goto L6e
        L51:
            r6 = move-exception
            goto L9a
        L53:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L96
        L5a:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L96
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L96
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L96
            r0.label = r4     // Catch: java.lang.Throwable -> L96
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L96
            if (r2 != r1) goto L69
            return r1
        L69:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r2
            r2 = r5
        L6e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L51
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L51
            if (r8 == 0) goto L8f
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L51
            if (r8 == 0) goto L8b
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L51
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L51
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L51
            r0.label = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r8 = r2.send(r8, r0)     // Catch: java.lang.Throwable -> L51
            if (r8 != r1) goto L8b
            return r1
        L8b:
            r8 = r6
            r6 = r7
            r7 = r2
            goto L5a
        L8f:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L51
            r6 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            return r2
        L96:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L9a:
            throw r6     // Catch: java.lang.Throwable -> L9b
        L9b:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {254, 255}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "remaining"}, s = {"L$0", "I$0", "L$0", "I$0"})
    static final class C18371<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ int $n;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_take;
        int I$0;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C18371(int i, kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18371> continuation) {
            super(2, continuation);
            this.$n = i;
            this.$this_take = receiveChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18371 c18371 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18371(this.$n, this.$this_take, continuation);
            c18371.L$0 = obj;
            return c18371;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18371) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0063 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:22:0x0064  */
        /* JADX WARN: Code duplicated, block: B:25:0x0070  */
        /* JADX WARN: Code duplicated, block: B:27:0x0085 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:28:0x0086  */
        /* JADX WARN: Code duplicated, block: B:31:0x008c  */
        /* JADX WARN: Code duplicated, block: B:33:0x008f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0086 -> B:29:0x0088). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L36
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                int r1 = r9.I$0
                java.lang.Object r4 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r10)
                r10 = r5
                r5 = r9
                goto L88
            L1f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L27:
                int r1 = r9.I$0
                java.lang.Object r4 = r9.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r10)
                r6 = r9
                goto L68
            L36:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.L$0
                kotlinx.coroutines.channels.ProducerScope r10 = (kotlinx.coroutines.channels.ProducerScope) r10
                int r1 = r9.$n
                if (r1 != 0) goto L44
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            L44:
                if (r1 < 0) goto L48
                r4 = r3
                goto L49
            L48:
                r4 = 0
            L49:
                if (r4 == 0) goto L92
                kotlinx.coroutines.channels.ReceiveChannel<E> r4 = r9.$this_take
                kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
                r5 = r9
            L52:
                r6 = r5
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r5.L$0 = r10
                r5.L$1 = r4
                r5.I$0 = r1
                r5.label = r3
                java.lang.Object r6 = r4.hasNext(r6)
                if (r6 != r0) goto L64
                return r0
            L64:
                r8 = r5
                r5 = r10
                r10 = r6
                r6 = r8
            L68:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L8f
                java.lang.Object r10 = r4.next()
                r7 = r6
                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                r6.L$0 = r5
                r6.L$1 = r4
                r6.I$0 = r1
                r6.label = r2
                java.lang.Object r10 = r5.send(r10, r7)
                if (r10 != r0) goto L86
                return r0
            L86:
                r10 = r5
                r5 = r6
            L88:
                int r1 = r1 + (-1)
                if (r1 != 0) goto L52
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            L8f:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            L92:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                java.lang.String r0 = "Requested element count "
                r10.<init>(r0)
                java.lang.StringBuilder r10 = r10.append(r1)
                java.lang.String r0 = " is less than zero."
                java.lang.StringBuilder r10 = r10.append(r0)
                java.lang.String r10 = r10.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r10 = r10.toString()
                r0.<init>(r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18371.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel take$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, int i, kotlin.coroutines.CoroutineContext coroutineContext, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return take(receiveChannel, i, coroutineContext);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel take(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, int i, kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, 0, null, kotlinx.coroutines.channels.ChannelsKt.consumes(receiveChannel), new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18371(i, receiveChannel, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel takeWhile$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return takeWhile(receiveChannel, coroutineContext, function2);
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {269, 270, 271}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    static final class C18381<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_takeWhile;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C18381(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18381> continuation) {
            super(2, continuation);
            this.$this_takeWhile = receiveChannel;
            this.$predicate = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18381 c18381 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18381(this.$this_takeWhile, this.$predicate, continuation);
            c18381.L$0 = obj;
            return c18381;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18381) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0067 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x0068  */
        /* JADX WARN: Code duplicated, block: B:20:0x0076  */
        /* JADX WARN: Code duplicated, block: B:22:0x008a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x008b  */
        /* JADX WARN: Code duplicated, block: B:26:0x0098  */
        /* JADX WARN: Code duplicated, block: B:28:0x009b  */
        /* JADX WARN: Code duplicated, block: B:30:0x00ad A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v17 */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v6 */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlinx.coroutines.channels.ProducerScope] */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ae -> B:14:0x0058). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L49
                if (r1 == r4) goto L39
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r10.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r5 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r11)
                goto L57
            L1d:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L25:
                java.lang.Object r1 = r10.L$2
                java.lang.Object r5 = r10.L$1
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r6 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlin.ResultKt.throwOnFailure(r11)
                r7 = r6
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r10
                goto L90
            L39:
                java.lang.Object r1 = r10.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r5 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r11)
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r10
                goto L6e
            L49:
                kotlin.ResultKt.throwOnFailure(r11)
                java.lang.Object r11 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r11 = (kotlinx.coroutines.channels.ProducerScope) r11
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r10.$this_takeWhile
                kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
                r5 = r11
            L57:
                r11 = r10
            L58:
                r6 = r11
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r11.L$0 = r5
                r11.L$1 = r1
                r11.label = r4
                java.lang.Object r6 = r1.hasNext(r6)
                if (r6 != r0) goto L68
                return r0
            L68:
                r9 = r0
                r0 = r11
                r11 = r6
                r6 = r5
                r5 = r1
                r1 = r9
            L6e:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lb3
                java.lang.Object r11 = r5.next()
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r7 = r0.$predicate
                r0.L$0 = r6
                r0.L$1 = r5
                r0.L$2 = r11
                r0.label = r3
                java.lang.Object r7 = r7.invoke(r11, r0)
                if (r7 != r1) goto L8b
                return r1
            L8b:
                r9 = r5
                r5 = r11
                r11 = r7
                r7 = r6
                r6 = r9
            L90:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 != 0) goto L9b
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            L9b:
                r11 = r0
                kotlin.coroutines.Continuation r11 = (kotlin.coroutines.Continuation) r11
                r0.L$0 = r7
                r0.L$1 = r6
                r8 = 0
                r0.L$2 = r8
                r0.label = r2
                java.lang.Object r11 = r7.send(r5, r11)
                if (r11 != r1) goto Lae
                return r1
            Lae:
                r11 = r0
                r0 = r1
                r1 = r6
                r5 = r7
                goto L58
            Lb3:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18381.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel takeWhile(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, 0, null, kotlinx.coroutines.channels.ChannelsKt.consumes(receiveChannel), new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18381(receiveChannel, function2, null), 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0079 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0035, B:28:0x0071, B:30:0x0079, B:33:0x008c, B:18:0x0050), top: B:44:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r7v0, types: [C extends kotlinx.coroutines.channels.SendChannel<? super E>] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0089 -> B:14:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final <E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> java.lang.Object toChannel(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r6, C r7, kotlin.coroutines.Continuation<? super C> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18391
            if (r0 == 0) goto L14
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18391) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L56
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r2 = (kotlinx.coroutines.channels.SendChannel) r2
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L54
        L38:
            r8 = r6
            r6 = r7
            r7 = r2
            goto L5d
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L44:
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r2 = (kotlinx.coroutines.channels.SendChannel) r2
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L54
            goto L71
        L54:
            r6 = move-exception
            goto L97
        L56:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L93
        L5d:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L93
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L93
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L93
            r0.label = r4     // Catch: java.lang.Throwable -> L93
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L93
            if (r2 != r1) goto L6c
            return r1
        L6c:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r2
            r2 = r5
        L71:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L54
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L54
            if (r8 == 0) goto L8c
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L54
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L54
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L54
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L54
            r0.label = r3     // Catch: java.lang.Throwable -> L54
            java.lang.Object r8 = r2.send(r8, r0)     // Catch: java.lang.Throwable -> L54
            if (r8 != r1) goto L38
            return r1
        L8c:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L54
            r6 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            return r2
        L93:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L97:
            throw r6     // Catch: java.lang.Throwable -> L98
        L98:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toChannel(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x0032, B:25:0x005d, B:27:0x0065, B:21:0x004b, B:28:0x006e), top: B:39:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005a -> B:25:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object toCollection(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r5, C r6, kotlin.coroutines.Continuation<? super C> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18401
            if (r0 == 0) goto L14
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18401) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r2 = r0.L$0
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L36
            goto L5d
        L36:
            r5 = move-exception
            goto L79
        L38:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L40:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> L75
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4b:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L36
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L36
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L36
            r0.label = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L36
            if (r2 != r1) goto L5a
            return r1
        L5a:
            r4 = r2
            r2 = r7
            r7 = r4
        L5d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L36
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r7 == 0) goto L6e
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L36
            r2.add(r7)     // Catch: java.lang.Throwable -> L36
            r7 = r2
            goto L4b
        L6e:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L36
            r5 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            return r2
        L75:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L79:
            throw r5     // Catch: java.lang.Throwable -> L7a
        L7a:
            r7 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toCollection(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x0032, B:25:0x005d, B:27:0x0065, B:21:0x004b, B:28:0x0078), top: B:39:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005a -> B:25:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object toMap(kotlinx.coroutines.channels.ReceiveChannel<? extends kotlin.Pair<? extends K, ? extends V>> r6, M r7, kotlin.coroutines.Continuation<? super M> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass2
            if (r0 == 0) goto L14
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            java.util.Map r2 = (java.util.Map) r2
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L36
            goto L5d
        L36:
            r6 = move-exception
            goto L83
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L7f
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L4b:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L36
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L36
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L36
            r0.label = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L36
            if (r2 != r1) goto L5a
            return r1
        L5a:
            r5 = r2
            r2 = r8
            r8 = r5
        L5d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L36
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r8 == 0) goto L78
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L36
            kotlin.Pair r8 = (kotlin.Pair) r8     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = r8.getFirst()     // Catch: java.lang.Throwable -> L36
            java.lang.Object r8 = r8.getSecond()     // Catch: java.lang.Throwable -> L36
            r2.put(r4, r8)     // Catch: java.lang.Throwable -> L36
            r8 = r2
            goto L4b
        L78:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L36
            r6 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            return r2
        L7f:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L83:
            throw r6     // Catch: java.lang.Throwable -> L84
        L84:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toMap(kotlinx.coroutines.channels.ReceiveChannel, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel flatMap$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return flatMap(receiveChannel, coroutineContext, function2);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", i = {0, 1, 2}, l = {321, 322, 322}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    static final class C18241<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_flatMap;
        final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ReceiveChannel<? extends R>>, java.lang.Object> $transform;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C18241(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ReceiveChannel<? extends R>>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18241> continuation) {
            super(2, continuation);
            this.$this_flatMap = receiveChannel;
            this.$transform = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18241 c18241 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18241(this.$this_flatMap, this.$transform, continuation);
            c18241.L$0 = obj;
            return c18241;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super R> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18241) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0063 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x0064  */
        /* JADX WARN: Code duplicated, block: B:20:0x0072  */
        /* JADX WARN: Code duplicated, block: B:22:0x0084 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x0099 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x009a  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009a -> B:14:0x0054). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L45
                if (r1 == r4) goto L35
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r10.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r5 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r11)
                goto L53
            L1d:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L25:
                java.lang.Object r1 = r10.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r5 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r11)
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r10
                goto L85
            L35:
                java.lang.Object r1 = r10.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r5 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r11)
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r10
                goto L6a
            L45:
                kotlin.ResultKt.throwOnFailure(r11)
                java.lang.Object r11 = r10.L$0
                kotlinx.coroutines.channels.ProducerScope r11 = (kotlinx.coroutines.channels.ProducerScope) r11
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r10.$this_flatMap
                kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
                r5 = r11
            L53:
                r11 = r10
            L54:
                r6 = r11
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r11.L$0 = r5
                r11.L$1 = r1
                r11.label = r4
                java.lang.Object r6 = r1.hasNext(r6)
                if (r6 != r0) goto L64
                return r0
            L64:
                r9 = r0
                r0 = r11
                r11 = r6
                r6 = r5
                r5 = r1
                r1 = r9
            L6a:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto L9f
                java.lang.Object r11 = r5.next()
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ReceiveChannel<? extends R>>, java.lang.Object> r7 = r0.$transform
                r0.L$0 = r6
                r0.L$1 = r5
                r0.label = r3
                java.lang.Object r11 = r7.invoke(r11, r0)
                if (r11 != r1) goto L85
                return r1
            L85:
                kotlinx.coroutines.channels.ReceiveChannel r11 = (kotlinx.coroutines.channels.ReceiveChannel) r11
                r7 = r6
                kotlinx.coroutines.channels.SendChannel r7 = (kotlinx.coroutines.channels.SendChannel) r7
                r8 = r0
                kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                r0.L$0 = r6
                r0.L$1 = r5
                r0.label = r2
                java.lang.Object r11 = kotlinx.coroutines.channels.ChannelsKt.toChannel(r11, r7, r8)
                if (r11 != r1) goto L9a
                return r1
            L9a:
                r11 = r0
                r0 = r1
                r1 = r5
                r5 = r6
                goto L54
            L9f:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18241.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel flatMap(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, 0, null, kotlinx.coroutines.channels.ChannelsKt.consumes(receiveChannel), new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18241(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel map$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return kotlinx.coroutines.channels.ChannelsKt.map(receiveChannel, coroutineContext, function2);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {487, 333, 333}, m = "invokeSuspend", n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
    static final class C18291<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_map;
        final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C18291(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18291> continuation) {
            super(2, continuation);
            this.$this_map = receiveChannel;
            this.$transform = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18291 c18291 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18291(this.$this_map, this.$transform, continuation);
            c18291.L$0 = obj;
            return c18291;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super R> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18291) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0086 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x0087  */
        /* JADX WARN: Code duplicated, block: B:28:0x0093 A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #0 {all -> 0x00d1, blocks: (B:8:0x0022, B:22:0x0076, B:26:0x008b, B:28:0x0093, B:36:0x00c9, B:18:0x005e, B:21:0x006e), top: B:44:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:30:0x00a9 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:35:0x00c3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c3 -> B:22:0x0076). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18291.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <E, R> kotlinx.coroutines.channels.ReceiveChannel<R> map(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, 0, null, kotlinx.coroutines.channels.ChannelsKt.consumes(receiveChannel), new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18291(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapIndexed$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function3 function3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return kotlinx.coroutines.channels.ChannelsKt.mapIndexed(receiveChannel, coroutineContext, function3);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {344, 345, 345}, m = "invokeSuspend", n = {"$this$produce", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "$this$produce", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "$this$produce", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    static final class C18301<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_mapIndexed;
        final /* synthetic */ kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
        int I$0;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C18301(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18301> continuation) {
            super(2, continuation);
            this.$this_mapIndexed = receiveChannel;
            this.$transform = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18301 c18301 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18301(this.$this_mapIndexed, this.$transform, continuation);
            c18301.L$0 = obj;
            return c18301;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super R> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18301) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x006f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x0070  */
        /* JADX WARN: Code duplicated, block: B:19:0x007c  */
        /* JADX WARN: Code duplicated, block: B:21:0x0098 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:22:0x0099  */
        /* JADX WARN: Code duplicated, block: B:25:0x00b2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x00b3  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b3 -> B:13:0x005e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L4c
                if (r1 == r4) goto L3d
                if (r1 == r3) goto L29
                if (r1 != r2) goto L21
                int r1 = r12.I$0
                java.lang.Object r5 = r12.L$1
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r6 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlin.ResultKt.throwOnFailure(r13)
                r13 = r6
                r6 = r12
                goto L5e
            L21:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L29:
                int r1 = r12.I$0
                java.lang.Object r5 = r12.L$2
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                java.lang.Object r6 = r12.L$1
                kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
                java.lang.Object r7 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                kotlin.ResultKt.throwOnFailure(r13)
                r8 = r12
                goto L9e
            L3d:
                int r1 = r12.I$0
                java.lang.Object r5 = r12.L$1
                kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
                java.lang.Object r6 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
                kotlin.ResultKt.throwOnFailure(r13)
                r7 = r12
                goto L74
            L4c:
                kotlin.ResultKt.throwOnFailure(r13)
                java.lang.Object r13 = r12.L$0
                kotlinx.coroutines.channels.ProducerScope r13 = (kotlinx.coroutines.channels.ProducerScope) r13
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r12.$this_mapIndexed
                kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
                r5 = 0
                r6 = r12
                r11 = r5
                r5 = r1
                r1 = r11
            L5e:
                r7 = r6
                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                r6.L$0 = r13
                r6.L$1 = r5
                r6.I$0 = r1
                r6.label = r4
                java.lang.Object r7 = r5.hasNext(r7)
                if (r7 != r0) goto L70
                return r0
            L70:
                r11 = r6
                r6 = r13
                r13 = r7
                r7 = r11
            L74:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lb7
                java.lang.Object r13 = r5.next()
                kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r8 = r7.$transform
                int r9 = r1 + 1
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
                r7.L$0 = r6
                r7.L$1 = r5
                r7.L$2 = r6
                r7.I$0 = r9
                r7.label = r3
                java.lang.Object r13 = r8.invoke(r1, r13, r7)
                if (r13 != r0) goto L99
                return r0
            L99:
                r8 = r7
                r1 = r9
                r7 = r6
                r6 = r5
                r5 = r7
            L9e:
                r9 = r8
                kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
                r8.L$0 = r7
                r8.L$1 = r6
                r10 = 0
                r8.L$2 = r10
                r8.I$0 = r1
                r8.label = r2
                java.lang.Object r13 = r5.send(r13, r9)
                if (r13 != r0) goto Lb3
                return r0
            Lb3:
                r5 = r6
                r13 = r7
                r6 = r8
                goto L5e
            Lb7:
                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18301.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <E, R> kotlinx.coroutines.channels.ReceiveChannel<R> mapIndexed(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, 0, null, kotlinx.coroutines.channels.ChannelsKt.consumes(receiveChannel), new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18301(receiveChannel, function3, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapIndexedNotNull$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function3 function3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return mapIndexedNotNull(receiveChannel, coroutineContext, function3);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapIndexedNotNull(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function3 function3) {
        return kotlinx.coroutines.channels.ChannelsKt.filterNotNull(kotlinx.coroutines.channels.ChannelsKt.mapIndexed(receiveChannel, coroutineContext, function3));
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapNotNull$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return mapNotNull(receiveChannel, coroutineContext, function2);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapNotNull(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2) {
        return kotlinx.coroutines.channels.ChannelsKt.filterNotNull(kotlinx.coroutines.channels.ChannelsKt.map(receiveChannel, coroutineContext, function2));
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/collections/IndexedValue;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {370, 371}, m = "invokeSuspend", n = {"$this$produce", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "$this$produce", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX}, s = {"L$0", "I$0", "L$0", "I$0"})
    static final class C18411<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super kotlin.collections.IndexedValue<? extends E>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_withIndex;
        int I$0;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C18411(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18411> continuation) {
            super(2, continuation);
            this.$this_withIndex = receiveChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18411 c18411 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18411(this.$this_withIndex, continuation);
            c18411.L$0 = obj;
            return c18411;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super kotlin.collections.IndexedValue<? extends E>> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18411) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0058 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0059  */
        /* JADX WARN: Code duplicated, block: B:17:0x0068  */
        /* JADX WARN: Code duplicated, block: B:19:0x0084 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x0085  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0085 -> B:11:0x0047). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L38
                if (r1 == r3) goto L29
                if (r1 != r2) goto L21
                int r1 = r11.I$0
                java.lang.Object r4 = r11.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r12)
                r12 = r5
                r5 = r11
                r9 = r4
                r4 = r1
                r1 = r9
                goto L47
            L21:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L29:
                int r1 = r11.I$0
                java.lang.Object r4 = r11.L$1
                kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
                java.lang.Object r5 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
                kotlin.ResultKt.throwOnFailure(r12)
                r6 = r11
                goto L60
            L38:
                kotlin.ResultKt.throwOnFailure(r12)
                java.lang.Object r12 = r11.L$0
                kotlinx.coroutines.channels.ProducerScope r12 = (kotlinx.coroutines.channels.ProducerScope) r12
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r11.$this_withIndex
                kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
                r4 = 0
                r5 = r11
            L47:
                r6 = r5
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r5.L$0 = r12
                r5.L$1 = r1
                r5.I$0 = r4
                r5.label = r3
                java.lang.Object r6 = r1.hasNext(r6)
                if (r6 != r0) goto L59
                return r0
            L59:
                r9 = r5
                r5 = r12
                r12 = r6
                r6 = r9
                r10 = r4
                r4 = r1
                r1 = r10
            L60:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto L8a
                java.lang.Object r12 = r4.next()
                kotlin.collections.IndexedValue r7 = new kotlin.collections.IndexedValue
                int r8 = r1 + 1
                r7.<init>(r1, r12)
                r12 = r6
                kotlin.coroutines.Continuation r12 = (kotlin.coroutines.Continuation) r12
                r6.L$0 = r5
                r6.L$1 = r4
                r6.I$0 = r8
                r6.label = r2
                java.lang.Object r12 = r5.send(r7, r12)
                if (r12 != r0) goto L85
                return r0
            L85:
                r1 = r4
                r12 = r5
                r5 = r6
                r4 = r8
                goto L47
            L8a:
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18411.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel withIndex$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return withIndex(receiveChannel, coroutineContext);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel withIndex(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, 0, null, kotlinx.coroutines.channels.ChannelsKt.consumes(receiveChannel), new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18411(receiveChannel, null), 6, null);
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, d2 = {"<anonymous>", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C18111<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super E>, java.lang.Object> {
        /* synthetic */ java.lang.Object L$0;
        int label;

        C18111(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18111 c18111 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18111(continuation);
            c18111.L$0 = obj;
            return c18111;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(E e, kotlin.coroutines.Continuation<? super E> continuation) {
            return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18111) create(e, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return this.L$0;
        }
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel distinctBy$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return kotlinx.coroutines.channels.ChannelsKt.distinctBy(receiveChannel, coroutineContext, function2);
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "K", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {387, 388, 390}, m = "invokeSuspend", n = {"$this$produce", com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, "$this$produce", com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, "e", "$this$produce", com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, "k"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
    static final class C18121<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super K>, java.lang.Object> $selector;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_distinctBy;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C18121(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super K>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18121> continuation) {
            super(2, continuation);
            this.$this_distinctBy = receiveChannel;
            this.$selector = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18121 c18121 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18121(this.$this_distinctBy, this.$selector, continuation);
            c18121.L$0 = obj;
            return c18121;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18121) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0085 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x0086  */
        /* JADX WARN: Code duplicated, block: B:19:0x0095  */
        /* JADX WARN: Code duplicated, block: B:21:0x00ab A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:22:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:25:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:27:0x00ca A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:28:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:30:0x00db  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v8 */
        /* JADX WARN: Type inference failed for: r7v9 */
        /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlinx.coroutines.channels.ProducerScope] */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v6, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00cb -> B:29:0x00d1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00db -> B:13:0x0071). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 228
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18121.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <E, K> kotlinx.coroutines.channels.ReceiveChannel<E> distinctBy(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super K>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, 0, null, kotlinx.coroutines.channels.ChannelsKt.consumes(receiveChannel), new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18121(receiveChannel, function2, null), 6, null);
    }

    public static final <E> java.lang.Object toMutableSet(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super java.util.Set<E>> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt.toCollection(receiveChannel, new java.util.LinkedHashSet(), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object any(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass1 anonymousClass1;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.AnonymousClass1(continuation);
        }
        java.lang.Object objHasNext = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(objHasNext);
                kotlinx.coroutines.channels.ChannelIterator it = receiveChannel.iterator();
                anonymousClass1.L$0 = receiveChannel;
                anonymousClass1.label = 1;
                objHasNext = it.hasNext(anonymousClass1);
                if (objHasNext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                receiveChannel = (kotlinx.coroutines.channels.ReceiveChannel) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(objHasNext);
            }
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
            return objHasNext;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0069 A[Catch: all -> 0x0036, TryCatch #2 {, blocks: (B:12:0x0032, B:25:0x0061, B:27:0x0069, B:28:0x0073), top: B:43:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005e -> B:25:0x0061). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object count(kotlinx.coroutines.channels.ReceiveChannel r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18101
            if (r0 == 0) goto L14
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18101) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.Ref$IntRef r4 = (kotlin.jvm.internal.Ref.IntRef) r4
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L36
            goto L61
        L36:
            r6 = move-exception
            goto L86
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.jvm.internal.Ref$IntRef r7 = new kotlin.jvm.internal.Ref$IntRef
            r7.<init>()
            kotlinx.coroutines.channels.ChannelIterator r2 = r6.iterator()     // Catch: java.lang.Throwable -> L83
            r4 = r7
            r7 = r6
            r6 = r2
        L4f:
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L80
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L80
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L80
            r0.label = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r2 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L80
            if (r2 != r1) goto L5e
            return r1
        L5e:
            r5 = r2
            r2 = r7
            r7 = r5
        L61:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L36
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r7 == 0) goto L73
            r6.next()     // Catch: java.lang.Throwable -> L36
            int r7 = r4.element     // Catch: java.lang.Throwable -> L36
            int r7 = r7 + r3
            r4.element = r7     // Catch: java.lang.Throwable -> L36
            r7 = r2
            goto L4f
        L73:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L36
            r6 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r6)
            int r6 = r4.element
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)
            return r6
        L80:
            r6 = move-exception
            r2 = r7
            goto L86
        L83:
            r7 = move-exception
            r2 = r6
            r6 = r7
        L86:
            throw r6     // Catch: java.lang.Throwable -> L87
        L87:
            r7 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.count(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:40:0x00a5, B:42:0x00ad, B:36:0x0090, B:26:0x0064), top: B:55:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00a1 -> B:15:0x003e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object maxWith(kotlinx.coroutines.channels.ReceiveChannel r8, java.util.Comparator r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.maxWith(kotlinx.coroutines.channels.ReceiveChannel, java.util.Comparator, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:40:0x00a5, B:42:0x00ad, B:36:0x0090, B:26:0x0064), top: B:55:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00a1 -> B:15:0x003e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object minWith(kotlinx.coroutines.channels.ReceiveChannel r8, java.util.Comparator r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.minWith(kotlinx.coroutines.channels.ReceiveChannel, java.util.Comparator, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ java.lang.Object none(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18331 c18331;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18331) {
            c18331 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18331) continuation;
            if ((c18331.label & Integer.MIN_VALUE) != 0) {
                c18331.label -= Integer.MIN_VALUE;
            } else {
                c18331 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18331(continuation);
            }
        } else {
            c18331 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18331(continuation);
        }
        java.lang.Object objHasNext = c18331.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c18331.label;
        boolean z = true;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(objHasNext);
                kotlinx.coroutines.channels.ChannelIterator it = receiveChannel.iterator();
                c18331.L$0 = receiveChannel;
                c18331.label = 1;
                objHasNext = it.hasNext(c18331);
                if (objHasNext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                receiveChannel = (kotlinx.coroutines.channels.ReceiveChannel) c18331.L$0;
                kotlin.ResultKt.throwOnFailure(objHasNext);
            }
            if (((java.lang.Boolean) objHasNext).booleanValue()) {
                z = false;
            }
            java.lang.Boolean boolBoxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
            return boolBoxBoolean;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u0001H\u0001H\u008a@"}, d2 = {"<anonymous>", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C18341<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super E>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_requireNoNulls;
        /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C18341(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18341> continuation) {
            super(2, continuation);
            this.$this_requireNoNulls = receiveChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18341 c18341 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18341(this.$this_requireNoNulls, continuation);
            c18341.L$0 = obj;
            return c18341;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(E e, kotlin.coroutines.Continuation<? super E> continuation) {
            return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18341) create(e, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object obj2 = this.L$0;
            if (obj2 != null) {
                return obj2;
            }
            throw new java.lang.IllegalArgumentException("null element found in " + this.$this_requireNoNulls + '.');
        }
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel zip$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlinx.coroutines.channels.ReceiveChannel receiveChannel2, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return kotlinx.coroutines.channels.ChannelsKt.zip(receiveChannel, receiveChannel2, coroutineContext, function2);
    }

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u008a@"}, d2 = {"<anonymous>", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "R", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {487, 469, 471}, m = "invokeSuspend", n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
    static final class C18432<V> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super V>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<R> $other;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_zip;
        final /* synthetic */ kotlin.jvm.functions.Function2<E, R, V> $transform;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C18432(kotlinx.coroutines.channels.ReceiveChannel<? extends R> receiveChannel, kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel2, kotlin.jvm.functions.Function2<? super E, ? super R, ? extends V> function2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18432> continuation) {
            super(2, continuation);
            this.$other = receiveChannel;
            this.$this_zip = receiveChannel2;
            this.$transform = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18432 c18432 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18432(this.$other, this.$this_zip, this.$transform, continuation);
            c18432.L$0 = obj;
            return c18432;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super V> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18432) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00ab A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:28:0x00bd A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #1 {all -> 0x005a, blocks: (B:26:0x00b5, B:28:0x00bd, B:42:0x0115, B:13:0x004e), top: B:52:0x004e }] */
        /* JADX WARN: Code duplicated, block: B:30:0x00d5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:34:0x00e5 A[Catch: all -> 0x0112, TRY_LEAVE, TryCatch #0 {all -> 0x0112, blocks: (B:32:0x00dd, B:34:0x00e5), top: B:50:0x00dd }] */
        /* JADX WARN: Code duplicated, block: B:36:0x0101 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:37:0x0102  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0102 -> B:38:0x0104). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x010a -> B:22:0x0097). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 292
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18432.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <E, R, V> kotlinx.coroutines.channels.ReceiveChannel<V> zip(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlinx.coroutines.channels.ReceiveChannel<? extends R> receiveChannel2, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super E, ? super R, ? extends V> function2) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, 0, null, kotlinx.coroutines.channels.ChannelsKt.consumesAll(receiveChannel, receiveChannel2), new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.C18432(receiveChannel2, receiveChannel, function2, null), 6, null);
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> consumes(final kotlinx.coroutines.channels.ReceiveChannel<?> receiveChannel) {
        return new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.consumes.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                invoke2(th);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.Throwable th) {
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, th);
            }
        };
    }
}
