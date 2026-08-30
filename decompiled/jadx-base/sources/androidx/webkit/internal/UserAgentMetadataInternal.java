package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class UserAgentMetadataInternal {
    private static final java.lang.String ARCHITECTURE = "ARCHITECTURE";
    private static final java.lang.String BITNESS = "BITNESS";
    private static final int BRAND_VERSION_LENGTH = 3;
    private static final java.lang.String BRAND_VERSION_LIST = "BRAND_VERSION_LIST";
    private static final java.lang.String FULL_VERSION = "FULL_VERSION";
    private static final java.lang.String MOBILE = "MOBILE";
    private static final java.lang.String MODEL = "MODEL";
    private static final java.lang.String PLATFORM = "PLATFORM";
    private static final java.lang.String PLATFORM_VERSION = "PLATFORM_VERSION";
    private static final java.lang.String WOW64 = "WOW64";

    static java.util.Map<java.lang.String, java.lang.Object> convertUserAgentMetadataToMap(androidx.webkit.UserAgentMetadata userAgentMetadata) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(BRAND_VERSION_LIST, getBrandVersionArray(userAgentMetadata.getBrandVersionList()));
        map.put(FULL_VERSION, userAgentMetadata.getFullVersion());
        map.put(PLATFORM, userAgentMetadata.getPlatform());
        map.put(PLATFORM_VERSION, userAgentMetadata.getPlatformVersion());
        map.put(ARCHITECTURE, userAgentMetadata.getArchitecture());
        map.put(MODEL, userAgentMetadata.getModel());
        map.put(MOBILE, java.lang.Boolean.valueOf(userAgentMetadata.isMobile()));
        map.put(BITNESS, java.lang.Integer.valueOf(userAgentMetadata.getBitness()));
        map.put(WOW64, java.lang.Boolean.valueOf(userAgentMetadata.isWow64()));
        return map;
    }

    private static java.lang.String[][] getBrandVersionArray(java.util.List<androidx.webkit.UserAgentMetadata.BrandVersion> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.lang.String[][] strArr = (java.lang.String[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.String.class, list.size(), 3);
        for (int i = 0; i < list.size(); i++) {
            strArr[i][0] = list.get(i).getBrand();
            strArr[i][1] = list.get(i).getMajorVersion();
            strArr[i][2] = list.get(i).getFullVersion();
        }
        return strArr;
    }

    static androidx.webkit.UserAgentMetadata getUserAgentMetadataFromMap(java.util.Map<java.lang.String, java.lang.Object> map) {
        androidx.webkit.UserAgentMetadata.Builder builder = new androidx.webkit.UserAgentMetadata.Builder();
        java.lang.Object obj = map.get(BRAND_VERSION_LIST);
        if (obj != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String[] strArr : (java.lang.String[][]) obj) {
                arrayList.add(new androidx.webkit.UserAgentMetadata.BrandVersion.Builder().setBrand(strArr[0]).setMajorVersion(strArr[1]).setFullVersion(strArr[2]).build());
            }
            builder.setBrandVersionList(arrayList);
        }
        java.lang.String str = (java.lang.String) map.get(FULL_VERSION);
        if (str != null) {
            builder.setFullVersion(str);
        }
        java.lang.String str2 = (java.lang.String) map.get(PLATFORM);
        if (str2 != null) {
            builder.setPlatform(str2);
        }
        java.lang.String str3 = (java.lang.String) map.get(PLATFORM_VERSION);
        if (str3 != null) {
            builder.setPlatformVersion(str3);
        }
        java.lang.String str4 = (java.lang.String) map.get(ARCHITECTURE);
        if (str4 != null) {
            builder.setArchitecture(str4);
        }
        java.lang.String str5 = (java.lang.String) map.get(MODEL);
        if (str5 != null) {
            builder.setModel(str5);
        }
        java.lang.Boolean bool = (java.lang.Boolean) map.get(MOBILE);
        if (bool != null) {
            builder.setMobile(bool.booleanValue());
        }
        java.lang.Integer num = (java.lang.Integer) map.get(BITNESS);
        if (num != null) {
            builder.setBitness(num.intValue());
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) map.get(WOW64);
        if (bool2 != null) {
            builder.setWow64(bool2.booleanValue());
        }
        return builder.build();
    }
}
