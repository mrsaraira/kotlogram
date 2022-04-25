package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLObject;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLStickerSet extends TLObject {
    public static final int CONSTRUCTOR_ID = 0xd7df217a;

    protected int flags;

    protected boolean archived;

    protected boolean official;

    protected boolean masks;

    protected boolean animated;

    protected boolean videos;

    protected Integer installedDate;

    protected long id;

    protected long accessHash;

    protected String title;

    protected String shortName;

    protected TLVector<TLAbsPhotoSize> thumbs;

    protected Integer thumbDcId;

    protected Integer thumbVersion;

    protected int count;

    protected int hash;

    private final String _constructor = "stickerSet#d7df217a";

    public TLStickerSet() {
    }

    public TLStickerSet(boolean archived, boolean official, boolean masks, boolean animated, boolean videos, Integer installedDate, long id, long accessHash, String title, String shortName, TLVector<TLAbsPhotoSize> thumbs, Integer thumbDcId, Integer thumbVersion, int count, int hash) {
        this.archived = archived;
        this.official = official;
        this.masks = masks;
        this.animated = animated;
        this.videos = videos;
        this.installedDate = installedDate;
        this.id = id;
        this.accessHash = accessHash;
        this.title = title;
        this.shortName = shortName;
        this.thumbs = thumbs;
        this.thumbDcId = thumbDcId;
        this.thumbVersion = thumbVersion;
        this.count = count;
        this.hash = hash;
    }

    private void computeFlags() {
        flags = 0;
        flags = archived ? (flags | 2) : (flags & ~2);
        flags = official ? (flags | 4) : (flags & ~4);
        flags = masks ? (flags | 8) : (flags & ~8);
        flags = animated ? (flags | 32) : (flags & ~32);
        flags = videos ? (flags | 64) : (flags & ~64);
        flags = installedDate != null ? (flags | 1) : (flags & ~1);
        flags = thumbs != null ? (flags | 16) : (flags & ~16);
        flags = thumbDcId != null ? (flags | 16) : (flags & ~16);
        flags = thumbVersion != null ? (flags | 16) : (flags & ~16);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        if ((flags & 1) != 0) {
            if (installedDate == null) throwNullFieldException("installedDate", flags);
            writeInt(installedDate, stream);
        }
        writeLong(id, stream);
        writeLong(accessHash, stream);
        writeString(title, stream);
        writeString(shortName, stream);
        if ((flags & 16) != 0) {
            if (thumbs == null) throwNullFieldException("thumbs", flags);
            writeTLVector(thumbs, stream);
        }
        if ((flags & 16) != 0) {
            if (thumbDcId == null) throwNullFieldException("thumbDcId", flags);
            writeInt(thumbDcId, stream);
        }
        if ((flags & 16) != 0) {
            if (thumbVersion == null) throwNullFieldException("thumbVersion", flags);
            writeInt(thumbVersion, stream);
        }
        writeInt(count, stream);
        writeInt(hash, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        archived = (flags & 2) != 0;
        official = (flags & 4) != 0;
        masks = (flags & 8) != 0;
        animated = (flags & 32) != 0;
        videos = (flags & 64) != 0;
        installedDate = (flags & 1) != 0 ? readInt(stream) : null;
        id = readLong(stream);
        accessHash = readLong(stream);
        title = readTLString(stream);
        shortName = readTLString(stream);
        thumbs = (flags & 16) != 0 ? readTLVector(stream, context) : null;
        thumbDcId = (flags & 16) != 0 ? readInt(stream) : null;
        thumbVersion = (flags & 16) != 0 ? readInt(stream) : null;
        count = readInt(stream);
        hash = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        if ((flags & 1) != 0) {
            if (installedDate == null) throwNullFieldException("installedDate", flags);
            size += SIZE_INT32;
        }
        size += SIZE_INT64;
        size += SIZE_INT64;
        size += computeTLStringSerializedSize(title);
        size += computeTLStringSerializedSize(shortName);
        if ((flags & 16) != 0) {
            if (thumbs == null) throwNullFieldException("thumbs", flags);
            size += thumbs.computeSerializedSize();
        }
        if ((flags & 16) != 0) {
            if (thumbDcId == null) throwNullFieldException("thumbDcId", flags);
            size += SIZE_INT32;
        }
        if ((flags & 16) != 0) {
            if (thumbVersion == null) throwNullFieldException("thumbVersion", flags);
            size += SIZE_INT32;
        }
        size += SIZE_INT32;
        size += SIZE_INT32;
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

    public boolean getArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public boolean getOfficial() {
        return official;
    }

    public void setOfficial(boolean official) {
        this.official = official;
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

    public Integer getInstalledDate() {
        return installedDate;
    }

    public void setInstalledDate(Integer installedDate) {
        this.installedDate = installedDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAccessHash() {
        return accessHash;
    }

    public void setAccessHash(long accessHash) {
        this.accessHash = accessHash;
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

    public TLVector<TLAbsPhotoSize> getThumbs() {
        return thumbs;
    }

    public void setThumbs(TLVector<TLAbsPhotoSize> thumbs) {
        this.thumbs = thumbs;
    }

    public Integer getThumbDcId() {
        return thumbDcId;
    }

    public void setThumbDcId(Integer thumbDcId) {
        this.thumbDcId = thumbDcId;
    }

    public Integer getThumbVersion() {
        return thumbVersion;
    }

    public void setThumbVersion(Integer thumbVersion) {
        this.thumbVersion = thumbVersion;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }
}
