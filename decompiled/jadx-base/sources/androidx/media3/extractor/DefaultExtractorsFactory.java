package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultExtractorsFactory implements androidx.media3.extractor.ExtractorsFactory {
    private static final int[] DEFAULT_EXTRACTOR_ORDER = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader FLAC_EXTENSION_LOADER = new androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader(new androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier() { // from class: androidx.media3.extractor.DefaultExtractorsFactory$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier
        public final java.lang.reflect.Constructor getConstructor() {
            return androidx.media3.extractor.DefaultExtractorsFactory.getFlacExtractorConstructor();
        }
    });
    private static final androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader MIDI_EXTENSION_LOADER = new androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader(new androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier() { // from class: androidx.media3.extractor.DefaultExtractorsFactory$$ExternalSyntheticLambda1
        @Override // androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier
        public final java.lang.reflect.Constructor getConstructor() {
            return androidx.media3.extractor.DefaultExtractorsFactory.getMidiExtractorConstructor();
        }
    });
    private int adtsFlags;
    private int amrFlags;
    private boolean constantBitrateSeekingAlwaysEnabled;
    private boolean constantBitrateSeekingEnabled;
    private int flacFlags;
    private int fragmentedMp4Flags;
    private int jpegFlags;
    private int matroskaFlags;
    private int mp3Flags;
    private int mp4Flags;
    private int tsFlags;
    private com.google.common.collect.ImmutableList<androidx.media3.common.Format> tsSubtitleFormats;
    private int tsMode = 1;
    private int tsTimestampSearchBytes = androidx.media3.extractor.ts.TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES;
    private androidx.media3.extractor.text.SubtitleParser.Factory subtitleParserFactory = new androidx.media3.extractor.text.DefaultSubtitleParserFactory();
    private boolean textTrackTranscodingEnabled = true;

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setConstantBitrateSeekingEnabled(boolean z) {
        this.constantBitrateSeekingEnabled = z;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setConstantBitrateSeekingAlwaysEnabled(boolean z) {
        this.constantBitrateSeekingAlwaysEnabled = z;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setAdtsExtractorFlags(int i) {
        this.adtsFlags = i;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setAmrExtractorFlags(int i) {
        this.amrFlags = i;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setFlacExtractorFlags(int i) {
        this.flacFlags = i;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setMatroskaExtractorFlags(int i) {
        this.matroskaFlags = i;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setMp4ExtractorFlags(int i) {
        this.mp4Flags = i;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setFragmentedMp4ExtractorFlags(int i) {
        this.fragmentedMp4Flags = i;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setMp3ExtractorFlags(int i) {
        this.mp3Flags = i;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setTsExtractorMode(int i) {
        this.tsMode = i;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setTsExtractorFlags(int i) {
        this.tsFlags = i;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setTsSubtitleFormats(java.util.List<androidx.media3.common.Format> list) {
        this.tsSubtitleFormats = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setTsExtractorTimestampSearchBytes(int i) {
        this.tsTimestampSearchBytes = i;
        return this;
    }

    @java.lang.Deprecated
    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setTextTrackTranscodingEnabled(boolean z) {
        return experimentalSetTextTrackTranscodingEnabled(z);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    @java.lang.Deprecated
    public synchronized androidx.media3.extractor.DefaultExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
        this.textTrackTranscodingEnabled = z;
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        this.subtitleParserFactory = factory;
        return this;
    }

    public synchronized androidx.media3.extractor.DefaultExtractorsFactory setJpegExtractorFlags(int i) {
        this.jpegFlags = i;
        return this;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public synchronized androidx.media3.extractor.Extractor[] createExtractors() {
        return createExtractors(android.net.Uri.EMPTY, new java.util.HashMap());
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public synchronized androidx.media3.extractor.Extractor[] createExtractors(android.net.Uri uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        androidx.media3.extractor.Extractor[] extractorArr;
        int[] iArr = DEFAULT_EXTRACTOR_ORDER;
        java.util.ArrayList arrayList = new java.util.ArrayList(iArr.length);
        int iInferFileTypeFromResponseHeaders = androidx.media3.common.FileTypes.inferFileTypeFromResponseHeaders(map);
        if (iInferFileTypeFromResponseHeaders != -1) {
            addExtractorsForFileType(iInferFileTypeFromResponseHeaders, arrayList);
        }
        int iInferFileTypeFromUri = androidx.media3.common.FileTypes.inferFileTypeFromUri(uri);
        if (iInferFileTypeFromUri != -1 && iInferFileTypeFromUri != iInferFileTypeFromResponseHeaders) {
            addExtractorsForFileType(iInferFileTypeFromUri, arrayList);
        }
        for (int i : iArr) {
            if (i != iInferFileTypeFromResponseHeaders && i != iInferFileTypeFromUri) {
                addExtractorsForFileType(i, arrayList);
            }
        }
        extractorArr = new androidx.media3.extractor.Extractor[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            androidx.media3.extractor.Extractor subtitleTranscodingExtractor = arrayList.get(i2);
            if (this.textTrackTranscodingEnabled && !(subtitleTranscodingExtractor.getUnderlyingImplementation() instanceof androidx.media3.extractor.mp4.FragmentedMp4Extractor) && !(subtitleTranscodingExtractor.getUnderlyingImplementation() instanceof androidx.media3.extractor.mp4.Mp4Extractor) && !(subtitleTranscodingExtractor.getUnderlyingImplementation() instanceof androidx.media3.extractor.ts.TsExtractor) && !(subtitleTranscodingExtractor.getUnderlyingImplementation() instanceof androidx.media3.extractor.avi.AviExtractor) && !(subtitleTranscodingExtractor.getUnderlyingImplementation() instanceof androidx.media3.extractor.mkv.MatroskaExtractor)) {
                subtitleTranscodingExtractor = new androidx.media3.extractor.text.SubtitleTranscodingExtractor(subtitleTranscodingExtractor, this.subtitleParserFactory);
            }
            extractorArr[i2] = subtitleTranscodingExtractor;
        }
        return extractorArr;
    }

    private void addExtractorsForFileType(int i, java.util.List<androidx.media3.extractor.Extractor> list) {
        switch (i) {
            case 0:
                list.add(new androidx.media3.extractor.ts.Ac3Extractor());
                break;
            case 1:
                list.add(new androidx.media3.extractor.ts.Ac4Extractor());
                break;
            case 2:
                list.add(new androidx.media3.extractor.ts.AdtsExtractor(((this.adtsFlags | (this.constantBitrateSeekingEnabled ? 1 : 0)) == true ? 1 : 0) | (this.constantBitrateSeekingAlwaysEnabled ? 2 : 0)));
                break;
            case 3:
                list.add(new androidx.media3.extractor.amr.AmrExtractor(this.amrFlags | (this.constantBitrateSeekingEnabled ? 1 : 0) | (this.constantBitrateSeekingAlwaysEnabled ? 2 : 0)));
                break;
            case 4:
                androidx.media3.extractor.Extractor extractor = FLAC_EXTENSION_LOADER.getExtractor(java.lang.Integer.valueOf(this.flacFlags));
                if (extractor != null) {
                    list.add(extractor);
                } else {
                    list.add(new androidx.media3.extractor.flac.FlacExtractor(this.flacFlags));
                }
                break;
            case 5:
                list.add(new androidx.media3.extractor.flv.FlvExtractor());
                break;
            case 6:
                list.add(new androidx.media3.extractor.mkv.MatroskaExtractor(this.subtitleParserFactory, (this.textTrackTranscodingEnabled ? 0 : 2) | this.matroskaFlags));
                break;
            case 7:
                list.add(new androidx.media3.extractor.mp3.Mp3Extractor(this.mp3Flags | (this.constantBitrateSeekingEnabled ? 1 : 0) | (this.constantBitrateSeekingAlwaysEnabled ? 2 : 0)));
                break;
            case 8:
                list.add(new androidx.media3.extractor.mp4.FragmentedMp4Extractor(this.subtitleParserFactory, this.fragmentedMp4Flags | (this.textTrackTranscodingEnabled ? 0 : 32)));
                list.add(new androidx.media3.extractor.mp4.Mp4Extractor(this.subtitleParserFactory, this.mp4Flags | (this.textTrackTranscodingEnabled ? 0 : 16)));
                break;
            case 9:
                list.add(new androidx.media3.extractor.ogg.OggExtractor());
                break;
            case 10:
                list.add(new androidx.media3.extractor.ts.PsExtractor());
                break;
            case 11:
                if (this.tsSubtitleFormats == null) {
                    this.tsSubtitleFormats = com.google.common.collect.ImmutableList.of();
                }
                list.add(new androidx.media3.extractor.ts.TsExtractor(this.tsMode, !this.textTrackTranscodingEnabled ? 1 : 0, this.subtitleParserFactory, new androidx.media3.common.util.TimestampAdjuster(0L), new androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory(this.tsFlags, this.tsSubtitleFormats), this.tsTimestampSearchBytes));
                break;
            case 12:
                list.add(new androidx.media3.extractor.wav.WavExtractor());
                break;
            case 14:
                list.add(new androidx.media3.extractor.jpeg.JpegExtractor(this.jpegFlags));
                break;
            case 15:
                androidx.media3.extractor.Extractor extractor2 = MIDI_EXTENSION_LOADER.getExtractor(new java.lang.Object[0]);
                if (extractor2 != null) {
                    list.add(extractor2);
                }
                break;
            case 16:
                list.add(new androidx.media3.extractor.avi.AviExtractor(1 ^ (this.textTrackTranscodingEnabled ? 1 : 0), this.subtitleParserFactory));
                break;
            case 17:
                list.add(new androidx.media3.extractor.png.PngExtractor());
                break;
            case 18:
                list.add(new androidx.media3.extractor.webp.WebpExtractor());
                break;
            case 19:
                list.add(new androidx.media3.extractor.bmp.BmpExtractor());
                break;
            case 20:
                int i2 = this.mp4Flags;
                if ((i2 & 2) == 0 && (i2 & 4) == 0) {
                    list.add(new androidx.media3.extractor.heif.HeifExtractor());
                    break;
                }
                break;
            case 21:
                list.add(new androidx.media3.extractor.avif.AvifExtractor());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Constructor<? extends androidx.media3.extractor.Extractor> getMidiExtractorConstructor() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
        return java.lang.Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(androidx.media3.extractor.Extractor.class).getConstructor(new java.lang.Class[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Constructor<? extends androidx.media3.extractor.Extractor> getFlacExtractorConstructor() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
        if (java.lang.Boolean.TRUE.equals(java.lang.Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]))) {
            return java.lang.Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(androidx.media3.extractor.Extractor.class).getConstructor(java.lang.Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class ExtensionLoader {
        private final androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier constructorSupplier;
        private final java.util.concurrent.atomic.AtomicBoolean extensionLoaded = new java.util.concurrent.atomic.AtomicBoolean(false);
        private java.lang.reflect.Constructor<? extends androidx.media3.extractor.Extractor> extractorConstructor;

        public interface ConstructorSupplier {
            java.lang.reflect.Constructor<? extends androidx.media3.extractor.Extractor> getConstructor() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException;
        }

        public ExtensionLoader(androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier constructorSupplier) {
            this.constructorSupplier = constructorSupplier;
        }

        public androidx.media3.extractor.Extractor getExtractor(java.lang.Object... objArr) {
            java.lang.reflect.Constructor<? extends androidx.media3.extractor.Extractor> constructorMaybeLoadExtractorConstructor = maybeLoadExtractorConstructor();
            if (constructorMaybeLoadExtractorConstructor == null) {
                return null;
            }
            try {
                return constructorMaybeLoadExtractorConstructor.newInstance(objArr);
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalStateException("Unexpected error creating extractor", e);
            }
        }

        private java.lang.reflect.Constructor<? extends androidx.media3.extractor.Extractor> maybeLoadExtractorConstructor() {
            synchronized (this.extensionLoaded) {
                if (this.extensionLoaded.get()) {
                    return this.extractorConstructor;
                }
                try {
                    return this.constructorSupplier.getConstructor();
                } catch (java.lang.ClassNotFoundException unused) {
                    this.extensionLoaded.set(true);
                    return this.extractorConstructor;
                } catch (java.lang.Exception e) {
                    throw new java.lang.RuntimeException("Error instantiating extension", e);
                }
            }
        }
    }
}
