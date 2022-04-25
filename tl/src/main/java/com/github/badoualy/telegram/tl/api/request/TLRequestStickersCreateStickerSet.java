package com.github.badoualy.telegram.tl.api.request;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAbsInputDocument;
import com.github.badoualy.telegram.tl.api.TLAbsInputUser;
import com.github.badoualy.telegram.tl.api.TLInputStickerSetItem;
import com.github.badoualy.telegram.tl.api.messages.TLAbsStickerSet;
import com.github.badoualy.telegram.tl.core.TLMethod;
import com.github.badoualy.telegram.tl.core.TLObject;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLRequestStickersCreateStickerSet extends TLMethod<TLAbsStickerSet> {
    public static final int CONSTRUCTOR_ID = 0x9021ab67;

    protected int flags;

    protected boolean masks;

    protected boolean animated;

    protected boolean videos;

    protected TLAbsInputUser userId;

    protected String title;

    protected String shortName;

    protected TLAbsInputDocument thumb;

    protected TLVector<TLInputStickerSetItem> stickers;

    protected String software;

    private final String _constructor = "stickers.createStickerSet#9021ab67";

    public TLRequestStickersCreateStickerSet() {
    }

    public TLRequestStickersCreateStickerSet(boolean masks, boolean animated, boolean videos, TLAbsInputUser userId, String title, String shortName, TLAbsInputDocument thumb, TLVector<TLInputStickerSetItem> stickers, String software) {
        this.masks = masks;
        this.animated = animated;
        this.videos = videos;
        this.userId = userId;
        this.title = title;
        this.shortName = shortName;
        this.thumb = thumb;
        this.stickers = stickers;
        this.software = software;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLAbsStickerSet deserializeResponse(InputStream stream, TLContext context) throws IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLAbsStickerSet)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLAbsStickerSet) response;
    }

    private void computeFlags() {
        flags = 0;
        flags = masks ? (flags | 1) : (flags & ~1);
        flags = animated ? (flags | 2) : (flags & ~2);
        flags = videos ? (flags | 16) : (flags & ~16);
        flags = thumb != null ? (flags | 4) : (flags & ~4);
        flags = software != null ? (flags | 8) : (flags & ~8);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeTLObject(userId, stream);
        writeString(title, stream);
        writeString(shortName, stream);
        if ((flags & 4) != 0) {
            if (thumb == null) throwNullFieldException("thumb", flags);
            writeTLObject(thumb, stream);
        }
        writeTLVector(stickers, stream);
        if ((flags & 8) != 0) {
            if (software == null) throwNullFieldException("software", flags);
            writeString(software, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        masks = (flags & 1) != 0;
        animated = (flags & 2) != 0;
        videos = (flags & 16) != 0;
        userId = readTLObject(stream, context, TLAbsInputUser.class, -1);
        title = readTLString(stream);
        shortName = readTLString(stream);
        thumb = (flags & 4) != 0 ? readTLObject(stream, context, TLAbsInputDocument.class, -1) : null;
        stickers = readTLVector(stream, context);
        software = (flags & 8) != 0 ? readTLString(stream) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += userId.computeSerializedSize();
        size += computeTLStringSerializedSize(title);
        size += computeTLStringSerializedSize(shortName);
        if ((flags & 4) != 0) {
            if (thumb == null) throwNullFieldException("thumb", flags);
            size += thumb.computeSerializedSize();
        }
        size += stickers.computeSerializedSize();
        if ((flags & 8) != 0) {
            if (software == null) throwNullFieldException("software", flags);
            size += computeTLStringSerializedSize(software);
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

    public boolean getMasks() {
        return masks;
    }

    public void setMasks(boolean masks) {
        this.masks = masks;
    }

    public boolean getAnimated() {
        return animated;
    }

    public void setAnimated(boolean animated) {
        this.animated = animated;
    }

    public boolean getVideos() {
        return videos;
    }

    public void setVideos(boolean videos) {
        this.videos = videos;
    }

    public TLAbsInputUser getUserId() {
        return userId;
    }

    public void setUserId(TLAbsInputUser userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public TLAbsInputDocument getThumb() {
        return thumb;
    }

    public void setThumb(TLAbsInputDocument thumb) {
        this.thumb = thumb;
    }

    public TLVector<TLInputStickerSetItem> getStickers() {
        return stickers;
    }

    public void setStickers(TLVector<TLInputStickerSetItem> stickers) {
        this.stickers = stickers;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }
}
