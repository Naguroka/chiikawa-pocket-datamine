package androidx.media3.common.audio;

/* JADX INFO: loaded from: classes.dex */
public final class ToInt16PcmAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {
    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public androidx.media3.common.audio.AudioProcessor.AudioFormat onConfigure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) throws androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException {
        int i = audioFormat.encoding;
        if (i != 3 && i != 2 && i != 268435456 && i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4) {
            throw new androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        if (i != 2) {
            return new androidx.media3.common.audio.AudioProcessor.AudioFormat(audioFormat.sampleRate, audioFormat.channelCount, 2);
        }
        return androidx.media3.common.audio.AudioProcessor.AudioFormat.NOT_SET;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(java.nio.ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.inputAudioFormat.encoding;
        if (i2 == 3) {
            i *= 2;
        } else if (i2 != 4) {
            if (i2 != 21) {
                if (i2 == 22) {
                    i /= 2;
                } else if (i2 != 268435456) {
                    if (i2 != 1342177280) {
                        if (i2 != 1610612736) {
                            throw new java.lang.IllegalStateException();
                        }
                        i /= 2;
                    }
                }
            }
            i /= 3;
            i *= 2;
        } else {
            i /= 2;
        }
        java.nio.ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(i);
        int i3 = this.inputAudioFormat.encoding;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferReplaceOutputBuffer.put((byte) 0);
                byteBufferReplaceOutputBuffer.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sConstrainValue = (short) (androidx.media3.common.util.Util.constrainValue(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferReplaceOutputBuffer.put((byte) (sConstrainValue & 255));
                byteBufferReplaceOutputBuffer.put((byte) ((sConstrainValue >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 21) {
            while (iPosition < iLimit) {
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 1));
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i3 == 22) {
            while (iPosition < iLimit) {
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 2));
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 1));
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 1));
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i3 != 1610612736) {
                throw new java.lang.IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 1));
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferReplaceOutputBuffer.flip();
    }
}
