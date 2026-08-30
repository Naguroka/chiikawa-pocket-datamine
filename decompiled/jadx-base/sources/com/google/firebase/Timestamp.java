package com.google.firebase;

/* JADX INFO: compiled from: Timestamp.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\"B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\u000f\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0011\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0000H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\u0006\u0010\u0019\u001a\u00020\tJ\b\u0010\u001a\u001a\u00020\fH\u0007J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, d2 = {"Lcom/google/firebase/Timestamp;", "", "Landroid/os/Parcelable;", "seconds", "", "nanoseconds", "", "(JI)V", "date", "Ljava/util/Date;", "(Ljava/util/Date;)V", "time", "Ljava/time/Instant;", "(Ljava/time/Instant;)V", "getNanoseconds", "()I", "getSeconds", "()J", "compareTo", "other", "describeContents", "equals", "", "", "hashCode", "toDate", "toInstant", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Timestamp implements java.lang.Comparable<com.google.firebase.Timestamp>, android.os.Parcelable {
    private final int nanoseconds;
    private final long seconds;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.firebase.Timestamp.Companion INSTANCE = new com.google.firebase.Timestamp.Companion(null);
    public static final android.os.Parcelable.Creator<com.google.firebase.Timestamp> CREATOR = new android.os.Parcelable.Creator<com.google.firebase.Timestamp>() { // from class: com.google.firebase.Timestamp$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.firebase.Timestamp createFromParcel(android.os.Parcel source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return new com.google.firebase.Timestamp(source.readLong(), source.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.firebase.Timestamp[] newArray(int size) {
            return new com.google.firebase.Timestamp[size];
        }
    };

    @kotlin.jvm.JvmStatic
    public static final com.google.firebase.Timestamp now() {
        return INSTANCE.now();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public final int getNanoseconds() {
        return this.nanoseconds;
    }

    public Timestamp(long j, int i) {
        INSTANCE.validateRange(j, i);
        this.seconds = j;
        this.nanoseconds = i;
    }

    public Timestamp(java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        com.google.firebase.Timestamp.Companion companion = INSTANCE;
        kotlin.Pair preciseTime = companion.toPreciseTime(date);
        long jLongValue = ((java.lang.Number) preciseTime.component1()).longValue();
        int iIntValue = ((java.lang.Number) preciseTime.component2()).intValue();
        companion.validateRange(jLongValue, iIntValue);
        this.seconds = jLongValue;
        this.nanoseconds = iIntValue;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Timestamp(java.time.Instant time) {
        this(time.getEpochSecond(), time.getNano());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "time");
    }

    public final java.util.Date toDate() {
        return new java.util.Date((this.seconds * ((long) 1000)) + ((long) (this.nanoseconds / 1000000)));
    }

    public final java.time.Instant toInstant() {
        java.time.Instant instantOfEpochSecond = java.time.Instant.ofEpochSecond(this.seconds, this.nanoseconds);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(seconds, nanoseconds.toLong())");
        return instantOfEpochSecond;
    }

    @Override // java.lang.Comparable
    public int compareTo(com.google.firebase.Timestamp other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return kotlin.comparisons.ComparisonsKt.compareValuesBy(this, other, (kotlin.jvm.functions.Function1<? super com.google.firebase.Timestamp, ? extends java.lang.Comparable<?>>[]) new kotlin.jvm.functions.Function1[]{new kotlin.jvm.internal.PropertyReference1Impl() { // from class: com.google.firebase.Timestamp.compareTo.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public java.lang.Object get(java.lang.Object obj) {
                return java.lang.Long.valueOf(((com.google.firebase.Timestamp) obj).getSeconds());
            }
        }, new kotlin.jvm.internal.PropertyReference1Impl() { // from class: com.google.firebase.Timestamp.compareTo.2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((com.google.firebase.Timestamp) obj).getNanoseconds());
            }
        }});
    }

    public boolean equals(java.lang.Object other) {
        return other == this || ((other instanceof com.google.firebase.Timestamp) && compareTo((com.google.firebase.Timestamp) other) == 0);
    }

    public int hashCode() {
        long j = this.seconds;
        return (((((int) j) * 37 * 37) + ((int) (j >> 32))) * 37) + this.nanoseconds;
    }

    public java.lang.String toString() {
        return "Timestamp(seconds=" + this.seconds + ", nanoseconds=" + this.nanoseconds + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.seconds);
        dest.writeInt(this.nanoseconds);
    }

    /* JADX INFO: compiled from: Timestamp.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u000e*\u00020\u000fH\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/google/firebase/Timestamp$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/google/firebase/Timestamp;", "now", "validateRange", "", "seconds", "", "nanoseconds", "", "toPreciseTime", "Lkotlin/Pair;", "Ljava/util/Date;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.google.firebase.Timestamp now() {
            return new com.google.firebase.Timestamp(new java.util.Date());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final kotlin.Pair<java.lang.Long, java.lang.Integer> toPreciseTime(java.util.Date date) {
            long j = 1000;
            long time = date.getTime() / j;
            int time2 = (int) ((date.getTime() % j) * ((long) 1000000));
            if (time2 < 0) {
                return kotlin.TuplesKt.to(java.lang.Long.valueOf(time - 1), java.lang.Integer.valueOf(time2 + okhttp3.internal.http2.Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
            }
            return kotlin.TuplesKt.to(java.lang.Long.valueOf(time), java.lang.Integer.valueOf(time2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void validateRange(long seconds, int nanoseconds) {
            if (!(nanoseconds >= 0 && nanoseconds < 1000000000)) {
                throw new java.lang.IllegalArgumentException(("Timestamp nanoseconds out of range: " + nanoseconds).toString());
            }
            if (!(-62135596800L <= seconds && seconds < 253402300800L)) {
                throw new java.lang.IllegalArgumentException(("Timestamp seconds out of range: " + seconds).toString());
            }
        }
    }
}
