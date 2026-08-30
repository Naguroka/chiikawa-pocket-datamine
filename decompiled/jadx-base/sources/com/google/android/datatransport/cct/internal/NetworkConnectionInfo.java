package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NetworkConnectionInfo {

    public static abstract class Builder {
        public abstract com.google.android.datatransport.cct.internal.NetworkConnectionInfo build();

        public abstract com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder setMobileSubtype(com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype);

        public abstract com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder setNetworkType(com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType);
    }

    public abstract com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype getMobileSubtype();

    public abstract com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType getNetworkType();

    public enum NetworkType {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);

        private static final android.util.SparseArray<com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType> valueMap;
        private final int value;

        static {
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType = MOBILE;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType2 = WIFI;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType3 = MOBILE_MMS;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType4 = MOBILE_SUPL;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType5 = MOBILE_DUN;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType6 = MOBILE_HIPRI;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType7 = WIMAX;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType8 = BLUETOOTH;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType9 = DUMMY;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType10 = ETHERNET;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType11 = MOBILE_FOTA;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType12 = MOBILE_IMS;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType13 = MOBILE_CBS;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType14 = WIFI_P2P;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType15 = MOBILE_IA;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType16 = MOBILE_EMERGENCY;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType17 = PROXY;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType18 = VPN;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType19 = NONE;
            android.util.SparseArray<com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType> sparseArray = new android.util.SparseArray<>();
            valueMap = sparseArray;
            sparseArray.put(0, networkType);
            sparseArray.put(1, networkType2);
            sparseArray.put(2, networkType3);
            sparseArray.put(3, networkType4);
            sparseArray.put(4, networkType5);
            sparseArray.put(5, networkType6);
            sparseArray.put(6, networkType7);
            sparseArray.put(7, networkType8);
            sparseArray.put(8, networkType9);
            sparseArray.put(9, networkType10);
            sparseArray.put(10, networkType11);
            sparseArray.put(11, networkType12);
            sparseArray.put(12, networkType13);
            sparseArray.put(13, networkType14);
            sparseArray.put(14, networkType15);
            sparseArray.put(15, networkType16);
            sparseArray.put(16, networkType17);
            sparseArray.put(17, networkType18);
            sparseArray.put(-1, networkType19);
        }

        NetworkType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        public static com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType forNumber(int i) {
            return valueMap.get(i);
        }
    }

    public enum MobileSubtype {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);

        private static final android.util.SparseArray<com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype> valueMap;
        private final int value;

        static {
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype = UNKNOWN_MOBILE_SUBTYPE;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype2 = GPRS;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype3 = EDGE;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype4 = UMTS;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype5 = CDMA;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype6 = EVDO_0;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype7 = EVDO_A;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype8 = RTT;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype9 = HSDPA;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype10 = HSUPA;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype11 = HSPA;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype12 = IDEN;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype13 = EVDO_B;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype14 = LTE;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype15 = EHRPD;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype16 = HSPAP;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype17 = GSM;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype18 = TD_SCDMA;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype19 = IWLAN;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype20 = LTE_CA;
            android.util.SparseArray<com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype> sparseArray = new android.util.SparseArray<>();
            valueMap = sparseArray;
            sparseArray.put(0, mobileSubtype);
            sparseArray.put(1, mobileSubtype2);
            sparseArray.put(2, mobileSubtype3);
            sparseArray.put(3, mobileSubtype4);
            sparseArray.put(4, mobileSubtype5);
            sparseArray.put(5, mobileSubtype6);
            sparseArray.put(6, mobileSubtype7);
            sparseArray.put(7, mobileSubtype8);
            sparseArray.put(8, mobileSubtype9);
            sparseArray.put(9, mobileSubtype10);
            sparseArray.put(10, mobileSubtype11);
            sparseArray.put(11, mobileSubtype12);
            sparseArray.put(12, mobileSubtype13);
            sparseArray.put(13, mobileSubtype14);
            sparseArray.put(14, mobileSubtype15);
            sparseArray.put(15, mobileSubtype16);
            sparseArray.put(16, mobileSubtype17);
            sparseArray.put(17, mobileSubtype18);
            sparseArray.put(18, mobileSubtype19);
            sparseArray.put(19, mobileSubtype20);
        }

        MobileSubtype(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        public static com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype forNumber(int i) {
            return valueMap.get(i);
        }
    }

    public static com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder builder() {
        return new com.google.android.datatransport.cct.internal.AutoValue_NetworkConnectionInfo.Builder();
    }
}
