package kotlin.ranges;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _Ranges.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000t\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\u001a'\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007\u001a\u0012\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\b\u001a\u0012\u0010\u0000\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\t\u001a\u0012\u0010\u0000\u001a\u00020\n*\u00020\n2\u0006\u0010\u0003\u001a\u00020\n\u001a'\u0010\u000b\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\u0006\u0010\f\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0012\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005\u001a\u0012\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006\u001a\u0012\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007\u001a\u0012\u0010\u000b\u001a\u00020\b*\u00020\b2\u0006\u0010\f\u001a\u00020\b\u001a\u0012\u0010\u000b\u001a\u00020\t*\u00020\t2\u0006\u0010\f\u001a\u00020\t\u001a\u0012\u0010\u000b\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a3\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\b\u0010\u0003\u001a\u0004\u0018\u0001H\u00012\b\u0010\f\u001a\u0004\u0018\u0001H\u0001¢\u0006\u0002\u0010\u000e\u001a/\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a-\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0012¢\u0006\u0002\u0010\u0013\u001a\u001a\u0010\r\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005\u001a\u001a\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006\u001a\u001a\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007\u001a\u001a\u0010\r\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b\u001a\u0018\u0010\r\u001a\u00020\b*\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0012\u001a\u001a\u0010\r\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t\u001a\u0018\u0010\r\u001a\u00020\t*\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0012\u001a\u001a\u0010\r\u001a\u00020\n*\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0087\n¢\u0006\u0002\u0010\u0019\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b \u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020!2\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\n\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020!2\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0087\n¢\u0006\u0002\u0010\"\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020!2\u0006\u0010\u001a\u001a\u00020\tH\u0087\n\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020!2\u0006\u0010\u001a\u001a\u00020\nH\u0087\n\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020#2\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\n\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020#2\u0006\u0010\u001a\u001a\u00020\bH\u0087\n\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020#2\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0087\n¢\u0006\u0002\u0010$\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020#2\u0006\u0010\u001a\u001a\u00020\nH\u0087\n\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050%2\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050%2\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050%2\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060%2\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0%2\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0%2\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0%2\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0%2\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0%2\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0%2\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0%2\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0%2\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0%2\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b \u001a\u0015\u0010&\u001a\u00020'*\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\u00052\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\u00052\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\u00052\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020**\u00020\u00182\u0006\u0010(\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\b2\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\b2\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\b2\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\t2\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\t2\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\t2\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\n2\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\n2\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020)*\u00020\n2\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010&\u001a\u00020'*\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\f\u0010+\u001a\u00020\u0018*\u00020*H\u0007\u001a\f\u0010+\u001a\u00020\b*\u00020'H\u0007\u001a\f\u0010+\u001a\u00020\t*\u00020)H\u0007\u001a\u0013\u0010,\u001a\u0004\u0018\u00010\u0018*\u00020*H\u0007¢\u0006\u0002\u0010-\u001a\u0013\u0010,\u001a\u0004\u0018\u00010\b*\u00020'H\u0007¢\u0006\u0002\u0010.\u001a\u0013\u0010,\u001a\u0004\u0018\u00010\t*\u00020)H\u0007¢\u0006\u0002\u0010/\u001a\f\u00100\u001a\u00020\u0018*\u00020*H\u0007\u001a\f\u00100\u001a\u00020\b*\u00020'H\u0007\u001a\f\u00100\u001a\u00020\t*\u00020)H\u0007\u001a\u0013\u00101\u001a\u0004\u0018\u00010\u0018*\u00020*H\u0007¢\u0006\u0002\u0010-\u001a\u0013\u00101\u001a\u0004\u0018\u00010\b*\u00020'H\u0007¢\u0006\u0002\u0010.\u001a\u0013\u00101\u001a\u0004\u0018\u00010\t*\u00020)H\u0007¢\u0006\u0002\u0010/\u001a\r\u00102\u001a\u00020\u0018*\u00020\u0016H\u0087\b\u001a\u0014\u00102\u001a\u00020\u0018*\u00020\u00162\u0006\u00102\u001a\u000203H\u0007\u001a\r\u00102\u001a\u00020\b*\u00020!H\u0087\b\u001a\u0014\u00102\u001a\u00020\b*\u00020!2\u0006\u00102\u001a\u000203H\u0007\u001a\r\u00102\u001a\u00020\t*\u00020#H\u0087\b\u001a\u0014\u00102\u001a\u00020\t*\u00020#2\u0006\u00102\u001a\u000203H\u0007\u001a\u0014\u00104\u001a\u0004\u0018\u00010\u0018*\u00020\u0016H\u0087\b¢\u0006\u0002\u00105\u001a\u001b\u00104\u001a\u0004\u0018\u00010\u0018*\u00020\u00162\u0006\u00102\u001a\u000203H\u0007¢\u0006\u0002\u00106\u001a\u0014\u00104\u001a\u0004\u0018\u00010\b*\u00020!H\u0087\b¢\u0006\u0002\u00107\u001a\u001b\u00104\u001a\u0004\u0018\u00010\b*\u00020!2\u0006\u00102\u001a\u000203H\u0007¢\u0006\u0002\u00108\u001a\u0014\u00104\u001a\u0004\u0018\u00010\t*\u00020#H\u0087\b¢\u0006\u0002\u00109\u001a\u001b\u00104\u001a\u0004\u0018\u00010\t*\u00020#2\u0006\u00102\u001a\u000203H\u0007¢\u0006\u0002\u0010:\u001a\n\u0010;\u001a\u00020**\u00020*\u001a\n\u0010;\u001a\u00020'*\u00020'\u001a\n\u0010;\u001a\u00020)*\u00020)\u001a\u0015\u0010<\u001a\u00020**\u00020*2\u0006\u0010<\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010<\u001a\u00020'*\u00020'2\u0006\u0010<\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010<\u001a\u00020)*\u00020)2\u0006\u0010<\u001a\u00020\tH\u0086\u0004\u001a\u0013\u0010=\u001a\u0004\u0018\u00010\u0005*\u00020\u0006H\u0000¢\u0006\u0002\u0010>\u001a\u0013\u0010=\u001a\u0004\u0018\u00010\u0005*\u00020\u0007H\u0000¢\u0006\u0002\u0010?\u001a\u0013\u0010=\u001a\u0004\u0018\u00010\u0005*\u00020\bH\u0000¢\u0006\u0002\u0010@\u001a\u0013\u0010=\u001a\u0004\u0018\u00010\u0005*\u00020\tH\u0000¢\u0006\u0002\u0010A\u001a\u0013\u0010=\u001a\u0004\u0018\u00010\u0005*\u00020\nH\u0000¢\u0006\u0002\u0010B\u001a\u0013\u0010C\u001a\u0004\u0018\u00010\b*\u00020\u0006H\u0000¢\u0006\u0002\u0010D\u001a\u0013\u0010C\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0000¢\u0006\u0002\u0010E\u001a\u0013\u0010C\u001a\u0004\u0018\u00010\b*\u00020\tH\u0000¢\u0006\u0002\u0010F\u001a\u0013\u0010G\u001a\u0004\u0018\u00010\t*\u00020\u0006H\u0000¢\u0006\u0002\u0010H\u001a\u0013\u0010G\u001a\u0004\u0018\u00010\t*\u00020\u0007H\u0000¢\u0006\u0002\u0010I\u001a\u0013\u0010J\u001a\u0004\u0018\u00010\n*\u00020\u0006H\u0000¢\u0006\u0002\u0010K\u001a\u0013\u0010J\u001a\u0004\u0018\u00010\n*\u00020\u0007H\u0000¢\u0006\u0002\u0010L\u001a\u0013\u0010J\u001a\u0004\u0018\u00010\n*\u00020\bH\u0000¢\u0006\u0002\u0010M\u001a\u0013\u0010J\u001a\u0004\u0018\u00010\n*\u00020\tH\u0000¢\u0006\u0002\u0010N\u001a\u0015\u0010O\u001a\u00020!*\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\u00052\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\u00052\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\u00052\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020\u0016*\u00020\u00182\u0006\u0010(\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\b2\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\b2\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\b2\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\t2\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\t2\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\t2\u0006\u0010(\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\n2\u0006\u0010(\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\n2\u0006\u0010(\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020#*\u00020\n2\u0006\u0010(\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010O\u001a\u00020!*\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0086\u0004¨\u0006P"}, d2 = {"coerceAtLeast", "T", "", "minimumValue", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "coerceAtMost", "maximumValue", "coerceIn", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "range", "Lkotlin/ranges/ClosedFloatingPointRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "Lkotlin/ranges/ClosedRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedRange;)Ljava/lang/Comparable;", "contains", "", "Lkotlin/ranges/CharRange;", "element", "", "(Lkotlin/ranges/CharRange;Ljava/lang/Character;)Z", "value", "byteRangeContains", "doubleRangeContains", "floatRangeContains", "intRangeContains", "longRangeContains", "shortRangeContains", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;Ljava/lang/Integer;)Z", "Lkotlin/ranges/LongRange;", "(Lkotlin/ranges/LongRange;Ljava/lang/Long;)Z", "Lkotlin/ranges/OpenEndRange;", "downTo", "Lkotlin/ranges/IntProgression;", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/CharProgression;", "first", "firstOrNull", "(Lkotlin/ranges/CharProgression;)Ljava/lang/Character;", "(Lkotlin/ranges/IntProgression;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongProgression;)Ljava/lang/Long;", "last", "lastOrNull", "random", "Lkotlin/random/Random;", "randomOrNull", "(Lkotlin/ranges/CharRange;)Ljava/lang/Character;", "(Lkotlin/ranges/CharRange;Lkotlin/random/Random;)Ljava/lang/Character;", "(Lkotlin/ranges/IntRange;)Ljava/lang/Integer;", "(Lkotlin/ranges/IntRange;Lkotlin/random/Random;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongRange;)Ljava/lang/Long;", "(Lkotlin/ranges/LongRange;Lkotlin/random/Random;)Ljava/lang/Long;", "reversed", "step", "toByteExactOrNull", "(D)Ljava/lang/Byte;", "(F)Ljava/lang/Byte;", "(I)Ljava/lang/Byte;", "(J)Ljava/lang/Byte;", "(S)Ljava/lang/Byte;", "toIntExactOrNull", "(D)Ljava/lang/Integer;", "(F)Ljava/lang/Integer;", "(J)Ljava/lang/Integer;", "toLongExactOrNull", "(D)Ljava/lang/Long;", "(F)Ljava/lang/Long;", "toShortExactOrNull", "(D)Ljava/lang/Short;", "(F)Ljava/lang/Short;", "(I)Ljava/lang/Short;", "(J)Ljava/lang/Short;", "until", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
public class RangesKt___RangesKt extends kotlin.ranges.RangesKt__RangesKt {
    public static final byte coerceAtLeast(byte b, byte b2) {
        return b < b2 ? b2 : b;
    }

    public static final double coerceAtLeast(double d, double d2) {
        return d < d2 ? d2 : d;
    }

    public static final float coerceAtLeast(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static final int coerceAtLeast(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static final long coerceAtLeast(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static final short coerceAtLeast(short s, short s2) {
        return s < s2 ? s2 : s;
    }

    public static final byte coerceAtMost(byte b, byte b2) {
        return b > b2 ? b2 : b;
    }

    public static final double coerceAtMost(double d, double d2) {
        return d > d2 ? d2 : d;
    }

    public static final float coerceAtMost(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static final int coerceAtMost(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static final long coerceAtMost(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static final short coerceAtMost(short s, short s2) {
        return s > s2 ? s2 : s;
    }

    public static final int first(kotlin.ranges.IntProgression intProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (intProgression.isEmpty()) {
            throw new java.util.NoSuchElementException("Progression " + intProgression + " is empty.");
        }
        return intProgression.getFirst();
    }

    public static final long first(kotlin.ranges.LongProgression longProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (longProgression.isEmpty()) {
            throw new java.util.NoSuchElementException("Progression " + longProgression + " is empty.");
        }
        return longProgression.getFirst();
    }

    public static final char first(kotlin.ranges.CharProgression charProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (charProgression.isEmpty()) {
            throw new java.util.NoSuchElementException("Progression " + charProgression + " is empty.");
        }
        return charProgression.getFirst();
    }

    public static final java.lang.Integer firstOrNull(kotlin.ranges.IntProgression intProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (intProgression.isEmpty()) {
            return null;
        }
        return java.lang.Integer.valueOf(intProgression.getFirst());
    }

    public static final java.lang.Long firstOrNull(kotlin.ranges.LongProgression longProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (longProgression.isEmpty()) {
            return null;
        }
        return java.lang.Long.valueOf(longProgression.getFirst());
    }

    public static final java.lang.Character firstOrNull(kotlin.ranges.CharProgression charProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (charProgression.isEmpty()) {
            return null;
        }
        return java.lang.Character.valueOf(charProgression.getFirst());
    }

    public static final int last(kotlin.ranges.IntProgression intProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (intProgression.isEmpty()) {
            throw new java.util.NoSuchElementException("Progression " + intProgression + " is empty.");
        }
        return intProgression.getLast();
    }

    public static final long last(kotlin.ranges.LongProgression longProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (longProgression.isEmpty()) {
            throw new java.util.NoSuchElementException("Progression " + longProgression + " is empty.");
        }
        return longProgression.getLast();
    }

    public static final char last(kotlin.ranges.CharProgression charProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (charProgression.isEmpty()) {
            throw new java.util.NoSuchElementException("Progression " + charProgression + " is empty.");
        }
        return charProgression.getLast();
    }

    public static final java.lang.Integer lastOrNull(kotlin.ranges.IntProgression intProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (intProgression.isEmpty()) {
            return null;
        }
        return java.lang.Integer.valueOf(intProgression.getLast());
    }

    public static final java.lang.Long lastOrNull(kotlin.ranges.LongProgression longProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (longProgression.isEmpty()) {
            return null;
        }
        return java.lang.Long.valueOf(longProgression.getLast());
    }

    public static final java.lang.Character lastOrNull(kotlin.ranges.CharProgression charProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (charProgression.isEmpty()) {
            return null;
        }
        return java.lang.Character.valueOf(charProgression.getLast());
    }

    private static final int random(kotlin.ranges.IntRange intRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "<this>");
        return kotlin.ranges.RangesKt.random(intRange, kotlin.random.Random.INSTANCE);
    }

    private static final long random(kotlin.ranges.LongRange longRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longRange, "<this>");
        return kotlin.ranges.RangesKt.random(longRange, kotlin.random.Random.INSTANCE);
    }

    private static final char random(kotlin.ranges.CharRange charRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charRange, "<this>");
        return kotlin.ranges.RangesKt.random(charRange, kotlin.random.Random.INSTANCE);
    }

    public static final int random(kotlin.ranges.IntRange intRange, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "random");
        try {
            return kotlin.random.RandomKt.nextInt(random, intRange);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }

    public static final long random(kotlin.ranges.LongRange longRange, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longRange, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "random");
        try {
            return kotlin.random.RandomKt.nextLong(random, longRange);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }

    public static final char random(kotlin.ranges.CharRange charRange, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charRange, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "random");
        try {
            return (char) random.nextInt(charRange.getFirst(), charRange.getLast() + 1);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }

    private static final java.lang.Integer randomOrNull(kotlin.ranges.IntRange intRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "<this>");
        return kotlin.ranges.RangesKt.randomOrNull(intRange, kotlin.random.Random.INSTANCE);
    }

    private static final java.lang.Long randomOrNull(kotlin.ranges.LongRange longRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longRange, "<this>");
        return kotlin.ranges.RangesKt.randomOrNull(longRange, kotlin.random.Random.INSTANCE);
    }

    private static final java.lang.Character randomOrNull(kotlin.ranges.CharRange charRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charRange, "<this>");
        return kotlin.ranges.RangesKt.randomOrNull(charRange, kotlin.random.Random.INSTANCE);
    }

    public static final java.lang.Integer randomOrNull(kotlin.ranges.IntRange intRange, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "random");
        if (intRange.isEmpty()) {
            return null;
        }
        return java.lang.Integer.valueOf(kotlin.random.RandomKt.nextInt(random, intRange));
    }

    public static final java.lang.Long randomOrNull(kotlin.ranges.LongRange longRange, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longRange, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "random");
        if (longRange.isEmpty()) {
            return null;
        }
        return java.lang.Long.valueOf(kotlin.random.RandomKt.nextLong(random, longRange));
    }

    public static final java.lang.Character randomOrNull(kotlin.ranges.CharRange charRange, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charRange, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "random");
        if (charRange.isEmpty()) {
            return null;
        }
        return java.lang.Character.valueOf((char) random.nextInt(charRange.getFirst(), charRange.getLast() + 1));
    }

    private static final boolean contains(kotlin.ranges.IntRange intRange, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "<this>");
        return num != null && intRange.contains(num.intValue());
    }

    private static final boolean contains(kotlin.ranges.LongRange longRange, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longRange, "<this>");
        return l != null && longRange.contains(l.longValue());
    }

    private static final boolean contains(kotlin.ranges.CharRange charRange, java.lang.Character ch) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charRange, "<this>");
        return ch != null && charRange.contains(ch.charValue());
    }

    public static final boolean intRangeContains(kotlin.ranges.ClosedRange<java.lang.Integer> closedRange, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(java.lang.Integer.valueOf(b));
    }

    public static final boolean longRangeContains(kotlin.ranges.ClosedRange<java.lang.Long> closedRange, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(java.lang.Long.valueOf(b));
    }

    public static final boolean shortRangeContains(kotlin.ranges.ClosedRange<java.lang.Short> closedRange, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(java.lang.Short.valueOf(b));
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean doubleRangeContains(kotlin.ranges.ClosedRange closedRange, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(java.lang.Double.valueOf(b));
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean floatRangeContains(kotlin.ranges.ClosedRange closedRange, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(java.lang.Float.valueOf(b));
    }

    public static final boolean intRangeContains(kotlin.ranges.OpenEndRange<java.lang.Integer> openEndRange, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(java.lang.Integer.valueOf(b));
    }

    public static final boolean longRangeContains(kotlin.ranges.OpenEndRange<java.lang.Long> openEndRange, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(java.lang.Long.valueOf(b));
    }

    public static final boolean shortRangeContains(kotlin.ranges.OpenEndRange<java.lang.Short> openEndRange, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(java.lang.Short.valueOf(b));
    }

    private static final boolean contains(kotlin.ranges.IntRange intRange, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "<this>");
        return kotlin.ranges.RangesKt.intRangeContains((kotlin.ranges.ClosedRange<java.lang.Integer>) intRange, b);
    }

    private static final boolean contains(kotlin.ranges.LongRange longRange, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longRange, "<this>");
        return kotlin.ranges.RangesKt.longRangeContains((kotlin.ranges.ClosedRange<java.lang.Long>) longRange, b);
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean intRangeContains(kotlin.ranges.ClosedRange closedRange, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        java.lang.Integer intExactOrNull = kotlin.ranges.RangesKt.toIntExactOrNull(d);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean longRangeContains(kotlin.ranges.ClosedRange closedRange, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        java.lang.Long longExactOrNull = kotlin.ranges.RangesKt.toLongExactOrNull(d);
        if (longExactOrNull != null) {
            return closedRange.contains(longExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean byteRangeContains(kotlin.ranges.ClosedRange closedRange, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        java.lang.Byte byteExactOrNull = kotlin.ranges.RangesKt.toByteExactOrNull(d);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean shortRangeContains(kotlin.ranges.ClosedRange closedRange, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        java.lang.Short shortExactOrNull = kotlin.ranges.RangesKt.toShortExactOrNull(d);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static final boolean floatRangeContains(kotlin.ranges.ClosedRange<java.lang.Float> closedRange, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(java.lang.Float.valueOf((float) d));
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean intRangeContains(kotlin.ranges.ClosedRange closedRange, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        java.lang.Integer intExactOrNull = kotlin.ranges.RangesKt.toIntExactOrNull(f);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean longRangeContains(kotlin.ranges.ClosedRange closedRange, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        java.lang.Long longExactOrNull = kotlin.ranges.RangesKt.toLongExactOrNull(f);
        if (longExactOrNull != null) {
            return closedRange.contains(longExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean byteRangeContains(kotlin.ranges.ClosedRange closedRange, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        java.lang.Byte byteExactOrNull = kotlin.ranges.RangesKt.toByteExactOrNull(f);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean shortRangeContains(kotlin.ranges.ClosedRange closedRange, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        java.lang.Short shortExactOrNull = kotlin.ranges.RangesKt.toShortExactOrNull(f);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static final boolean doubleRangeContains(kotlin.ranges.ClosedRange<java.lang.Double> closedRange, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(java.lang.Double.valueOf(f));
    }

    public static final boolean doubleRangeContains(kotlin.ranges.OpenEndRange<java.lang.Double> openEndRange, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(java.lang.Double.valueOf(f));
    }

    public static final boolean longRangeContains(kotlin.ranges.ClosedRange<java.lang.Long> closedRange, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(java.lang.Long.valueOf(i));
    }

    public static final boolean byteRangeContains(kotlin.ranges.ClosedRange<java.lang.Byte> closedRange, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        java.lang.Byte byteExactOrNull = kotlin.ranges.RangesKt.toByteExactOrNull(i);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean shortRangeContains(kotlin.ranges.ClosedRange<java.lang.Short> closedRange, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        java.lang.Short shortExactOrNull = kotlin.ranges.RangesKt.toShortExactOrNull(i);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean doubleRangeContains(kotlin.ranges.ClosedRange closedRange, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(java.lang.Double.valueOf(i));
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean floatRangeContains(kotlin.ranges.ClosedRange closedRange, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(java.lang.Float.valueOf(i));
    }

    public static final boolean longRangeContains(kotlin.ranges.OpenEndRange<java.lang.Long> openEndRange, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(java.lang.Long.valueOf(i));
    }

    public static final boolean byteRangeContains(kotlin.ranges.OpenEndRange<java.lang.Byte> openEndRange, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        java.lang.Byte byteExactOrNull = kotlin.ranges.RangesKt.toByteExactOrNull(i);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean shortRangeContains(kotlin.ranges.OpenEndRange<java.lang.Short> openEndRange, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        java.lang.Short shortExactOrNull = kotlin.ranges.RangesKt.toShortExactOrNull(i);
        if (shortExactOrNull != null) {
            return openEndRange.contains(shortExactOrNull);
        }
        return false;
    }

    private static final boolean contains(kotlin.ranges.LongRange longRange, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longRange, "<this>");
        return kotlin.ranges.RangesKt.longRangeContains((kotlin.ranges.ClosedRange<java.lang.Long>) longRange, i);
    }

    public static final boolean intRangeContains(kotlin.ranges.ClosedRange<java.lang.Integer> closedRange, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        java.lang.Integer intExactOrNull = kotlin.ranges.RangesKt.toIntExactOrNull(j);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    public static final boolean byteRangeContains(kotlin.ranges.ClosedRange<java.lang.Byte> closedRange, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        java.lang.Byte byteExactOrNull = kotlin.ranges.RangesKt.toByteExactOrNull(j);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean shortRangeContains(kotlin.ranges.ClosedRange<java.lang.Short> closedRange, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        java.lang.Short shortExactOrNull = kotlin.ranges.RangesKt.toShortExactOrNull(j);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean doubleRangeContains(kotlin.ranges.ClosedRange closedRange, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(java.lang.Double.valueOf(j));
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean floatRangeContains(kotlin.ranges.ClosedRange closedRange, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(java.lang.Float.valueOf(j));
    }

    public static final boolean intRangeContains(kotlin.ranges.OpenEndRange<java.lang.Integer> openEndRange, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        java.lang.Integer intExactOrNull = kotlin.ranges.RangesKt.toIntExactOrNull(j);
        if (intExactOrNull != null) {
            return openEndRange.contains(intExactOrNull);
        }
        return false;
    }

    public static final boolean byteRangeContains(kotlin.ranges.OpenEndRange<java.lang.Byte> openEndRange, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        java.lang.Byte byteExactOrNull = kotlin.ranges.RangesKt.toByteExactOrNull(j);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean shortRangeContains(kotlin.ranges.OpenEndRange<java.lang.Short> openEndRange, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        java.lang.Short shortExactOrNull = kotlin.ranges.RangesKt.toShortExactOrNull(j);
        if (shortExactOrNull != null) {
            return openEndRange.contains(shortExactOrNull);
        }
        return false;
    }

    private static final boolean contains(kotlin.ranges.IntRange intRange, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "<this>");
        return kotlin.ranges.RangesKt.intRangeContains((kotlin.ranges.ClosedRange<java.lang.Integer>) intRange, j);
    }

    public static final boolean intRangeContains(kotlin.ranges.ClosedRange<java.lang.Integer> closedRange, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(java.lang.Integer.valueOf(s));
    }

    public static final boolean longRangeContains(kotlin.ranges.ClosedRange<java.lang.Long> closedRange, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(java.lang.Long.valueOf(s));
    }

    public static final boolean byteRangeContains(kotlin.ranges.ClosedRange<java.lang.Byte> closedRange, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        java.lang.Byte byteExactOrNull = kotlin.ranges.RangesKt.toByteExactOrNull(s);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean doubleRangeContains(kotlin.ranges.ClosedRange closedRange, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(java.lang.Double.valueOf(s));
    }

    @kotlin.Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean floatRangeContains(kotlin.ranges.ClosedRange closedRange, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(java.lang.Float.valueOf(s));
    }

    public static final boolean intRangeContains(kotlin.ranges.OpenEndRange<java.lang.Integer> openEndRange, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(java.lang.Integer.valueOf(s));
    }

    public static final boolean longRangeContains(kotlin.ranges.OpenEndRange<java.lang.Long> openEndRange, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(java.lang.Long.valueOf(s));
    }

    public static final boolean byteRangeContains(kotlin.ranges.OpenEndRange<java.lang.Byte> openEndRange, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        java.lang.Byte byteExactOrNull = kotlin.ranges.RangesKt.toByteExactOrNull(s);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    private static final boolean contains(kotlin.ranges.IntRange intRange, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "<this>");
        return kotlin.ranges.RangesKt.intRangeContains((kotlin.ranges.ClosedRange<java.lang.Integer>) intRange, s);
    }

    private static final boolean contains(kotlin.ranges.LongRange longRange, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longRange, "<this>");
        return kotlin.ranges.RangesKt.longRangeContains((kotlin.ranges.ClosedRange<java.lang.Long>) longRange, s);
    }

    public static final kotlin.ranges.IntProgression downTo(int i, byte b) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(i, b, -1);
    }

    public static final kotlin.ranges.LongProgression downTo(long j, byte b) {
        return kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(j, b, -1L);
    }

    public static final kotlin.ranges.IntProgression downTo(byte b, byte b2) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(b, b2, -1);
    }

    public static final kotlin.ranges.IntProgression downTo(short s, byte b) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(s, b, -1);
    }

    public static final kotlin.ranges.CharProgression downTo(char c, char c2) {
        return kotlin.ranges.CharProgression.INSTANCE.fromClosedRange(c, c2, -1);
    }

    public static final kotlin.ranges.IntProgression downTo(int i, int i2) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(i, i2, -1);
    }

    public static final kotlin.ranges.LongProgression downTo(long j, int i) {
        return kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(j, i, -1L);
    }

    public static final kotlin.ranges.IntProgression downTo(byte b, int i) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(b, i, -1);
    }

    public static final kotlin.ranges.IntProgression downTo(short s, int i) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(s, i, -1);
    }

    public static final kotlin.ranges.LongProgression downTo(int i, long j) {
        return kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(i, j, -1L);
    }

    public static final kotlin.ranges.LongProgression downTo(long j, long j2) {
        return kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(j, j2, -1L);
    }

    public static final kotlin.ranges.LongProgression downTo(byte b, long j) {
        return kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(b, j, -1L);
    }

    public static final kotlin.ranges.LongProgression downTo(short s, long j) {
        return kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(s, j, -1L);
    }

    public static final kotlin.ranges.IntProgression downTo(int i, short s) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(i, s, -1);
    }

    public static final kotlin.ranges.LongProgression downTo(long j, short s) {
        return kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(j, s, -1L);
    }

    public static final kotlin.ranges.IntProgression downTo(byte b, short s) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(b, s, -1);
    }

    public static final kotlin.ranges.IntProgression downTo(short s, short s2) {
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(s, s2, -1);
    }

    public static final kotlin.ranges.IntProgression reversed(kotlin.ranges.IntProgression intProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intProgression, "<this>");
        return kotlin.ranges.IntProgression.INSTANCE.fromClosedRange(intProgression.getLast(), intProgression.getFirst(), -intProgression.getStep());
    }

    public static final kotlin.ranges.LongProgression reversed(kotlin.ranges.LongProgression longProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longProgression, "<this>");
        return kotlin.ranges.LongProgression.INSTANCE.fromClosedRange(longProgression.getLast(), longProgression.getFirst(), -longProgression.getStep());
    }

    public static final kotlin.ranges.CharProgression reversed(kotlin.ranges.CharProgression charProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charProgression, "<this>");
        return kotlin.ranges.CharProgression.INSTANCE.fromClosedRange(charProgression.getLast(), charProgression.getFirst(), -charProgression.getStep());
    }

    public static final kotlin.ranges.IntProgression step(kotlin.ranges.IntProgression intProgression, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intProgression, "<this>");
        kotlin.ranges.RangesKt.checkStepIsPositive(i > 0, java.lang.Integer.valueOf(i));
        kotlin.ranges.IntProgression.Companion companion = kotlin.ranges.IntProgression.INSTANCE;
        int first = intProgression.getFirst();
        int last = intProgression.getLast();
        if (intProgression.getStep() <= 0) {
            i = -i;
        }
        return companion.fromClosedRange(first, last, i);
    }

    public static final kotlin.ranges.LongProgression step(kotlin.ranges.LongProgression longProgression, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longProgression, "<this>");
        kotlin.ranges.RangesKt.checkStepIsPositive(j > 0, java.lang.Long.valueOf(j));
        kotlin.ranges.LongProgression.Companion companion = kotlin.ranges.LongProgression.INSTANCE;
        long first = longProgression.getFirst();
        long last = longProgression.getLast();
        if (longProgression.getStep() <= 0) {
            j = -j;
        }
        return companion.fromClosedRange(first, last, j);
    }

    public static final kotlin.ranges.CharProgression step(kotlin.ranges.CharProgression charProgression, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charProgression, "<this>");
        kotlin.ranges.RangesKt.checkStepIsPositive(i > 0, java.lang.Integer.valueOf(i));
        kotlin.ranges.CharProgression.Companion companion = kotlin.ranges.CharProgression.INSTANCE;
        char first = charProgression.getFirst();
        char last = charProgression.getLast();
        if (charProgression.getStep() <= 0) {
            i = -i;
        }
        return companion.fromClosedRange(first, last, i);
    }

    public static final java.lang.Byte toByteExactOrNull(int i) {
        if (new kotlin.ranges.IntRange(-128, 127).contains(i)) {
            return java.lang.Byte.valueOf((byte) i);
        }
        return null;
    }

    public static final java.lang.Byte toByteExactOrNull(long j) {
        if (new kotlin.ranges.LongRange(-128L, 127L).contains(j)) {
            return java.lang.Byte.valueOf((byte) j);
        }
        return null;
    }

    public static final java.lang.Byte toByteExactOrNull(short s) {
        if (kotlin.ranges.RangesKt.intRangeContains((kotlin.ranges.ClosedRange<java.lang.Integer>) new kotlin.ranges.IntRange(-128, 127), s)) {
            return java.lang.Byte.valueOf((byte) s);
        }
        return null;
    }

    public static final java.lang.Byte toByteExactOrNull(double d) {
        boolean z = false;
        if (-128.0d <= d && d <= 127.0d) {
            z = true;
        }
        if (z) {
            return java.lang.Byte.valueOf((byte) d);
        }
        return null;
    }

    public static final java.lang.Byte toByteExactOrNull(float f) {
        boolean z = false;
        if (-128.0f <= f && f <= 127.0f) {
            z = true;
        }
        if (z) {
            return java.lang.Byte.valueOf((byte) f);
        }
        return null;
    }

    public static final java.lang.Integer toIntExactOrNull(long j) {
        if (new kotlin.ranges.LongRange(-2147483648L, 2147483647L).contains(j)) {
            return java.lang.Integer.valueOf((int) j);
        }
        return null;
    }

    public static final java.lang.Integer toIntExactOrNull(double d) {
        boolean z = false;
        if (-2.147483648E9d <= d && d <= 2.147483647E9d) {
            z = true;
        }
        if (z) {
            return java.lang.Integer.valueOf((int) d);
        }
        return null;
    }

    public static final java.lang.Integer toIntExactOrNull(float f) {
        boolean z = false;
        if (-2.1474836E9f <= f && f <= 2.1474836E9f) {
            z = true;
        }
        if (z) {
            return java.lang.Integer.valueOf((int) f);
        }
        return null;
    }

    public static final java.lang.Long toLongExactOrNull(double d) {
        boolean z = false;
        if (-9.223372036854776E18d <= d && d <= 9.223372036854776E18d) {
            z = true;
        }
        if (z) {
            return java.lang.Long.valueOf((long) d);
        }
        return null;
    }

    public static final java.lang.Long toLongExactOrNull(float f) {
        boolean z = false;
        if (-9.223372E18f <= f && f <= 9.223372E18f) {
            z = true;
        }
        if (z) {
            return java.lang.Long.valueOf((long) f);
        }
        return null;
    }

    public static final java.lang.Short toShortExactOrNull(int i) {
        if (new kotlin.ranges.IntRange(-32768, 32767).contains(i)) {
            return java.lang.Short.valueOf((short) i);
        }
        return null;
    }

    public static final java.lang.Short toShortExactOrNull(long j) {
        if (new kotlin.ranges.LongRange(-32768L, 32767L).contains(j)) {
            return java.lang.Short.valueOf((short) j);
        }
        return null;
    }

    public static final java.lang.Short toShortExactOrNull(double d) {
        boolean z = false;
        if (-32768.0d <= d && d <= 32767.0d) {
            z = true;
        }
        if (z) {
            return java.lang.Short.valueOf((short) d);
        }
        return null;
    }

    public static final java.lang.Short toShortExactOrNull(float f) {
        boolean z = false;
        if (-32768.0f <= f && f <= 32767.0f) {
            z = true;
        }
        if (z) {
            return java.lang.Short.valueOf((short) f);
        }
        return null;
    }

    public static final kotlin.ranges.IntRange until(int i, byte b) {
        return new kotlin.ranges.IntRange(i, b - 1);
    }

    public static final kotlin.ranges.LongRange until(long j, byte b) {
        return new kotlin.ranges.LongRange(j, ((long) b) - 1);
    }

    public static final kotlin.ranges.IntRange until(byte b, byte b2) {
        return new kotlin.ranges.IntRange(b, b2 - 1);
    }

    public static final kotlin.ranges.IntRange until(short s, byte b) {
        return new kotlin.ranges.IntRange(s, b - 1);
    }

    public static final kotlin.ranges.CharRange until(char c, char c2) {
        return kotlin.jvm.internal.Intrinsics.compare((int) c2, 0) <= 0 ? kotlin.ranges.CharRange.INSTANCE.getEMPTY() : new kotlin.ranges.CharRange(c, (char) (c2 - 1));
    }

    public static final kotlin.ranges.IntRange until(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return kotlin.ranges.IntRange.INSTANCE.getEMPTY();
        }
        return new kotlin.ranges.IntRange(i, i2 - 1);
    }

    public static final kotlin.ranges.LongRange until(long j, int i) {
        return new kotlin.ranges.LongRange(j, ((long) i) - 1);
    }

    public static final kotlin.ranges.IntRange until(byte b, int i) {
        if (i <= Integer.MIN_VALUE) {
            return kotlin.ranges.IntRange.INSTANCE.getEMPTY();
        }
        return new kotlin.ranges.IntRange(b, i - 1);
    }

    public static final kotlin.ranges.IntRange until(short s, int i) {
        if (i <= Integer.MIN_VALUE) {
            return kotlin.ranges.IntRange.INSTANCE.getEMPTY();
        }
        return new kotlin.ranges.IntRange(s, i - 1);
    }

    public static final kotlin.ranges.LongRange until(int i, long j) {
        if (j <= Long.MIN_VALUE) {
            return kotlin.ranges.LongRange.INSTANCE.getEMPTY();
        }
        return new kotlin.ranges.LongRange(i, j - 1);
    }

    public static final kotlin.ranges.LongRange until(long j, long j2) {
        if (j2 <= Long.MIN_VALUE) {
            return kotlin.ranges.LongRange.INSTANCE.getEMPTY();
        }
        return new kotlin.ranges.LongRange(j, j2 - 1);
    }

    public static final kotlin.ranges.LongRange until(byte b, long j) {
        if (j <= Long.MIN_VALUE) {
            return kotlin.ranges.LongRange.INSTANCE.getEMPTY();
        }
        return new kotlin.ranges.LongRange(b, j - 1);
    }

    public static final kotlin.ranges.LongRange until(short s, long j) {
        if (j <= Long.MIN_VALUE) {
            return kotlin.ranges.LongRange.INSTANCE.getEMPTY();
        }
        return new kotlin.ranges.LongRange(s, j - 1);
    }

    public static final kotlin.ranges.IntRange until(int i, short s) {
        return new kotlin.ranges.IntRange(i, s - 1);
    }

    public static final kotlin.ranges.LongRange until(long j, short s) {
        return new kotlin.ranges.LongRange(j, ((long) s) - 1);
    }

    public static final kotlin.ranges.IntRange until(byte b, short s) {
        return new kotlin.ranges.IntRange(b, s - 1);
    }

    public static final kotlin.ranges.IntRange until(short s, short s2) {
        return new kotlin.ranges.IntRange(s, s2 - 1);
    }

    public static final <T extends java.lang.Comparable<? super T>> T coerceAtLeast(T t, T minimumValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minimumValue, "minimumValue");
        return t.compareTo(minimumValue) < 0 ? minimumValue : t;
    }

    public static final <T extends java.lang.Comparable<? super T>> T coerceAtMost(T t, T maximumValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maximumValue, "maximumValue");
        return t.compareTo(maximumValue) > 0 ? maximumValue : t;
    }

    public static final <T extends java.lang.Comparable<? super T>> T coerceIn(T t, T t2, T t3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "<this>");
        if (t2 != null && t3 != null) {
            if (t2.compareTo(t3) > 0) {
                throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t3 + " is less than minimum " + t2 + '.');
            }
            if (t.compareTo(t2) < 0) {
                return t2;
            }
            if (t.compareTo(t3) > 0) {
                return t3;
            }
        } else {
            if (t2 != null && t.compareTo(t2) < 0) {
                return t2;
            }
            if (t3 != null && t.compareTo(t3) > 0) {
                return t3;
            }
        }
        return t;
    }

    public static final byte coerceIn(byte b, byte b2, byte b3) {
        if (b2 > b3) {
            throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b3) + " is less than minimum " + ((int) b2) + '.');
        }
        if (b < b2) {
            return b2;
        }
        return b > b3 ? b3 : b;
    }

    public static final short coerceIn(short s, short s2, short s3) {
        if (s2 > s3) {
            throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s3) + " is less than minimum " + ((int) s2) + '.');
        }
        if (s < s2) {
            return s2;
        }
        return s > s3 ? s3 : s;
    }

    public static final int coerceIn(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
        }
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static final long coerceIn(long j, long j2, long j3) {
        if (j2 > j3) {
            throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
        }
        if (j < j2) {
            return j2;
        }
        return j > j3 ? j3 : j;
    }

    public static final float coerceIn(float f, float f2, float f3) {
        if (f2 > f3) {
            throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
        }
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    public static final double coerceIn(double d, double d2, double d3) {
        if (d2 > d3) {
            throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
        }
        if (d < d2) {
            return d2;
        }
        return d > d3 ? d3 : d;
    }

    public static final <T extends java.lang.Comparable<? super T>> T coerceIn(T t, kotlin.ranges.ClosedFloatingPointRange<T> range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        if (!range.lessThanOrEquals(t, range.getStart()) || range.lessThanOrEquals(range.getStart(), t)) {
            return (!range.lessThanOrEquals(range.getEndInclusive(), t) || range.lessThanOrEquals(t, range.getEndInclusive())) ? t : range.getEndInclusive();
        }
        return range.getStart();
    }

    public static final <T extends java.lang.Comparable<? super T>> T coerceIn(T t, kotlin.ranges.ClosedRange<T> range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof kotlin.ranges.ClosedFloatingPointRange) {
            return (T) kotlin.ranges.RangesKt.coerceIn((java.lang.Comparable) t, (kotlin.ranges.ClosedFloatingPointRange) range);
        }
        if (range.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        if (t.compareTo(range.getStart()) < 0) {
            return (T) range.getStart();
        }
        return t.compareTo(range.getEndInclusive()) > 0 ? (T) range.getEndInclusive() : t;
    }

    public static final int coerceIn(int i, kotlin.ranges.ClosedRange<java.lang.Integer> range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof kotlin.ranges.ClosedFloatingPointRange) {
            return ((java.lang.Number) kotlin.ranges.RangesKt.coerceIn(java.lang.Integer.valueOf(i), (kotlin.ranges.ClosedFloatingPointRange<java.lang.Integer>) range)).intValue();
        }
        if (range.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        if (i < ((java.lang.Number) range.getStart()).intValue()) {
            return ((java.lang.Number) range.getStart()).intValue();
        }
        return i > ((java.lang.Number) range.getEndInclusive()).intValue() ? ((java.lang.Number) range.getEndInclusive()).intValue() : i;
    }

    public static final long coerceIn(long j, kotlin.ranges.ClosedRange<java.lang.Long> range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof kotlin.ranges.ClosedFloatingPointRange) {
            return ((java.lang.Number) kotlin.ranges.RangesKt.coerceIn(java.lang.Long.valueOf(j), (kotlin.ranges.ClosedFloatingPointRange<java.lang.Long>) range)).longValue();
        }
        if (range.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        if (j < ((java.lang.Number) range.getStart()).longValue()) {
            return ((java.lang.Number) range.getStart()).longValue();
        }
        return j > ((java.lang.Number) range.getEndInclusive()).longValue() ? ((java.lang.Number) range.getEndInclusive()).longValue() : j;
    }
}
