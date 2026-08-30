package kotlin.io.path;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: PathUtils.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000Ì\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a*\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00012\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001a\"\u00020\u0001H\u0087\b¢\u0006\u0002\u0010\u001b\u001a?\u0010\u001c\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0007¢\u0006\u0002\u0010!\u001a6\u0010\u001c\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010\"\u001aK\u0010#\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0007¢\u0006\u0002\u0010%\u001aB\u0010#\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010&\u001a\u001c\u0010'\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010)\u001a\u0006\u0012\u0002\b\u00030*H\u0001\u001a4\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020,2\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.¢\u0006\u0002\b1H\u0007\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a\r\u00102\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u00103\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a.\u00104\u001a\u00020\u0002*\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u0002070\u001a\"\u000207H\u0087\b¢\u0006\u0002\u00108\u001a\u001f\u00104\u001a\u00020\u0002*\u00020\u00022\u0006\u00105\u001a\u00020\u00022\b\b\u0002\u00109\u001a\u00020:H\u0087\b\u001a.\u0010;\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010<\u001a.\u0010=\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010<\u001a.\u0010>\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010<\u001a\u0015\u0010?\u001a\u00020\u0002*\u00020\u00022\u0006\u00105\u001a\u00020\u0002H\u0087\b\u001a-\u0010@\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0007¢\u0006\u0002\u0010<\u001a6\u0010A\u001a\u00020\u0002*\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010B\u001a\r\u0010C\u001a\u000200*\u00020\u0002H\u0087\b\u001a\r\u0010D\u001a\u00020:*\u00020\u0002H\u0087\b\u001a\u0015\u0010E\u001a\u00020\u0002*\u00020\u00022\u0006\u0010F\u001a\u00020\u0002H\u0087\n\u001a\u0015\u0010E\u001a\u00020\u0002*\u00020\u00022\u0006\u0010F\u001a\u00020\u0001H\u0087\n\u001a&\u0010G\u001a\u00020:*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010I\u001a2\u0010J\u001a\u0002HK\"\n\b\u0000\u0010K\u0018\u0001*\u00020L*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010M\u001a4\u0010N\u001a\u0004\u0018\u0001HK\"\n\b\u0000\u0010K\u0018\u0001*\u00020L*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010M\u001a\r\u0010O\u001a\u00020P*\u00020\u0002H\u0087\b\u001a\r\u0010Q\u001a\u00020R*\u00020\u0002H\u0087\b\u001a.\u0010S\u001a\u000200*\u00020\u00022\b\b\u0002\u0010T\u001a\u00020\u00012\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002000.H\u0087\bø\u0001\u0000\u001a0\u0010V\u001a\u0004\u0018\u00010W*\u00020\u00022\u0006\u0010X\u001a\u00020\u00012\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010Y\u001a&\u0010Z\u001a\u00020[*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010\\\u001a(\u0010]\u001a\u0004\u0018\u00010^*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010_\u001a,\u0010`\u001a\b\u0012\u0004\u0012\u00020b0a*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010c\u001a&\u0010d\u001a\u00020:*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010I\u001a\r\u0010e\u001a\u00020:*\u00020\u0002H\u0087\b\u001a\r\u0010f\u001a\u00020:*\u00020\u0002H\u0087\b\u001a\r\u0010g\u001a\u00020:*\u00020\u0002H\u0087\b\u001a&\u0010h\u001a\u00020:*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010I\u001a\u0015\u0010i\u001a\u00020:*\u00020\u00022\u0006\u0010F\u001a\u00020\u0002H\u0087\b\u001a\r\u0010j\u001a\u00020:*\u00020\u0002H\u0087\b\u001a\r\u0010k\u001a\u00020:*\u00020\u0002H\u0087\b\u001a\u001c\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00020m*\u00020\u00022\b\b\u0002\u0010T\u001a\u00020\u0001H\u0007\u001a.\u0010n\u001a\u00020\u0002*\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u0002070\u001a\"\u000207H\u0087\b¢\u0006\u0002\u00108\u001a\u001f\u0010n\u001a\u00020\u0002*\u00020\u00022\u0006\u00105\u001a\u00020\u00022\b\b\u0002\u00109\u001a\u00020:H\u0087\b\u001a&\u0010o\u001a\u00020:*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010I\u001a2\u0010p\u001a\u0002Hq\"\n\b\u0000\u0010q\u0018\u0001*\u00020r*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010s\u001a<\u0010p\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010W0t*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00012\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010u\u001a\r\u0010v\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0014\u0010w\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0007\u001a\u0016\u0010x\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0007\u001a\u0014\u0010y\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0007\u001a8\u0010z\u001a\u00020\u0002*\u00020\u00022\u0006\u0010X\u001a\u00020\u00012\b\u0010{\u001a\u0004\u0018\u00010W2\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010|\u001a\u0015\u0010}\u001a\u00020\u0002*\u00020\u00022\u0006\u0010{\u001a\u00020[H\u0087\b\u001a\u0015\u0010~\u001a\u00020\u0002*\u00020\u00022\u0006\u0010{\u001a\u00020^H\u0087\b\u001a\u001b\u0010\u007f\u001a\u00020\u0002*\u00020\u00022\f\u0010{\u001a\b\u0012\u0004\u0012\u00020b0aH\u0087\b\u001a\u000f\u0010\u0080\u0001\u001a\u00020\u0002*\u00030\u0081\u0001H\u0087\b\u001aF\u0010\u0082\u0001\u001a\u0003H\u0083\u0001\"\u0005\b\u0000\u0010\u0083\u0001*\u00020\u00022\b\b\u0002\u0010T\u001a\u00020\u00012\u001b\u0010\u0084\u0001\u001a\u0016\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00020\u0085\u0001\u0012\u0005\u0012\u0003H\u0083\u00010.H\u0087\bø\u0001\u0000¢\u0006\u0003\u0010\u0086\u0001\u001a3\u0010\u0087\u0001\u001a\u000200*\u00020\u00022\r\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020,2\n\b\u0002\u0010\u0089\u0001\u001a\u00030\u008a\u00012\t\b\u0002\u0010\u008b\u0001\u001a\u00020:H\u0007\u001aJ\u0010\u0087\u0001\u001a\u000200*\u00020\u00022\n\b\u0002\u0010\u0089\u0001\u001a\u00030\u008a\u00012\t\b\u0002\u0010\u008b\u0001\u001a\u00020:2\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.¢\u0006\u0002\b1H\u0007\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001\u001a0\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u0085\u0001*\u00020\u00022\u0014\u00106\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030\u008d\u00010\u001a\"\u00030\u008d\u0001H\u0007¢\u0006\u0003\u0010\u008e\u0001\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001f\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"\u001e\u0010\n\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\"\u001e\u0010\r\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u001e\u0010\u0010\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006\"\u001f\u0010\u0013\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u008f\u0001"}, d2 = {"extension", "", "Ljava/nio/file/Path;", "getExtension$annotations", "(Ljava/nio/file/Path;)V", "getExtension", "(Ljava/nio/file/Path;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath$annotations", "getInvariantSeparatorsPath", "invariantSeparatorsPathString", "getInvariantSeparatorsPathString$annotations", "getInvariantSeparatorsPathString", "name", "getName$annotations", "getName", "nameWithoutExtension", "getNameWithoutExtension$annotations", "getNameWithoutExtension", "pathString", "getPathString$annotations", "getPathString", "Path", "path", androidx.media3.extractor.text.ttml.TtmlNode.RUBY_BASE, "subpaths", "", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;", "createTempDirectory", "directory", "prefix", "attributes", "Ljava/nio/file/attribute/FileAttribute;", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "(Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "createTempFile", "suffix", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "(Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "fileAttributeViewNotAvailable", "", "attributeViewClass", "Ljava/lang/Class;", "fileVisitor", "Ljava/nio/file/FileVisitor;", "builderAction", "Lkotlin/Function1;", "Lkotlin/io/path/FileVisitorBuilder;", "", "Lkotlin/ExtensionFunctionType;", "absolute", "absolutePathString", "copyTo", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "options", "Ljava/nio/file/CopyOption;", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;", "overwrite", "", "createDirectories", "(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "createDirectory", "createFile", "createLinkPointingTo", "createParentDirectories", "createSymbolicLinkPointingTo", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "deleteExisting", "deleteIfExists", androidx.media3.extractor.text.ttml.TtmlNode.TAG_DIV, "other", "exists", "Ljava/nio/file/LinkOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z", "fileAttributesView", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ljava/nio/file/attribute/FileAttributeView;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileAttributeView;", "fileAttributesViewOrNull", "fileSize", "", "fileStore", "Ljava/nio/file/FileStore;", "forEachDirectoryEntry", "glob", "action", "getAttribute", "", "attribute", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;", "getLastModifiedTime", "Ljava/nio/file/attribute/FileTime;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileTime;", "getOwner", "Ljava/nio/file/attribute/UserPrincipal;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/UserPrincipal;", "getPosixFilePermissions", "", "Ljava/nio/file/attribute/PosixFilePermission;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/util/Set;", "isDirectory", "isExecutable", "isHidden", "isReadable", "isRegularFile", "isSameFileAs", "isSymbolicLink", "isWritable", "listDirectoryEntries", "", "moveTo", "notExists", "readAttributes", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Ljava/nio/file/attribute/BasicFileAttributes;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/BasicFileAttributes;", "", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/util/Map;", "readSymbolicLink", "relativeTo", "relativeToOrNull", "relativeToOrSelf", "setAttribute", "value", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/Object;[Ljava/nio/file/LinkOption;)Ljava/nio/file/Path;", "setLastModifiedTime", "setOwner", "setPosixFilePermissions", "toPath", "Ljava/net/URI;", "useDirectoryEntries", "T", "block", "Lkotlin/sequences/Sequence;", "(Ljava/nio/file/Path;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "visitFileTree", "visitor", "maxDepth", "", "followLinks", "walk", "Lkotlin/io/path/PathWalkOption;", "(Ljava/nio/file/Path;[Lkotlin/io/path/PathWalkOption;)Lkotlin/sequences/Sequence;", "kotlin-stdlib-jdk7"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
public class PathsKt__PathUtilsKt extends kotlin.io.path.PathsKt__PathRecursiveFunctionsKt {
    public static /* synthetic */ void getExtension$annotations(java.nio.file.Path path) {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @kotlin.ReplaceWith(expression = "invariantSeparatorsPathString", imports = {}))
    public static /* synthetic */ void getInvariantSeparatorsPath$annotations(java.nio.file.Path path) {
    }

    public static /* synthetic */ void getInvariantSeparatorsPathString$annotations(java.nio.file.Path path) {
    }

    public static /* synthetic */ void getName$annotations(java.nio.file.Path path) {
    }

    public static /* synthetic */ void getNameWithoutExtension$annotations(java.nio.file.Path path) {
    }

    public static /* synthetic */ void getPathString$annotations(java.nio.file.Path path) {
    }

    public static final java.lang.String getName(java.nio.file.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        java.nio.file.Path fileName = path.getFileName();
        java.lang.String string = fileName != null ? fileName.toString() : null;
        return string == null ? "" : string;
    }

    public static final java.lang.String getNameWithoutExtension(java.nio.file.Path path) {
        java.lang.String string;
        java.lang.String strSubstringBeforeLast$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        java.nio.file.Path fileName = path.getFileName();
        return (fileName == null || (string = fileName.toString()) == null || (strSubstringBeforeLast$default = kotlin.text.StringsKt.substringBeforeLast$default(string, ".", (java.lang.String) null, 2, (java.lang.Object) null)) == null) ? "" : strSubstringBeforeLast$default;
    }

    public static final java.lang.String getExtension(java.nio.file.Path path) {
        java.lang.String string;
        java.lang.String strSubstringAfterLast;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        java.nio.file.Path fileName = path.getFileName();
        return (fileName == null || (string = fileName.toString()) == null || (strSubstringAfterLast = kotlin.text.StringsKt.substringAfterLast(string, '.', "")) == null) ? "" : strSubstringAfterLast;
    }

    private static final java.lang.String getPathString(java.nio.file.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        return path.toString();
    }

    public static final java.lang.String getInvariantSeparatorsPathString(java.nio.file.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        java.lang.String separator = path.getFileSystem().getSeparator();
        if (kotlin.jvm.internal.Intrinsics.areEqual(separator, "/")) {
            return path.toString();
        }
        java.lang.String string = path.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNull(separator);
        return kotlin.text.StringsKt.replace$default(string, separator, "/", false, 4, (java.lang.Object) null);
    }

    private static final java.lang.String getInvariantSeparatorsPath(java.nio.file.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        return kotlin.io.path.PathsKt.getInvariantSeparatorsPathString(path);
    }

    private static final java.nio.file.Path absolute(java.nio.file.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        java.nio.file.Path absolutePath = path.toAbsolutePath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "toAbsolutePath(...)");
        return absolutePath;
    }

    private static final java.lang.String absolutePathString(java.nio.file.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        return path.toAbsolutePath().toString();
    }

    public static final java.nio.file.Path relativeTo(java.nio.file.Path path, java.nio.file.Path base) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
        try {
            return kotlin.io.path.PathRelativizer.INSTANCE.tryRelativeTo(path, base);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.lang.IllegalArgumentException(e.getMessage() + "\nthis path: " + path + "\nbase path: " + base, e);
        }
    }

    public static final java.nio.file.Path relativeToOrSelf(java.nio.file.Path path, java.nio.file.Path base) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
        java.nio.file.Path pathRelativeToOrNull = kotlin.io.path.PathsKt.relativeToOrNull(path, base);
        return pathRelativeToOrNull == null ? path : pathRelativeToOrNull;
    }

    public static final java.nio.file.Path relativeToOrNull(java.nio.file.Path path, java.nio.file.Path base) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
        try {
            return kotlin.io.path.PathRelativizer.INSTANCE.tryRelativeTo(path, base);
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    static /* synthetic */ java.nio.file.Path copyTo$default(java.nio.file.Path path, java.nio.file.Path target, boolean z, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            z = false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        java.nio.file.CopyOption[] copyOptionArr = z ? new java.nio.file.CopyOption[]{java.nio.file.StandardCopyOption.REPLACE_EXISTING} : new java.nio.file.CopyOption[0];
        java.nio.file.Path pathCopy = java.nio.file.Files.copy(path, target, (java.nio.file.CopyOption[]) java.util.Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCopy, "copy(...)");
        return pathCopy;
    }

    private static final java.nio.file.Path copyTo(java.nio.file.Path path, java.nio.file.Path target, boolean z) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        java.nio.file.CopyOption[] copyOptionArr = z ? new java.nio.file.CopyOption[]{java.nio.file.StandardCopyOption.REPLACE_EXISTING} : new java.nio.file.CopyOption[0];
        java.nio.file.Path pathCopy = java.nio.file.Files.copy(path, target, (java.nio.file.CopyOption[]) java.util.Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCopy, "copy(...)");
        return pathCopy;
    }

    private static final java.nio.file.Path copyTo(java.nio.file.Path path, java.nio.file.Path target, java.nio.file.CopyOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.nio.file.Path pathCopy = java.nio.file.Files.copy(path, target, (java.nio.file.CopyOption[]) java.util.Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCopy, "copy(...)");
        return pathCopy;
    }

    private static final boolean exists(java.nio.file.Path path, java.nio.file.LinkOption... options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return java.nio.file.Files.exists(path, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(options, options.length));
    }

    private static final boolean notExists(java.nio.file.Path path, java.nio.file.LinkOption... options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return java.nio.file.Files.notExists(path, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(options, options.length));
    }

    private static final boolean isRegularFile(java.nio.file.Path path, java.nio.file.LinkOption... options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return java.nio.file.Files.isRegularFile(path, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(options, options.length));
    }

    private static final boolean isDirectory(java.nio.file.Path path, java.nio.file.LinkOption... options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return java.nio.file.Files.isDirectory(path, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(options, options.length));
    }

    private static final boolean isSymbolicLink(java.nio.file.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        return java.nio.file.Files.isSymbolicLink(path);
    }

    private static final boolean isExecutable(java.nio.file.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        return java.nio.file.Files.isExecutable(path);
    }

    private static final boolean isHidden(java.nio.file.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        return java.nio.file.Files.isHidden(path);
    }

    private static final boolean isReadable(java.nio.file.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        return java.nio.file.Files.isReadable(path);
    }

    private static final boolean isWritable(java.nio.file.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        return java.nio.file.Files.isWritable(path);
    }

    private static final boolean isSameFileAs(java.nio.file.Path path, java.nio.file.Path other) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return java.nio.file.Files.isSameFile(path, other);
    }

    public static /* synthetic */ java.util.List listDirectoryEntries$default(java.nio.file.Path path, java.lang.String str, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            str = androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES;
        }
        return kotlin.io.path.PathsKt.listDirectoryEntries(path, str);
    }

    public static final java.util.List<java.nio.file.Path> listDirectoryEntries(java.nio.file.Path path, java.lang.String glob) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(glob, "glob");
        java.nio.file.DirectoryStream<java.nio.file.Path> directoryStreamNewDirectoryStream = java.nio.file.Files.newDirectoryStream(path, glob);
        try {
            java.nio.file.DirectoryStream<java.nio.file.Path> directoryStream = directoryStreamNewDirectoryStream;
            kotlin.jvm.internal.Intrinsics.checkNotNull(directoryStream);
            java.util.List<java.nio.file.Path> list = kotlin.collections.CollectionsKt.toList(directoryStream);
            kotlin.io.CloseableKt.closeFinally(directoryStreamNewDirectoryStream, null);
            return list;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.io.CloseableKt.closeFinally(directoryStreamNewDirectoryStream, th);
                throw th2;
            }
        }
    }

    static /* synthetic */ java.lang.Object useDirectoryEntries$default(java.nio.file.Path path, java.lang.String glob, kotlin.jvm.functions.Function1 block, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            glob = androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(glob, "glob");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        java.nio.file.DirectoryStream<java.nio.file.Path> directoryStreamNewDirectoryStream = java.nio.file.Files.newDirectoryStream(path, glob);
        try {
            java.nio.file.DirectoryStream<java.nio.file.Path> directoryStream = directoryStreamNewDirectoryStream;
            kotlin.jvm.internal.Intrinsics.checkNotNull(directoryStream);
            java.lang.Object objInvoke = block.invoke(kotlin.collections.CollectionsKt.asSequence(directoryStream));
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                kotlin.io.CloseableKt.closeFinally(directoryStreamNewDirectoryStream, null);
            } else if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return objInvoke;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    kotlin.io.CloseableKt.closeFinally(directoryStreamNewDirectoryStream, th);
                } else if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    private static final <T> T useDirectoryEntries(java.nio.file.Path path, java.lang.String glob, kotlin.jvm.functions.Function1<? super kotlin.sequences.Sequence<? extends java.nio.file.Path>, ? extends T> block) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(glob, "glob");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        java.nio.file.DirectoryStream<java.nio.file.Path> directoryStreamNewDirectoryStream = java.nio.file.Files.newDirectoryStream(path, glob);
        try {
            java.nio.file.DirectoryStream<java.nio.file.Path> directoryStream = directoryStreamNewDirectoryStream;
            kotlin.jvm.internal.Intrinsics.checkNotNull(directoryStream);
            T tInvoke = block.invoke(kotlin.collections.CollectionsKt.asSequence(directoryStream));
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                kotlin.io.CloseableKt.closeFinally(directoryStreamNewDirectoryStream, null);
            } else if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return tInvoke;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    kotlin.io.CloseableKt.closeFinally(directoryStreamNewDirectoryStream, th);
                } else if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    static /* synthetic */ void forEachDirectoryEntry$default(java.nio.file.Path path, java.lang.String glob, kotlin.jvm.functions.Function1 action, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            glob = androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(glob, "glob");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.nio.file.DirectoryStream<java.nio.file.Path> directoryStreamNewDirectoryStream = java.nio.file.Files.newDirectoryStream(path, glob);
        try {
            java.nio.file.DirectoryStream<java.nio.file.Path> directoryStream = directoryStreamNewDirectoryStream;
            kotlin.jvm.internal.Intrinsics.checkNotNull(directoryStream);
            java.util.Iterator<java.nio.file.Path> it = directoryStream.iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                kotlin.io.CloseableKt.closeFinally(directoryStreamNewDirectoryStream, null);
            } else if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    kotlin.io.CloseableKt.closeFinally(directoryStreamNewDirectoryStream, th);
                } else if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    private static final void forEachDirectoryEntry(java.nio.file.Path path, java.lang.String glob, kotlin.jvm.functions.Function1<? super java.nio.file.Path, kotlin.Unit> action) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(glob, "glob");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        java.nio.file.DirectoryStream<java.nio.file.Path> directoryStreamNewDirectoryStream = java.nio.file.Files.newDirectoryStream(path, glob);
        try {
            java.nio.file.DirectoryStream<java.nio.file.Path> directoryStream = directoryStreamNewDirectoryStream;
            kotlin.jvm.internal.Intrinsics.checkNotNull(directoryStream);
            java.util.Iterator<java.nio.file.Path> it = directoryStream.iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                kotlin.io.CloseableKt.closeFinally(directoryStreamNewDirectoryStream, null);
            } else if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    kotlin.io.CloseableKt.closeFinally(directoryStreamNewDirectoryStream, th);
                } else if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    private static final long fileSize(java.nio.file.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        return java.nio.file.Files.size(path);
    }

    private static final void deleteExisting(java.nio.file.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        java.nio.file.Files.delete(path);
    }

    private static final boolean deleteIfExists(java.nio.file.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        return java.nio.file.Files.deleteIfExists(path);
    }

    private static final java.nio.file.Path createDirectory(java.nio.file.Path path, java.nio.file.attribute.FileAttribute<?>... attributes) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "attributes");
        java.nio.file.Path pathCreateDirectory = java.nio.file.Files.createDirectory(path, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateDirectory, "createDirectory(...)");
        return pathCreateDirectory;
    }

    private static final java.nio.file.Path createDirectories(java.nio.file.Path path, java.nio.file.attribute.FileAttribute<?>... attributes) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "attributes");
        java.nio.file.Path pathCreateDirectories = java.nio.file.Files.createDirectories(path, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateDirectories, "createDirectories(...)");
        return pathCreateDirectories;
    }

    public static final java.nio.file.Path createParentDirectories(java.nio.file.Path path, java.nio.file.attribute.FileAttribute<?>... attributes) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "attributes");
        java.nio.file.Path parent = path.getParent();
        if (parent != null && !java.nio.file.Files.isDirectory(parent, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(new java.nio.file.LinkOption[0], 0))) {
            try {
                java.nio.file.attribute.FileAttribute[] fileAttributeArr = (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(attributes, attributes.length);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.nio.file.Files.createDirectories(parent, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(fileAttributeArr, fileAttributeArr.length)), "createDirectories(...)");
            } catch (java.nio.file.FileAlreadyExistsException e) {
                if (!java.nio.file.Files.isDirectory(parent, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(new java.nio.file.LinkOption[0], 0))) {
                    throw e;
                }
            }
        }
        return path;
    }

    private static final java.nio.file.Path moveTo(java.nio.file.Path path, java.nio.file.Path target, java.nio.file.CopyOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.nio.file.Path pathMove = java.nio.file.Files.move(path, target, (java.nio.file.CopyOption[]) java.util.Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathMove, "move(...)");
        return pathMove;
    }

    static /* synthetic */ java.nio.file.Path moveTo$default(java.nio.file.Path path, java.nio.file.Path target, boolean z, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            z = false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        java.nio.file.CopyOption[] copyOptionArr = z ? new java.nio.file.CopyOption[]{java.nio.file.StandardCopyOption.REPLACE_EXISTING} : new java.nio.file.CopyOption[0];
        java.nio.file.Path pathMove = java.nio.file.Files.move(path, target, (java.nio.file.CopyOption[]) java.util.Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathMove, "move(...)");
        return pathMove;
    }

    private static final java.nio.file.Path moveTo(java.nio.file.Path path, java.nio.file.Path target, boolean z) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        java.nio.file.CopyOption[] copyOptionArr = z ? new java.nio.file.CopyOption[]{java.nio.file.StandardCopyOption.REPLACE_EXISTING} : new java.nio.file.CopyOption[0];
        java.nio.file.Path pathMove = java.nio.file.Files.move(path, target, (java.nio.file.CopyOption[]) java.util.Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathMove, "move(...)");
        return pathMove;
    }

    private static final java.nio.file.FileStore fileStore(java.nio.file.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        java.nio.file.FileStore fileStore = java.nio.file.Files.getFileStore(path);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fileStore, "getFileStore(...)");
        return fileStore;
    }

    private static final java.lang.Object getAttribute(java.nio.file.Path path, java.lang.String attribute, java.nio.file.LinkOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attribute, "attribute");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return java.nio.file.Files.getAttribute(path, attribute, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(options, options.length));
    }

    private static final java.nio.file.Path setAttribute(java.nio.file.Path path, java.lang.String attribute, java.lang.Object obj, java.nio.file.LinkOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attribute, "attribute");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.nio.file.Path attribute2 = java.nio.file.Files.setAttribute(path, attribute, obj, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(attribute2, "setAttribute(...)");
        return attribute2;
    }

    private static final /* synthetic */ <V extends java.nio.file.attribute.FileAttributeView> V fileAttributesViewOrNull(java.nio.file.Path path, java.nio.file.LinkOption... options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        return (V) java.nio.file.Files.getFileAttributeView(path, java.nio.file.attribute.FileAttributeView.class, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(options, options.length));
    }

    private static final /* synthetic */ <V extends java.nio.file.attribute.FileAttributeView> V fileAttributesView(java.nio.file.Path path, java.nio.file.LinkOption... options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        V v = (V) java.nio.file.Files.getFileAttributeView(path, java.nio.file.attribute.FileAttributeView.class, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(options, options.length));
        if (v != null) {
            return v;
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        kotlin.io.path.PathsKt.fileAttributeViewNotAvailable(path, java.nio.file.attribute.FileAttributeView.class);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final java.lang.Void fileAttributeViewNotAvailable(java.nio.file.Path path, java.lang.Class<?> attributeViewClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributeViewClass, "attributeViewClass");
        throw new java.lang.UnsupportedOperationException("The desired attribute view type " + attributeViewClass + " is not available for the file " + path + '.');
    }

    private static final /* synthetic */ <A extends java.nio.file.attribute.BasicFileAttributes> A readAttributes(java.nio.file.Path path, java.nio.file.LinkOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
        A a2 = (A) java.nio.file.Files.readAttributes(path, java.nio.file.attribute.BasicFileAttributes.class, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "readAttributes(...)");
        return a2;
    }

    private static final java.util.Map<java.lang.String, java.lang.Object> readAttributes(java.nio.file.Path path, java.lang.String attributes, java.nio.file.LinkOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "attributes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.util.Map<java.lang.String, java.lang.Object> attributes2 = java.nio.file.Files.readAttributes(path, attributes, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(attributes2, "readAttributes(...)");
        return attributes2;
    }

    private static final java.nio.file.attribute.FileTime getLastModifiedTime(java.nio.file.Path path, java.nio.file.LinkOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.nio.file.attribute.FileTime lastModifiedTime = java.nio.file.Files.getLastModifiedTime(path, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lastModifiedTime, "getLastModifiedTime(...)");
        return lastModifiedTime;
    }

    private static final java.nio.file.Path setLastModifiedTime(java.nio.file.Path path, java.nio.file.attribute.FileTime value) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        java.nio.file.Path lastModifiedTime = java.nio.file.Files.setLastModifiedTime(path, value);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lastModifiedTime, "setLastModifiedTime(...)");
        return lastModifiedTime;
    }

    private static final java.nio.file.attribute.UserPrincipal getOwner(java.nio.file.Path path, java.nio.file.LinkOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return java.nio.file.Files.getOwner(path, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(options, options.length));
    }

    private static final java.nio.file.Path setOwner(java.nio.file.Path path, java.nio.file.attribute.UserPrincipal value) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        java.nio.file.Path owner = java.nio.file.Files.setOwner(path, value);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(owner, "setOwner(...)");
        return owner;
    }

    private static final java.util.Set<java.nio.file.attribute.PosixFilePermission> getPosixFilePermissions(java.nio.file.Path path, java.nio.file.LinkOption... options) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        java.util.Set<java.nio.file.attribute.PosixFilePermission> posixFilePermissions = java.nio.file.Files.getPosixFilePermissions(path, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(posixFilePermissions, "getPosixFilePermissions(...)");
        return posixFilePermissions;
    }

    private static final java.nio.file.Path setPosixFilePermissions(java.nio.file.Path path, java.util.Set<? extends java.nio.file.attribute.PosixFilePermission> value) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        java.nio.file.Path posixFilePermissions = java.nio.file.Files.setPosixFilePermissions(path, value);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(posixFilePermissions, "setPosixFilePermissions(...)");
        return posixFilePermissions;
    }

    private static final java.nio.file.Path createLinkPointingTo(java.nio.file.Path path, java.nio.file.Path target) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        java.nio.file.Path pathCreateLink = java.nio.file.Files.createLink(path, target);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateLink, "createLink(...)");
        return pathCreateLink;
    }

    private static final java.nio.file.Path createSymbolicLinkPointingTo(java.nio.file.Path path, java.nio.file.Path target, java.nio.file.attribute.FileAttribute<?>... attributes) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "attributes");
        java.nio.file.Path pathCreateSymbolicLink = java.nio.file.Files.createSymbolicLink(path, target, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateSymbolicLink, "createSymbolicLink(...)");
        return pathCreateSymbolicLink;
    }

    private static final java.nio.file.Path readSymbolicLink(java.nio.file.Path path) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        java.nio.file.Path symbolicLink = java.nio.file.Files.readSymbolicLink(path);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(symbolicLink, "readSymbolicLink(...)");
        return symbolicLink;
    }

    private static final java.nio.file.Path createFile(java.nio.file.Path path, java.nio.file.attribute.FileAttribute<?>... attributes) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "attributes");
        java.nio.file.Path pathCreateFile = java.nio.file.Files.createFile(path, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateFile, "createFile(...)");
        return pathCreateFile;
    }

    static /* synthetic */ java.nio.file.Path createTempFile$default(java.lang.String str, java.lang.String str2, java.nio.file.attribute.FileAttribute[] attributes, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "attributes");
        java.nio.file.Path pathCreateTempFile = java.nio.file.Files.createTempFile(str, str2, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateTempFile, "createTempFile(...)");
        return pathCreateTempFile;
    }

    private static final java.nio.file.Path createTempFile(java.lang.String str, java.lang.String str2, java.nio.file.attribute.FileAttribute<?>... attributes) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "attributes");
        java.nio.file.Path pathCreateTempFile = java.nio.file.Files.createTempFile(str, str2, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateTempFile, "createTempFile(...)");
        return pathCreateTempFile;
    }

    public static /* synthetic */ java.nio.file.Path createTempFile$default(java.nio.file.Path path, java.lang.String str, java.lang.String str2, java.nio.file.attribute.FileAttribute[] fileAttributeArr, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return kotlin.io.path.PathsKt.createTempFile(path, str, str2, fileAttributeArr);
    }

    public static final java.nio.file.Path createTempFile(java.nio.file.Path path, java.lang.String str, java.lang.String str2, java.nio.file.attribute.FileAttribute<?>... attributes) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "attributes");
        if (path != null) {
            java.nio.file.Path pathCreateTempFile = java.nio.file.Files.createTempFile(path, str, str2, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(attributes, attributes.length));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateTempFile, "createTempFile(...)");
            return pathCreateTempFile;
        }
        java.nio.file.Path pathCreateTempFile2 = java.nio.file.Files.createTempFile(str, str2, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateTempFile2, "createTempFile(...)");
        return pathCreateTempFile2;
    }

    static /* synthetic */ java.nio.file.Path createTempDirectory$default(java.lang.String str, java.nio.file.attribute.FileAttribute[] attributes, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            str = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "attributes");
        java.nio.file.Path pathCreateTempDirectory = java.nio.file.Files.createTempDirectory(str, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateTempDirectory, "createTempDirectory(...)");
        return pathCreateTempDirectory;
    }

    private static final java.nio.file.Path createTempDirectory(java.lang.String str, java.nio.file.attribute.FileAttribute<?>... attributes) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "attributes");
        java.nio.file.Path pathCreateTempDirectory = java.nio.file.Files.createTempDirectory(str, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateTempDirectory, "createTempDirectory(...)");
        return pathCreateTempDirectory;
    }

    public static /* synthetic */ java.nio.file.Path createTempDirectory$default(java.nio.file.Path path, java.lang.String str, java.nio.file.attribute.FileAttribute[] fileAttributeArr, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            str = null;
        }
        return kotlin.io.path.PathsKt.createTempDirectory(path, str, fileAttributeArr);
    }

    public static final java.nio.file.Path createTempDirectory(java.nio.file.Path path, java.lang.String str, java.nio.file.attribute.FileAttribute<?>... attributes) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "attributes");
        if (path != null) {
            java.nio.file.Path pathCreateTempDirectory = java.nio.file.Files.createTempDirectory(path, str, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(attributes, attributes.length));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateTempDirectory, "createTempDirectory(...)");
            return pathCreateTempDirectory;
        }
        java.nio.file.Path pathCreateTempDirectory2 = java.nio.file.Files.createTempDirectory(str, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateTempDirectory2, "createTempDirectory(...)");
        return pathCreateTempDirectory2;
    }

    private static final java.nio.file.Path div(java.nio.file.Path path, java.nio.file.Path other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.nio.file.Path pathResolve = path.resolve(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathResolve, "resolve(...)");
        return pathResolve;
    }

    private static final java.nio.file.Path div(java.nio.file.Path path, java.lang.String other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.nio.file.Path pathResolve = path.resolve(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathResolve, "resolve(...)");
        return pathResolve;
    }

    private static final java.nio.file.Path Path(java.lang.String path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        java.nio.file.Path path2 = java.nio.file.Paths.get(path, new java.lang.String[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path2, "get(...)");
        return path2;
    }

    private static final java.nio.file.Path Path(java.lang.String base, java.lang.String... subpaths) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subpaths, "subpaths");
        java.nio.file.Path path = java.nio.file.Paths.get(base, (java.lang.String[]) java.util.Arrays.copyOf(subpaths, subpaths.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    private static final java.nio.file.Path toPath(java.net.URI uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "<this>");
        java.nio.file.Path path = java.nio.file.Paths.get(uri);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    public static final kotlin.sequences.Sequence<java.nio.file.Path> walk(java.nio.file.Path path, kotlin.io.path.PathWalkOption... options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        return new kotlin.io.path.PathTreeWalk(path, options);
    }

    public static /* synthetic */ void visitFileTree$default(java.nio.file.Path path, java.nio.file.FileVisitor fileVisitor, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        kotlin.io.path.PathsKt.visitFileTree(path, (java.nio.file.FileVisitor<java.nio.file.Path>) fileVisitor, i, z);
    }

    public static final void visitFileTree(java.nio.file.Path path, java.nio.file.FileVisitor<java.nio.file.Path> visitor, int i, boolean z) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visitor, "visitor");
        java.nio.file.Files.walkFileTree(path, z ? kotlin.collections.SetsKt.setOf(java.nio.file.FileVisitOption.FOLLOW_LINKS) : kotlin.collections.SetsKt.emptySet(), i, visitor);
    }

    public static /* synthetic */ void visitFileTree$default(java.nio.file.Path path, int i, boolean z, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        kotlin.io.path.PathsKt.visitFileTree(path, i, z, (kotlin.jvm.functions.Function1<? super kotlin.io.path.FileVisitorBuilder, kotlin.Unit>) function1);
    }

    public static final void visitFileTree(java.nio.file.Path path, int i, boolean z, kotlin.jvm.functions.Function1<? super kotlin.io.path.FileVisitorBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        kotlin.io.path.PathsKt.visitFileTree(path, kotlin.io.path.PathsKt.fileVisitor(builderAction), i, z);
    }

    public static final java.nio.file.FileVisitor<java.nio.file.Path> fileVisitor(kotlin.jvm.functions.Function1<? super kotlin.io.path.FileVisitorBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        kotlin.io.path.FileVisitorBuilderImpl fileVisitorBuilderImpl = new kotlin.io.path.FileVisitorBuilderImpl();
        builderAction.invoke(fileVisitorBuilderImpl);
        return fileVisitorBuilderImpl.build();
    }
}
