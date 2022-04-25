package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLChatInvite extends TLAbsChatInvite {
    public static final int CONSTRUCTOR_ID = 0x300c44c1;

    protected int flags;

    protected boolean channel;

    protected boolean broadcast;

    protected boolean _public;

    protected boolean megagroup;

    protected boolean requestNeeded;

    protected String title;

    protected String about;

    protected TLAbsPhoto photo;

    protected int participantsCount;

    protected TLVector<TLAbsUser> participants;

    private final String _constructor = "chatInvite#300c44c1";

    public TLChatInvite() {
    }

    public TLChatInvite(boolean channel, boolean broadcast, boolean _public, boolean megagroup, boolean requestNeeded, String title, String about, TLAbsPhoto photo, int participantsCount, TLVector<TLAbsUser> participants) {
        this.channel = channel;
        this.broadcast = broadcast;
        this._public = _public;
        this.megagroup = megagroup;
        this.requestNeeded = requestNeeded;
        this.title = title;
        this.about = about;
        this.photo = photo;
        this.participantsCount = participantsCount;
        this.participants = participants;
    }

    private void computeFlags() {
        flags = 0;
        flags = channel ? (flags | 1) : (flags & ~1);
        flags = broadcast ? (flags | 2) : (flags & ~2);
        flags = _public ? (flags | 4) : (flags & ~4);
        flags = megagroup ? (flags | 8) : (flags & ~8);
        flags = requestNeeded ? (flags | 64) : (flags & ~64);
        flags = about != null ? (flags | 32) : (flags & ~32);
        flags = participants != null ? (flags | 16) : (flags & ~16);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeString(title, stream);
        if ((flags & 32) != 0) {
            if (about == null) throwNullFieldException("about", flags);
            writeString(about, stream);
        }
        writeTLObject(photo, stream);
        writeInt(participantsCount, stream);
        if ((flags & 16) != 0) {
            if (participants == null) throwNullFieldException("participants", flags);
            writeTLVector(participants, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        channel = (flags & 1) != 0;
        broadcast = (flags & 2) != 0;
        _public = (flags & 4) != 0;
        megagroup = (flags & 8) != 0;
        requestNeeded = (flags & 64) != 0;
        title = readTLString(stream);
        about = (flags & 32) != 0 ? readTLString(stream) : null;
        photo = readTLObject(stream, context, TLAbsPhoto.class, -1);
        participantsCount = readInt(stream);
        participants = (flags & 16) != 0 ? readTLVector(stream, context) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += computeTLStringSerializedSize(title);
        if ((flags & 32) != 0) {
            if (about == null) throwNullFieldException("about", flags);
            size += computeTLStringSerializedSize(about);
        }
        size += photo.computeSerializedSize();
        size += SIZE_INT32;
        if ((flags & 16) != 0) {
            if (participants == null) throwNullFieldException("participants", flags);
            size += participants.computeSerializedSize();
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

    public boolean getChannel() {
        return channel;
    }

    public void setChannel(boolean channel) {
        this.channel = channel;
    }

    public boolean getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(boolean broadcast) {
        this.broadcast = broadcast;
    }

    public boolean getPublic() {
        return _public;
    }

    public void setPublic(boolean _public) {
        this._public = _public;
    }

    public boolean getMegagroup() {
        return megagroup;
    }

    public void setMegagroup(boolean megagroup) {
        this.megagroup = megagroup;
    }

    public boolean getRequestNeeded() {
        return requestNeeded;
    }

    public void setRequestNeeded(boolean requestNeeded) {
        this.requestNeeded = requestNeeded;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public TLAbsPhoto getPhoto() {
        return photo;
    }

    public void setPhoto(TLAbsPhoto photo) {
        this.photo = photo;
    }

    public int getParticipantsCount() {
        return participantsCount;
    }

    public void setParticipantsCount(int participantsCount) {
        this.participantsCount = participantsCount;
    }

    public TLVector<TLAbsUser> getParticipants() {
        return participants;
    }

    public void setParticipants(TLVector<TLAbsUser> participants) {
        this.participants = participants;
    }
}
