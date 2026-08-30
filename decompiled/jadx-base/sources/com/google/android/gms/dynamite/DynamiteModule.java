package com.google.android.gms.dynamite;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class DynamiteModule {
    public static final int LOCAL = -1;
    public static final int NONE = 0;
    public static final int NO_SELECTION = 0;
    public static final int REMOTE = 1;
    private static java.lang.Boolean zzb = null;
    private static java.lang.String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static java.lang.Boolean zzf;
    private static com.google.android.gms.dynamite.zzp zzk;
    private static com.google.android.gms.dynamite.zzq zzl;
    private final android.content.Context zzj;
    private static final java.lang.ThreadLocal zzg = new java.lang.ThreadLocal();
    private static final java.lang.ThreadLocal zzh = new com.google.android.gms.dynamite.zzd();
    private static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions zzi = new com.google.android.gms.dynamite.zze();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_REMOTE = new com.google.android.gms.dynamite.zzf();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_LOCAL = new com.google.android.gms.dynamite.zzg();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new com.google.android.gms.dynamite.zzh();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new com.google.android.gms.dynamite.zzi();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new com.google.android.gms.dynamite.zzj();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new com.google.android.gms.dynamite.zzk();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy zza = new com.google.android.gms.dynamite.zzl();

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public static class DynamiteLoaderClassLoader {
        public static java.lang.ClassLoader sClassLoader;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public static class LoadingException extends java.lang.Exception {
        /* synthetic */ LoadingException(java.lang.String str, com.google.android.gms.dynamite.zzo zzoVar) {
            super(str);
        }

        /* synthetic */ LoadingException(java.lang.String str, java.lang.Throwable th, com.google.android.gms.dynamite.zzo zzoVar) {
            super(str, th);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public interface VersionPolicy {

        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
        public interface IVersions {
            int zza(android.content.Context context, java.lang.String str);

            int zzb(android.content.Context context, java.lang.String str, boolean z) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException;
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
        public static class SelectionResult {
            public int localVersion = 0;
            public int remoteVersion = 0;
            public int selection = 0;
        }

        com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context context, java.lang.String str, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions iVersions) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException;
    }

    private DynamiteModule(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    public static int getLocalVersion(android.content.Context context, java.lang.String str) {
        try {
            java.lang.Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            java.lang.reflect.Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            java.lang.reflect.Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (com.google.android.gms.common.internal.Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            android.util.Log.e("DynamiteModule", "Module descriptor id '" + java.lang.String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (java.lang.ClassNotFoundException unused) {
            android.util.Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (java.lang.Exception e) {
            android.util.Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(java.lang.String.valueOf(e.getMessage())));
            return 0;
        }
    }

    public static int getRemoteVersion(android.content.Context context, java.lang.String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x023c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0242  */
    /* JADX WARN: Code duplicated, block: B:116:0x024f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0265 A[Catch: all -> 0x02b0, TryCatch #0 {all -> 0x02b0, blocks: (B:5:0x0035, B:120:0x025c, B:121:0x0264, B:122:0x0265, B:123:0x027b, B:124:0x027c, B:125:0x02ab, B:23:0x0097, B:97:0x01ef, B:98:0x01fa, B:100:0x01fc, B:102:0x01fe, B:103:0x0206), top: B:140:0x0035, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:132:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:135:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:143:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x008e A[Catch: all -> 0x02ac, TRY_LEAVE, TryCatch #5 {all -> 0x02ac, blocks: (B:7:0x0052, B:11:0x0080, B:16:0x0088, B:19:0x008e, B:23:0x0097, B:97:0x01ef, B:98:0x01fa, B:100:0x01fc, B:102:0x01fe, B:103:0x0206, B:105:0x0208, B:107:0x0226, B:109:0x0234), top: B:144:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0096  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a2 A[Catch: all -> 0x01eb, TryCatch #4 {, blocks: (B:26:0x009c, B:28:0x00a2, B:29:0x00a4, B:91:0x01e2, B:92:0x01ea), top: B:143:0x009c, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7 A[Catch: all -> 0x01ee, LoadingException -> 0x01fb, RemoteException -> 0x01fd, TRY_ENTER, TryCatch #8 {RemoteException -> 0x01fd, LoadingException -> 0x01fb, all -> 0x01ee, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00fa, B:54:0x0121, B:56:0x0129, B:57:0x0130, B:58:0x0138, B:53:0x010e, B:61:0x013b, B:62:0x013c, B:63:0x0144, B:64:0x0145, B:65:0x014d, B:68:0x0150, B:69:0x0151, B:71:0x0170, B:73:0x0177, B:75:0x017f, B:81:0x01b8, B:83:0x01be, B:85:0x01c7, B:86:0x01cf, B:76:0x018e, B:77:0x0196, B:79:0x0199, B:80:0x01a9, B:87:0x01d0, B:88:0x01d8, B:89:0x01d9, B:90:0x01e1, B:95:0x01ed, B:44:0x00e8, B:48:0x00ef, B:49:0x00f3, B:26:0x009c, B:28:0x00a2, B:29:0x00a4, B:91:0x01e2, B:92:0x01ea, B:35:0x00ca, B:36:0x00cc), top: B:148:0x009b, inners: #3, #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ae A[Catch: all -> 0x01ee, LoadingException -> 0x01fb, RemoteException -> 0x01fd, TryCatch #8 {RemoteException -> 0x01fd, LoadingException -> 0x01fb, all -> 0x01ee, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00fa, B:54:0x0121, B:56:0x0129, B:57:0x0130, B:58:0x0138, B:53:0x010e, B:61:0x013b, B:62:0x013c, B:63:0x0144, B:64:0x0145, B:65:0x014d, B:68:0x0150, B:69:0x0151, B:71:0x0170, B:73:0x0177, B:75:0x017f, B:81:0x01b8, B:83:0x01be, B:85:0x01c7, B:86:0x01cf, B:76:0x018e, B:77:0x0196, B:79:0x0199, B:80:0x01a9, B:87:0x01d0, B:88:0x01d8, B:89:0x01d9, B:90:0x01e1, B:95:0x01ed, B:44:0x00e8, B:48:0x00ef, B:49:0x00f3, B:26:0x009c, B:28:0x00a2, B:29:0x00a4, B:91:0x01e2, B:92:0x01ea, B:35:0x00ca, B:36:0x00cc), top: B:148:0x009b, inners: #3, #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf A[Catch: all -> 0x01ee, LoadingException -> 0x01fb, RemoteException -> 0x01fd, TRY_ENTER, TryCatch #8 {RemoteException -> 0x01fd, LoadingException -> 0x01fb, all -> 0x01ee, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00fa, B:54:0x0121, B:56:0x0129, B:57:0x0130, B:58:0x0138, B:53:0x010e, B:61:0x013b, B:62:0x013c, B:63:0x0144, B:64:0x0145, B:65:0x014d, B:68:0x0150, B:69:0x0151, B:71:0x0170, B:73:0x0177, B:75:0x017f, B:81:0x01b8, B:83:0x01be, B:85:0x01c7, B:86:0x01cf, B:76:0x018e, B:77:0x0196, B:79:0x0199, B:80:0x01a9, B:87:0x01d0, B:88:0x01d8, B:89:0x01d9, B:90:0x01e1, B:95:0x01ed, B:44:0x00e8, B:48:0x00ef, B:49:0x00f3, B:26:0x009c, B:28:0x00a2, B:29:0x00a4, B:91:0x01e2, B:92:0x01ea, B:35:0x00ca, B:36:0x00cc), top: B:148:0x009b, inners: #3, #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0145 A[Catch: all -> 0x01ee, LoadingException -> 0x01fb, RemoteException -> 0x01fd, TryCatch #8 {RemoteException -> 0x01fd, LoadingException -> 0x01fb, all -> 0x01ee, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00fa, B:54:0x0121, B:56:0x0129, B:57:0x0130, B:58:0x0138, B:53:0x010e, B:61:0x013b, B:62:0x013c, B:63:0x0144, B:64:0x0145, B:65:0x014d, B:68:0x0150, B:69:0x0151, B:71:0x0170, B:73:0x0177, B:75:0x017f, B:81:0x01b8, B:83:0x01be, B:85:0x01c7, B:86:0x01cf, B:76:0x018e, B:77:0x0196, B:79:0x0199, B:80:0x01a9, B:87:0x01d0, B:88:0x01d8, B:89:0x01d9, B:90:0x01e1, B:95:0x01ed, B:44:0x00e8, B:48:0x00ef, B:49:0x00f3, B:26:0x009c, B:28:0x00a2, B:29:0x00a4, B:91:0x01e2, B:92:0x01ea, B:35:0x00ca, B:36:0x00cc), top: B:148:0x009b, inners: #3, #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0151 A[Catch: all -> 0x01ee, LoadingException -> 0x01fb, RemoteException -> 0x01fd, TryCatch #8 {RemoteException -> 0x01fd, LoadingException -> 0x01fb, all -> 0x01ee, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00fa, B:54:0x0121, B:56:0x0129, B:57:0x0130, B:58:0x0138, B:53:0x010e, B:61:0x013b, B:62:0x013c, B:63:0x0144, B:64:0x0145, B:65:0x014d, B:68:0x0150, B:69:0x0151, B:71:0x0170, B:73:0x0177, B:75:0x017f, B:81:0x01b8, B:83:0x01be, B:85:0x01c7, B:86:0x01cf, B:76:0x018e, B:77:0x0196, B:79:0x0199, B:80:0x01a9, B:87:0x01d0, B:88:0x01d8, B:89:0x01d9, B:90:0x01e1, B:95:0x01ed, B:44:0x00e8, B:48:0x00ef, B:49:0x00f3, B:26:0x009c, B:28:0x00a2, B:29:0x00a4, B:91:0x01e2, B:92:0x01ea, B:35:0x00ca, B:36:0x00cc), top: B:148:0x009b, inners: #3, #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0170 A[Catch: all -> 0x01ee, LoadingException -> 0x01fb, RemoteException -> 0x01fd, TryCatch #8 {RemoteException -> 0x01fd, LoadingException -> 0x01fb, all -> 0x01ee, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00fa, B:54:0x0121, B:56:0x0129, B:57:0x0130, B:58:0x0138, B:53:0x010e, B:61:0x013b, B:62:0x013c, B:63:0x0144, B:64:0x0145, B:65:0x014d, B:68:0x0150, B:69:0x0151, B:71:0x0170, B:73:0x0177, B:75:0x017f, B:81:0x01b8, B:83:0x01be, B:85:0x01c7, B:86:0x01cf, B:76:0x018e, B:77:0x0196, B:79:0x0199, B:80:0x01a9, B:87:0x01d0, B:88:0x01d8, B:89:0x01d9, B:90:0x01e1, B:95:0x01ed, B:44:0x00e8, B:48:0x00ef, B:49:0x00f3, B:26:0x009c, B:28:0x00a2, B:29:0x00a4, B:91:0x01e2, B:92:0x01ea, B:35:0x00ca, B:36:0x00cc), top: B:148:0x009b, inners: #3, #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0177 A[Catch: all -> 0x01ee, LoadingException -> 0x01fb, RemoteException -> 0x01fd, TryCatch #8 {RemoteException -> 0x01fd, LoadingException -> 0x01fb, all -> 0x01ee, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00fa, B:54:0x0121, B:56:0x0129, B:57:0x0130, B:58:0x0138, B:53:0x010e, B:61:0x013b, B:62:0x013c, B:63:0x0144, B:64:0x0145, B:65:0x014d, B:68:0x0150, B:69:0x0151, B:71:0x0170, B:73:0x0177, B:75:0x017f, B:81:0x01b8, B:83:0x01be, B:85:0x01c7, B:86:0x01cf, B:76:0x018e, B:77:0x0196, B:79:0x0199, B:80:0x01a9, B:87:0x01d0, B:88:0x01d8, B:89:0x01d9, B:90:0x01e1, B:95:0x01ed, B:44:0x00e8, B:48:0x00ef, B:49:0x00f3, B:26:0x009c, B:28:0x00a2, B:29:0x00a4, B:91:0x01e2, B:92:0x01ea, B:35:0x00ca, B:36:0x00cc), top: B:148:0x009b, inners: #3, #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x017f A[Catch: all -> 0x01ee, LoadingException -> 0x01fb, RemoteException -> 0x01fd, TryCatch #8 {RemoteException -> 0x01fd, LoadingException -> 0x01fb, all -> 0x01ee, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00fa, B:54:0x0121, B:56:0x0129, B:57:0x0130, B:58:0x0138, B:53:0x010e, B:61:0x013b, B:62:0x013c, B:63:0x0144, B:64:0x0145, B:65:0x014d, B:68:0x0150, B:69:0x0151, B:71:0x0170, B:73:0x0177, B:75:0x017f, B:81:0x01b8, B:83:0x01be, B:85:0x01c7, B:86:0x01cf, B:76:0x018e, B:77:0x0196, B:79:0x0199, B:80:0x01a9, B:87:0x01d0, B:88:0x01d8, B:89:0x01d9, B:90:0x01e1, B:95:0x01ed, B:44:0x00e8, B:48:0x00ef, B:49:0x00f3, B:26:0x009c, B:28:0x00a2, B:29:0x00a4, B:91:0x01e2, B:92:0x01ea, B:35:0x00ca, B:36:0x00cc), top: B:148:0x009b, inners: #3, #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x018e A[Catch: all -> 0x01ee, LoadingException -> 0x01fb, RemoteException -> 0x01fd, TryCatch #8 {RemoteException -> 0x01fd, LoadingException -> 0x01fb, all -> 0x01ee, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00fa, B:54:0x0121, B:56:0x0129, B:57:0x0130, B:58:0x0138, B:53:0x010e, B:61:0x013b, B:62:0x013c, B:63:0x0144, B:64:0x0145, B:65:0x014d, B:68:0x0150, B:69:0x0151, B:71:0x0170, B:73:0x0177, B:75:0x017f, B:81:0x01b8, B:83:0x01be, B:85:0x01c7, B:86:0x01cf, B:76:0x018e, B:77:0x0196, B:79:0x0199, B:80:0x01a9, B:87:0x01d0, B:88:0x01d8, B:89:0x01d9, B:90:0x01e1, B:95:0x01ed, B:44:0x00e8, B:48:0x00ef, B:49:0x00f3, B:26:0x009c, B:28:0x00a2, B:29:0x00a4, B:91:0x01e2, B:92:0x01ea, B:35:0x00ca, B:36:0x00cc), top: B:148:0x009b, inners: #3, #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0197 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0199 A[Catch: all -> 0x01ee, LoadingException -> 0x01fb, RemoteException -> 0x01fd, TryCatch #8 {RemoteException -> 0x01fd, LoadingException -> 0x01fb, all -> 0x01ee, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00fa, B:54:0x0121, B:56:0x0129, B:57:0x0130, B:58:0x0138, B:53:0x010e, B:61:0x013b, B:62:0x013c, B:63:0x0144, B:64:0x0145, B:65:0x014d, B:68:0x0150, B:69:0x0151, B:71:0x0170, B:73:0x0177, B:75:0x017f, B:81:0x01b8, B:83:0x01be, B:85:0x01c7, B:86:0x01cf, B:76:0x018e, B:77:0x0196, B:79:0x0199, B:80:0x01a9, B:87:0x01d0, B:88:0x01d8, B:89:0x01d9, B:90:0x01e1, B:95:0x01ed, B:44:0x00e8, B:48:0x00ef, B:49:0x00f3, B:26:0x009c, B:28:0x00a2, B:29:0x00a4, B:91:0x01e2, B:92:0x01ea, B:35:0x00ca, B:36:0x00cc), top: B:148:0x009b, inners: #3, #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01a9 A[Catch: all -> 0x01ee, LoadingException -> 0x01fb, RemoteException -> 0x01fd, TryCatch #8 {RemoteException -> 0x01fd, LoadingException -> 0x01fb, all -> 0x01ee, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00fa, B:54:0x0121, B:56:0x0129, B:57:0x0130, B:58:0x0138, B:53:0x010e, B:61:0x013b, B:62:0x013c, B:63:0x0144, B:64:0x0145, B:65:0x014d, B:68:0x0150, B:69:0x0151, B:71:0x0170, B:73:0x0177, B:75:0x017f, B:81:0x01b8, B:83:0x01be, B:85:0x01c7, B:86:0x01cf, B:76:0x018e, B:77:0x0196, B:79:0x0199, B:80:0x01a9, B:87:0x01d0, B:88:0x01d8, B:89:0x01d9, B:90:0x01e1, B:95:0x01ed, B:44:0x00e8, B:48:0x00ef, B:49:0x00f3, B:26:0x009c, B:28:0x00a2, B:29:0x00a4, B:91:0x01e2, B:92:0x01ea, B:35:0x00ca, B:36:0x00cc), top: B:148:0x009b, inners: #3, #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01be A[Catch: all -> 0x01ee, LoadingException -> 0x01fb, RemoteException -> 0x01fd, TryCatch #8 {RemoteException -> 0x01fd, LoadingException -> 0x01fb, all -> 0x01ee, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00fa, B:54:0x0121, B:56:0x0129, B:57:0x0130, B:58:0x0138, B:53:0x010e, B:61:0x013b, B:62:0x013c, B:63:0x0144, B:64:0x0145, B:65:0x014d, B:68:0x0150, B:69:0x0151, B:71:0x0170, B:73:0x0177, B:75:0x017f, B:81:0x01b8, B:83:0x01be, B:85:0x01c7, B:86:0x01cf, B:76:0x018e, B:77:0x0196, B:79:0x0199, B:80:0x01a9, B:87:0x01d0, B:88:0x01d8, B:89:0x01d9, B:90:0x01e1, B:95:0x01ed, B:44:0x00e8, B:48:0x00ef, B:49:0x00f3, B:26:0x009c, B:28:0x00a2, B:29:0x00a4, B:91:0x01e2, B:92:0x01ea, B:35:0x00ca, B:36:0x00cc), top: B:148:0x009b, inners: #3, #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01c7 A[Catch: all -> 0x01ee, LoadingException -> 0x01fb, RemoteException -> 0x01fd, TryCatch #8 {RemoteException -> 0x01fd, LoadingException -> 0x01fb, all -> 0x01ee, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00fa, B:54:0x0121, B:56:0x0129, B:57:0x0130, B:58:0x0138, B:53:0x010e, B:61:0x013b, B:62:0x013c, B:63:0x0144, B:64:0x0145, B:65:0x014d, B:68:0x0150, B:69:0x0151, B:71:0x0170, B:73:0x0177, B:75:0x017f, B:81:0x01b8, B:83:0x01be, B:85:0x01c7, B:86:0x01cf, B:76:0x018e, B:77:0x0196, B:79:0x0199, B:80:0x01a9, B:87:0x01d0, B:88:0x01d8, B:89:0x01d9, B:90:0x01e1, B:95:0x01ed, B:44:0x00e8, B:48:0x00ef, B:49:0x00f3, B:26:0x009c, B:28:0x00a2, B:29:0x00a4, B:91:0x01e2, B:92:0x01ea, B:35:0x00ca, B:36:0x00cc), top: B:148:0x009b, inners: #3, #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01d0 A[Catch: all -> 0x01ee, LoadingException -> 0x01fb, RemoteException -> 0x01fd, TryCatch #8 {RemoteException -> 0x01fd, LoadingException -> 0x01fb, all -> 0x01ee, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00fa, B:54:0x0121, B:56:0x0129, B:57:0x0130, B:58:0x0138, B:53:0x010e, B:61:0x013b, B:62:0x013c, B:63:0x0144, B:64:0x0145, B:65:0x014d, B:68:0x0150, B:69:0x0151, B:71:0x0170, B:73:0x0177, B:75:0x017f, B:81:0x01b8, B:83:0x01be, B:85:0x01c7, B:86:0x01cf, B:76:0x018e, B:77:0x0196, B:79:0x0199, B:80:0x01a9, B:87:0x01d0, B:88:0x01d8, B:89:0x01d9, B:90:0x01e1, B:95:0x01ed, B:44:0x00e8, B:48:0x00ef, B:49:0x00f3, B:26:0x009c, B:28:0x00a2, B:29:0x00a4, B:91:0x01e2, B:92:0x01ea, B:35:0x00ca, B:36:0x00cc), top: B:148:0x009b, inners: #3, #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01d9 A[Catch: all -> 0x01ee, LoadingException -> 0x01fb, RemoteException -> 0x01fd, TryCatch #8 {RemoteException -> 0x01fd, LoadingException -> 0x01fb, all -> 0x01ee, blocks: (B:25:0x009b, B:31:0x00a7, B:33:0x00ae, B:34:0x00c9, B:38:0x00cf, B:40:0x00d7, B:42:0x00db, B:43:0x00e7, B:50:0x00f4, B:52:0x00fa, B:54:0x0121, B:56:0x0129, B:57:0x0130, B:58:0x0138, B:53:0x010e, B:61:0x013b, B:62:0x013c, B:63:0x0144, B:64:0x0145, B:65:0x014d, B:68:0x0150, B:69:0x0151, B:71:0x0170, B:73:0x0177, B:75:0x017f, B:81:0x01b8, B:83:0x01be, B:85:0x01c7, B:86:0x01cf, B:76:0x018e, B:77:0x0196, B:79:0x0199, B:80:0x01a9, B:87:0x01d0, B:88:0x01d8, B:89:0x01d9, B:90:0x01e1, B:95:0x01ed, B:44:0x00e8, B:48:0x00ef, B:49:0x00f3, B:26:0x009c, B:28:0x00a2, B:29:0x00a4, B:91:0x01e2, B:92:0x01ea, B:35:0x00ca, B:36:0x00cc), top: B:148:0x009b, inners: #3, #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01e2 A[Catch: all -> 0x01eb, TRY_ENTER, TryCatch #4 {, blocks: (B:26:0x009c, B:28:0x00a2, B:29:0x00a4, B:91:0x01e2, B:92:0x01ea), top: B:143:0x009c, outer: #8 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:122:0x0265, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00ae, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x0151, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.google.android.gms.dynamite.zzm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7 */
    public static com.google.android.gms.dynamite.DynamiteModule load(android.content.Context context, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy versionPolicy, java.lang.String str) throws java.lang.Throwable {
        android.database.Cursor cursor;
        com.google.android.gms.dynamite.DynamiteModule dynamiteModuleZzc;
        int i;
        java.lang.Boolean bool;
        com.google.android.gms.dynamite.zzp zzpVarZzg;
        int iZze;
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzh;
        java.lang.Object objUnwrap;
        com.google.android.gms.dynamite.DynamiteModule dynamiteModule;
        com.google.android.gms.dynamite.zzm zzmVar;
        com.google.android.gms.dynamite.zzq zzqVar;
        com.google.android.gms.dynamite.zzm zzmVar2;
        java.lang.Boolean boolValueOf;
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZze;
        android.database.Cursor cursor2;
        int i2;
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("null application Context", null);
        }
        java.lang.ThreadLocal threadLocal = zzg;
        ?? r11 = (com.google.android.gms.dynamite.zzm) threadLocal.get();
        com.google.android.gms.dynamite.zzm zzmVar3 = new com.google.android.gms.dynamite.zzm(null);
        threadLocal.set(zzmVar3);
        java.lang.ThreadLocal threadLocal2 = zzh;
        long jLongValue = ((java.lang.Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis()));
            com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectionResultSelectModule = versionPolicy.selectModule(context, str, zzi);
            int i3 = selectionResultSelectModule.localVersion;
            int i4 = selectionResultSelectModule.remoteVersion;
            try {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Considering local module ");
                sb.append(str);
                sb.append(":");
                sb.append(i3);
                sb.append(" and remote module ");
                sb.append(str);
                sb.append(":");
                sb.append(i4);
                android.util.Log.i("DynamiteModule", sb.toString());
                int i5 = selectionResultSelectModule.selection;
                if (i5 != 0) {
                    if (i5 != -1) {
                        r11 = sb;
                        if (i5 == 1 || (i2 = selectionResultSelectModule.remoteVersion) != 0) {
                            if (i5 == -1) {
                                if (i5 == 1) {
                                    throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("VersionPolicy returned invalid code:" + i5, null);
                                }
                                try {
                                    i = selectionResultSelectModule.remoteVersion;
                                    try {
                                        synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                            if (zzf(context)) {
                                                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Remote loading disabled", null);
                                            }
                                            bool = zzb;
                                        }
                                        if (bool != null) {
                                            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to determine which loading route to use.", null);
                                        }
                                        if (bool.booleanValue()) {
                                            android.util.Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i);
                                            synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                                zzqVar = zzl;
                                            }
                                            if (zzqVar != null) {
                                                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("DynamiteLoaderV2 was not cached.", null);
                                            }
                                            zzmVar2 = (com.google.android.gms.dynamite.zzm) threadLocal.get();
                                            if (zzmVar2 != null || zzmVar2.zza == null) {
                                                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("No result cursor", null);
                                            }
                                            android.content.Context applicationContext2 = context.getApplicationContext();
                                            android.database.Cursor cursor3 = zzmVar2.zza;
                                            com.google.android.gms.dynamic.ObjectWrapper.wrap(null);
                                            synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                                boolValueOf = java.lang.Boolean.valueOf(zze >= 2);
                                            }
                                            if (boolValueOf.booleanValue()) {
                                                android.util.Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                iObjectWrapperZze = zzqVar.zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(applicationContext2), str, i, com.google.android.gms.dynamic.ObjectWrapper.wrap(cursor3));
                                            } else {
                                                android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                iObjectWrapperZze = zzqVar.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(applicationContext2), str, i, com.google.android.gms.dynamic.ObjectWrapper.wrap(cursor3));
                                            }
                                            android.content.Context context2 = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperZze);
                                            if (context2 == null) {
                                                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to get module context", null);
                                            }
                                            dynamiteModule = new com.google.android.gms.dynamite.DynamiteModule(context2);
                                        } else {
                                            android.util.Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i);
                                            zzpVarZzg = zzg(context);
                                            if (zzpVarZzg != null) {
                                                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to create IDynamiteLoader.", null);
                                            }
                                            iZze = zzpVarZzg.zze();
                                            if (iZze >= 3) {
                                                zzmVar = (com.google.android.gms.dynamite.zzm) threadLocal.get();
                                                if (zzmVar != null) {
                                                    throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("No cached result cursor holder", null);
                                                }
                                                iObjectWrapperZzh = zzpVarZzg.zzi(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, i, com.google.android.gms.dynamic.ObjectWrapper.wrap(zzmVar.zza));
                                            } else if (iZze == 2) {
                                                android.util.Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                iObjectWrapperZzh = zzpVarZzg.zzj(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, i);
                                            } else {
                                                android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                iObjectWrapperZzh = zzpVarZzg.zzh(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, i);
                                            }
                                            objUnwrap = com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperZzh);
                                            if (objUnwrap != null) {
                                                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to load remote module.", null);
                                            }
                                            dynamiteModule = new com.google.android.gms.dynamite.DynamiteModule((android.content.Context) objUnwrap);
                                        }
                                        dynamiteModuleZzc = dynamiteModule;
                                    } catch (android.os.RemoteException e) {
                                        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to load remote module.", e, null);
                                    } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e2) {
                                        throw e2;
                                    } catch (java.lang.Throwable th) {
                                        com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(context, th);
                                        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to load remote module.", th, null);
                                    }
                                } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e3) {
                                    android.util.Log.w("DynamiteModule", "Failed to load remote module: " + e3.getMessage());
                                    int i6 = selectionResultSelectModule.localVersion;
                                    if (i6 == 0 || versionPolicy.selectModule(context, str, new com.google.android.gms.dynamite.zzn(i6, 0)).selection != -1) {
                                        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Remote load failed. No local fallback found.", e3, null);
                                    }
                                    dynamiteModuleZzc = zzc(applicationContext, str);
                                }
                                if (jLongValue == 0) {
                                    zzh.remove();
                                } else {
                                    zzh.set(java.lang.Long.valueOf(jLongValue));
                                }
                                cursor = zzmVar3.zza;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                zzg.set(r11);
                                throw th;
                            }
                            dynamiteModuleZzc = zzc(applicationContext, str);
                            if (jLongValue == 0) {
                                zzh.remove();
                            } else {
                                zzh.set(java.lang.Long.valueOf(jLongValue));
                            }
                            cursor2 = zzmVar3.zza;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            zzg.set(r11);
                            return dynamiteModuleZzc;
                        }
                    } else if (selectionResultSelectModule.localVersion != 0) {
                        i5 = -1;
                        r11 = sb;
                        if (i5 == 1) {
                        }
                        if (i5 == -1) {
                            if (i5 == 1) {
                                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("VersionPolicy returned invalid code:" + i5, null);
                            }
                            i = selectionResultSelectModule.remoteVersion;
                            synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                if (zzf(context)) {
                                    throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Remote loading disabled", null);
                                }
                                bool = zzb;
                                if (bool != null) {
                                    throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to determine which loading route to use.", null);
                                }
                                if (bool.booleanValue()) {
                                    android.util.Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i);
                                    synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                        zzqVar = zzl;
                                        if (zzqVar != null) {
                                            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("DynamiteLoaderV2 was not cached.", null);
                                        }
                                        zzmVar2 = (com.google.android.gms.dynamite.zzm) threadLocal.get();
                                        if (zzmVar2 != null) {
                                        }
                                        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("No result cursor", null);
                                    }
                                }
                                android.util.Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i);
                                zzpVarZzg = zzg(context);
                                if (zzpVarZzg != null) {
                                    throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to create IDynamiteLoader.", null);
                                }
                                iZze = zzpVarZzg.zze();
                                if (iZze >= 3) {
                                    zzmVar = (com.google.android.gms.dynamite.zzm) threadLocal.get();
                                    if (zzmVar != null) {
                                        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("No cached result cursor holder", null);
                                    }
                                    iObjectWrapperZzh = zzpVarZzg.zzi(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, i, com.google.android.gms.dynamic.ObjectWrapper.wrap(zzmVar.zza));
                                } else if (iZze == 2) {
                                    android.util.Log.w("DynamiteModule", "IDynamite loader version = 2");
                                    iObjectWrapperZzh = zzpVarZzg.zzj(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, i);
                                } else {
                                    android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                    iObjectWrapperZzh = zzpVarZzg.zzh(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, i);
                                }
                                objUnwrap = com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperZzh);
                                if (objUnwrap != null) {
                                    throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to load remote module.", null);
                                }
                                dynamiteModule = new com.google.android.gms.dynamite.DynamiteModule((android.content.Context) objUnwrap);
                                dynamiteModuleZzc = dynamiteModule;
                            }
                            if (jLongValue == 0) {
                                zzh.remove();
                            } else {
                                zzh.set(java.lang.Long.valueOf(jLongValue));
                            }
                            cursor = zzmVar3.zza;
                            if (cursor != null) {
                                cursor.close();
                            }
                            zzg.set(r11);
                            throw th;
                        }
                        dynamiteModuleZzc = zzc(applicationContext, str);
                        if (jLongValue == 0) {
                            zzh.remove();
                        } else {
                            zzh.set(java.lang.Long.valueOf(jLongValue));
                        }
                        cursor2 = zzmVar3.zza;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        zzg.set(r11);
                        return dynamiteModuleZzc;
                    }
                }
                r11 = i2;
                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("No acceptable module " + str + " found. Local version is " + selectionResultSelectModule.localVersion + " and remote version is " + selectionResultSelectModule.remoteVersion + ".", null);
            } catch (java.lang.Throwable th2) {
                th = th2;
                r11 = r11;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:94:0x016e A[Catch: all -> 0x01ca, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x01ca, blocks: (B:3:0x0002, B:61:0x00e1, B:63:0x00e7, B:68:0x0108, B:90:0x0160, B:94:0x016e, B:115:0x01c3, B:116:0x01c6, B:110:0x01bb, B:66:0x00ed, B:119:0x01c9, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:59:0x00de, B:19:0x0046, B:41:0x00a0, B:44:0x00a3, B:52:0x00bc, B:60:0x00e0, B:58:0x00c2), top: B:130:0x0002, inners: #3, #7 }] */
    public static int zza(android.content.Context context, java.lang.String str, boolean z) {
        java.lang.Throwable th;
        android.os.RemoteException e;
        android.database.Cursor cursor;
        try {
            synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                java.lang.Boolean bool = zzb;
                android.database.Cursor cursor2 = null;
                int iZzf = 0;
                if (bool == null) {
                    try {
                        java.lang.reflect.Field declaredField = context.getApplicationContext().getClassLoader().loadClass(com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            java.lang.ClassLoader classLoader = (java.lang.ClassLoader) declaredField.get(null);
                            if (classLoader == java.lang.ClassLoader.getSystemClassLoader()) {
                                bool = java.lang.Boolean.FALSE;
                            } else if (classLoader != null) {
                                try {
                                    zzd(classLoader);
                                } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException unused) {
                                }
                                bool = java.lang.Boolean.TRUE;
                            } else {
                                if (!zzf(context)) {
                                    return 0;
                                }
                                if (zzd || java.lang.Boolean.TRUE.equals(null)) {
                                    declaredField.set(null, java.lang.ClassLoader.getSystemClassLoader());
                                    bool = java.lang.Boolean.FALSE;
                                } else {
                                    try {
                                        int iZzb = zzb(context, str, z, true);
                                        java.lang.String str2 = zzc;
                                        if (str2 != null && !str2.isEmpty()) {
                                            java.lang.ClassLoader classLoaderZza = com.google.android.gms.dynamite.zzb.zza();
                                            if (classLoaderZza == null) {
                                                if (android.os.Build.VERSION.SDK_INT >= 29) {
                                                    java.lang.String str3 = zzc;
                                                    com.google.android.gms.common.internal.Preconditions.checkNotNull(str3);
                                                    classLoaderZza = new dalvik.system.DelegateLastClassLoader(str3, java.lang.ClassLoader.getSystemClassLoader());
                                                } else {
                                                    java.lang.String str4 = zzc;
                                                    com.google.android.gms.common.internal.Preconditions.checkNotNull(str4);
                                                    classLoaderZza = new com.google.android.gms.dynamite.zzc(str4, java.lang.ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            zzd(classLoaderZza);
                                            declaredField.set(null, classLoaderZza);
                                            zzb = java.lang.Boolean.TRUE;
                                            return iZzb;
                                        }
                                        return iZzb;
                                    } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException unused2) {
                                        declaredField.set(null, java.lang.ClassLoader.getSystemClassLoader());
                                        bool = java.lang.Boolean.FALSE;
                                    }
                                }
                            }
                            zzb = bool;
                        }
                    } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchFieldException e2) {
                        android.util.Log.w("DynamiteModule", "Failed to load module via V2: " + e2.toString());
                        bool = java.lang.Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return zzb(context, str, z, false);
                    } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e3) {
                        android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e3.getMessage());
                        return 0;
                    }
                }
                com.google.android.gms.dynamite.zzp zzpVarZzg = zzg(context);
                if (zzpVarZzg != null) {
                    try {
                        try {
                            int iZze = zzpVarZzg.zze();
                            if (iZze >= 3) {
                                com.google.android.gms.dynamite.zzm zzmVar = (com.google.android.gms.dynamite.zzm) zzg.get();
                                if (zzmVar == null || (cursor = zzmVar.zza) == null) {
                                    android.database.Cursor cursor3 = (android.database.Cursor) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzpVarZzg.zzk(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, z, ((java.lang.Long) zzh.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i = cursor3.getInt(0);
                                                cursor2 = (i <= 0 || !zze(cursor3)) ? cursor3 : null;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iZzf = i;
                                            } else {
                                                android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                            }
                                        } catch (android.os.RemoteException e4) {
                                            e = e4;
                                            cursor2 = cursor3;
                                            android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e.getMessage());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    }
                                } else {
                                    iZzf = cursor.getInt(0);
                                }
                            } else if (iZze == 2) {
                                android.util.Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iZzf = zzpVarZzg.zzg(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, z);
                            } else {
                                android.util.Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iZzf = zzpVarZzg.zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, z);
                            }
                        } catch (android.os.RemoteException e5) {
                            e = e5;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                    }
                }
                return iZzf;
            }
        } catch (java.lang.Throwable th4) {
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x016b: MOVE (r0 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:98:0x016b */
    private static int zzb(android.content.Context context, java.lang.String str, boolean z, boolean z2) throws java.lang.Throwable {
        android.database.Cursor cursor;
        android.database.MatrixCursor matrixCursor;
        android.database.Cursor cursor2 = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        try {
            try {
                boolean z3 = true;
                android.net.Uri uriBuild = new android.net.Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", java.lang.String.valueOf(((java.lang.Long) zzh.get()).longValue())).build();
                android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z4 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        android.database.Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new android.database.MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i = 0; i < count; i++) {
                                    if (!cursorQuery.moveToPosition(i)) {
                                        throw new android.os.RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    java.lang.Object[] objArr4 = new java.lang.Object[columnCount];
                                    for (int i2 = 0; i2 < columnCount; i2++) {
                                        int type = cursorQuery.getType(i2);
                                        if (type == 0) {
                                            objArr4[i2] = null;
                                        } else if (type == 1) {
                                            objArr4[i2] = java.lang.Long.valueOf(cursorQuery.getLong(i2));
                                        } else if (type == 2) {
                                            objArr4[i2] = java.lang.Double.valueOf(cursorQuery.getDouble(i2));
                                        } else if (type == 3) {
                                            objArr4[i2] = cursorQuery.getString(i2);
                                        } else {
                                            if (type != 4) {
                                                throw new android.os.RemoteException("Unknown column type");
                                            }
                                            objArr4[i2] = cursorQuery.getBlob(i2);
                                        }
                                    }
                                    matrixCursor.addRow(objArr4);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (java.lang.Throwable th) {
                                try {
                                    cursorQuery.close();
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    } catch (android.os.RemoteException unused) {
                    } catch (java.lang.Throwable th3) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th3;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i3 = matrixCursor.getInt(0);
                            if (i3 > 0) {
                                synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                    zzc = matrixCursor.getString(2);
                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        zze = matrixCursor.getInt(columnIndex);
                                    }
                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                    if (columnIndex2 >= 0) {
                                        if (matrixCursor.getInt(columnIndex2) == 0) {
                                            z3 = false;
                                        }
                                        zzd = z3;
                                        z4 = z3;
                                    }
                                }
                                if (zze(matrixCursor)) {
                                    matrixCursor = null;
                                }
                            }
                            if (z2 && z4) {
                                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("forcing fallback to container DynamiteLoader impl", objArr2 == true ? 1 : 0);
                            }
                            if (matrixCursor != null) {
                                matrixCursor.close();
                            }
                            return i3;
                        }
                    } catch (java.lang.Exception e) {
                        e = e;
                        if (e instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException) {
                            throw e;
                        }
                        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("V2 version check failed: " + e.getMessage(), e, objArr == true ? 1 : 0);
                    }
                }
                android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to connect to dynamite module ContentResolver.", objArr3 == true ? 1 : 0);
            } catch (java.lang.Throwable th4) {
                th = th4;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        } catch (java.lang.Throwable th5) {
            th = th5;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    private static com.google.android.gms.dynamite.DynamiteModule zzc(android.content.Context context, java.lang.String str) {
        android.util.Log.i("DynamiteModule", "Selected local version of ".concat(java.lang.String.valueOf(str)));
        return new com.google.android.gms.dynamite.DynamiteModule(context);
    }

    private static void zzd(java.lang.ClassLoader classLoader) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        com.google.android.gms.dynamite.zzq zzqVar;
        com.google.android.gms.dynamite.zzo zzoVar = null;
        try {
            android.os.IBinder iBinder = (android.os.IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            if (iBinder == null) {
                zzqVar = null;
            } else {
                android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzqVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.dynamite.zzq ? (com.google.android.gms.dynamite.zzq) iInterfaceQueryLocalInterface : new com.google.android.gms.dynamite.zzq(iBinder);
            }
            zzl = zzqVar;
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to instantiate dynamite loader", e, zzoVar);
        }
    }

    private static boolean zze(android.database.Cursor cursor) {
        com.google.android.gms.dynamite.zzm zzmVar = (com.google.android.gms.dynamite.zzm) zzg.get();
        if (zzmVar == null || zzmVar.zza != null) {
            return false;
        }
        zzmVar.zza = cursor;
        return true;
    }

    private static boolean zzf(android.content.Context context) {
        if (java.lang.Boolean.TRUE.equals(null) || java.lang.Boolean.TRUE.equals(zzf)) {
            return true;
        }
        boolean zBooleanValue = false;
        if (zzf == null) {
            android.content.pm.ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != com.google.android.gms.common.util.PlatformVersion.isAtLeastQ() ? 0 : 268435456);
            if (com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                zBooleanValue = true;
            }
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zBooleanValue);
            zzf = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
            if (zBooleanValue && providerInfoResolveContentProvider.applicationInfo != null && (providerInfoResolveContentProvider.applicationInfo.flags & 129) == 0) {
                android.util.Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                zzd = true;
            }
        }
        if (!zBooleanValue) {
            android.util.Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return zBooleanValue;
    }

    private static com.google.android.gms.dynamite.zzp zzg(android.content.Context context) {
        com.google.android.gms.dynamite.zzp zzpVar;
        synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
            com.google.android.gms.dynamite.zzp zzpVar2 = zzk;
            if (zzpVar2 != null) {
                return zzpVar2;
            }
            try {
                android.os.IBinder iBinder = (android.os.IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzpVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzpVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.dynamite.zzp ? (com.google.android.gms.dynamite.zzp) iInterfaceQueryLocalInterface : new com.google.android.gms.dynamite.zzp(iBinder);
                }
                if (zzpVar != null) {
                    zzk = zzpVar;
                    return zzpVar;
                }
            } catch (java.lang.Exception e) {
                android.util.Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e.getMessage());
            }
            return null;
        }
    }

    public android.content.Context getModuleContext() {
        return this.zzj;
    }

    public android.os.IBinder instantiate(java.lang.String str) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        try {
            return (android.os.IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException e) {
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to instantiate module class: ".concat(java.lang.String.valueOf(str)), e, null);
        }
    }
}
