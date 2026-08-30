package com.bykv.vk.openvk.preload.a;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: FieldNamingPolicy.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements com.bykv.vk.openvk.preload.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.bykv.vk.openvk.preload.a.b f1614a;
    private static com.bykv.vk.openvk.preload.a.b b;
    private static com.bykv.vk.openvk.preload.a.b c;
    private static com.bykv.vk.openvk.preload.a.b d;
    private static com.bykv.vk.openvk.preload.a.b e;
    private static com.bykv.vk.openvk.preload.a.b f;

    private b(java.lang.String str, int i) {
        super(str, i);
    }

    /* synthetic */ b(java.lang.String str, int i, byte b2) {
        this(str, i);
    }

    static {
        com.bykv.vk.openvk.preload.a.b bVar = new com.bykv.vk.openvk.preload.a.b("IDENTITY") { // from class: com.bykv.vk.openvk.preload.a.b.1
            {
                byte b2 = 0;
            }

            @Override // com.bykv.vk.openvk.preload.a.c
            public final java.lang.String a(java.lang.reflect.Field field) {
                return field.getName();
            }
        };
        f1614a = bVar;
        b = new com.bykv.vk.openvk.preload.a.b("UPPER_CAMEL_CASE") { // from class: com.bykv.vk.openvk.preload.a.b.2
            {
                int i = 1;
                byte b2 = 0;
            }

            @Override // com.bykv.vk.openvk.preload.a.c
            public final java.lang.String a(java.lang.reflect.Field field) {
                return a(field.getName());
            }
        };
        c = new com.bykv.vk.openvk.preload.a.b("UPPER_CAMEL_CASE_WITH_SPACES") { // from class: com.bykv.vk.openvk.preload.a.b.3
            {
                int i = 2;
                byte b2 = 0;
            }

            @Override // com.bykv.vk.openvk.preload.a.c
            public final java.lang.String a(java.lang.reflect.Field field) {
                return a(a(field.getName(), " "));
            }
        };
        d = new com.bykv.vk.openvk.preload.a.b("LOWER_CASE_WITH_UNDERSCORES") { // from class: com.bykv.vk.openvk.preload.a.b.4
            {
                int i = 3;
                byte b2 = 0;
            }

            @Override // com.bykv.vk.openvk.preload.a.c
            public final java.lang.String a(java.lang.reflect.Field field) {
                return a(field.getName(), "_").toLowerCase(java.util.Locale.ENGLISH);
            }
        };
        e = new com.bykv.vk.openvk.preload.a.b("LOWER_CASE_WITH_DASHES") { // from class: com.bykv.vk.openvk.preload.a.b.5
            {
                int i = 4;
                byte b2 = 0;
            }

            @Override // com.bykv.vk.openvk.preload.a.c
            public final java.lang.String a(java.lang.reflect.Field field) {
                return a(field.getName(), "-").toLowerCase(java.util.Locale.ENGLISH);
            }
        };
        com.bykv.vk.openvk.preload.a.b bVar2 = new com.bykv.vk.openvk.preload.a.b("LOWER_CASE_WITH_DOTS") { // from class: com.bykv.vk.openvk.preload.a.b.6
            {
                int i = 5;
                byte b2 = 0;
            }

            @Override // com.bykv.vk.openvk.preload.a.c
            public final java.lang.String a(java.lang.reflect.Field field) {
                return a(field.getName(), ".").toLowerCase(java.util.Locale.ENGLISH);
            }
        };
        f = bVar2;
        com.bykv.vk.openvk.preload.a.b[] bVarArr = new com.bykv.vk.openvk.preload.a.b[6];
        bVarArr[0] = bVar;
        bVarArr[5] = bVar2;
    }

    static java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (java.lang.Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    static java.lang.String a(java.lang.String str) {
        int length = str.length() - 1;
        int i = 0;
        while (!java.lang.Character.isLetter(str.charAt(i)) && i < length) {
            i++;
        }
        char cCharAt = str.charAt(i);
        if (java.lang.Character.isUpperCase(cCharAt)) {
            return str;
        }
        char upperCase = java.lang.Character.toUpperCase(cCharAt);
        if (i == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i) + upperCase + str.substring(i + 1);
    }
}
