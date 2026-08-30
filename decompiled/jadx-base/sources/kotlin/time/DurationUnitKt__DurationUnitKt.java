package kotlin.time;

/* JADX INFO: compiled from: DurationUnit.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0001\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0001H\u0001¨\u0006\t"}, d2 = {"durationUnitByIsoChar", "Lkotlin/time/DurationUnit;", "isoChar", "", "isTimeComponent", "", "durationUnitByShortName", "shortName", "", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
class DurationUnitKt__DurationUnitKt extends kotlin.time.DurationUnitKt__DurationUnitJvmKt {

    /* JADX INFO: compiled from: DurationUnit.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.time.DurationUnit.values().length];
            try {
                iArr[kotlin.time.DurationUnit.NANOSECONDS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.time.DurationUnit.MICROSECONDS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.time.DurationUnit.MILLISECONDS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[kotlin.time.DurationUnit.SECONDS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[kotlin.time.DurationUnit.MINUTES.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[kotlin.time.DurationUnit.HOURS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[kotlin.time.DurationUnit.DAYS.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final java.lang.String shortName(kotlin.time.DurationUnit durationUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "<this>");
        switch (kotlin.time.DurationUnitKt__DurationUnitKt.WhenMappings.$EnumSwitchMapping$0[durationUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "us";
            case 3:
                return "ms";
            case 4:
                return androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS;
            case 5:
                return "m";
            case 6:
                return androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS;
            case 7:
                return "d";
            default:
                throw new java.lang.IllegalStateException(("Unknown unit: " + durationUnit).toString());
        }
    }

    public static final kotlin.time.DurationUnit durationUnitByShortName(java.lang.String shortName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shortName, "shortName");
        int iHashCode = shortName.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && shortName.equals("us")) {
                                    return kotlin.time.DurationUnit.MICROSECONDS;
                                }
                            } else if (shortName.equals("ns")) {
                                return kotlin.time.DurationUnit.NANOSECONDS;
                            }
                        } else if (shortName.equals("ms")) {
                            return kotlin.time.DurationUnit.MILLISECONDS;
                        }
                    } else if (shortName.equals(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS)) {
                        return kotlin.time.DurationUnit.SECONDS;
                    }
                } else if (shortName.equals("m")) {
                    return kotlin.time.DurationUnit.MINUTES;
                }
            } else if (shortName.equals(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS)) {
                return kotlin.time.DurationUnit.HOURS;
            }
        } else if (shortName.equals("d")) {
            return kotlin.time.DurationUnit.DAYS;
        }
        throw new java.lang.IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }

    public static final kotlin.time.DurationUnit durationUnitByIsoChar(char c, boolean z) {
        if (!z) {
            if (c == 'D') {
                return kotlin.time.DurationUnit.DAYS;
            }
            throw new java.lang.IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c);
        }
        if (c == 'H') {
            return kotlin.time.DurationUnit.HOURS;
        }
        if (c == 'M') {
            return kotlin.time.DurationUnit.MINUTES;
        }
        if (c == 'S') {
            return kotlin.time.DurationUnit.SECONDS;
        }
        throw new java.lang.IllegalArgumentException("Invalid duration ISO time unit: " + c);
    }
}
