package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLInputChatUploadedPhoto extends TLAbsInputChatPhoto {
    public static final int CONSTRUCTOR_ID = 0xc642724e;

    protected int flags;

    protected TLAbsInputFile file;

    protected TLAbsInputFile video;

    protected Double videoStartTs;

    private final String _constructor = "inputChatUploadedPhoto#c642724e";

    public TLInputChatUploadedPhoto() {
    }

    public TLInputChatUploadedPhoto(TLAbsInputFile file, TLAbsInputFile video, Double videoStartTs) {
        this.file = file;
        this.video = video;
        this.videoStartTs = videoStartTs;
    }

    private void computeFlags() {
        flags = 0;
        flags = file != null ? (flags | 1) : (flags & ~1);
        flags = video != null ? (flags | 2) : (flags & ~2);
        flags = videoStartTs != null ? (flags | 4) : (flags & ~4);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        if ((flags & 1) != 0) {
            if (file == null) throwNullFieldException("file", flags);
            writeTLObject(file, stream);
        }
        if ((flags & 2) != 0) {
            if (video == null) throwNullFieldException("video", flags);
            writeTLObject(video, stream);
        }
        if ((flags & 4) != 0) {
            if (videoStartTs == null) throwNullFieldException("videoStartTs", flags);
            writeDouble(videoStartTs, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        file = (flags & 1) != 0 ? readTLObject(stream, context, TLAbsInputFile.class, -1) : null;
        video = (flags & 2) != 0 ? readTLObject(stream, context, TLAbsInputFile.class, -1) : null;
        videoStartTs = (flags & 4) != 0 ? readDouble(stream) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        if ((flags & 1) != 0) {
            if (file == null) throwNullFieldException("file", flags);
            size += file.computeSerializedSize();
        }
        if ((flags & 2) != 0) {
            if (video == null) throwNullFieldException("video", flags);
            size += video.computeSerializedSize();
        }
        if ((flags & 4) != 0) {
            if (videoStartTs == null) throwNullFieldException("videoStartTs", flags);
            size += SIZE_DOUBLE;
        }
        return size;
    }

    @Override
    public String toString() {
        return _constructor;
    }

    @Override
    public int getConstructorId() {
        return CONSTRUCTOR_ID;
    }

    public TLAbsInputFile getFile() {
        return file;
    }

    public void setFile(TLAbsInputFile file) {
        this.file = file;
    }

    public TLAbsInputFile getVideo() {
        return video;
    }

    public void setVideo(TLAbsInputFile video) {
        this.video = video;
    }

    public Double getVideoStartTs() {
        return videoStartTs;
    }

    public void setVideoStartTs(Double videoStartTs) {
        this.videoStartTs = videoStartTs;
    }
}
