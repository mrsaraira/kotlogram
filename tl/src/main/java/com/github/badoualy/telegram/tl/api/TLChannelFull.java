package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.core.TLLongVector;
import com.github.badoualy.telegram.tl.core.TLStringVector;
import com.github.badoualy.telegram.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

public class TLChannelFull extends TLAbsChatFull {
    public static final int CONSTRUCTOR_ID = 0xe13c3d20;

    protected boolean canViewParticipants;

    protected boolean canSetUsername;

    protected boolean canSetStickers;

    protected boolean hiddenPrehistory;

    protected boolean canSetLocation;

    protected boolean hasScheduled;

    protected boolean canViewStats;

    protected boolean blocked;

    protected Integer participantsCount;

    protected Integer adminsCount;

    protected Integer kickedCount;

    protected Integer bannedCount;

    protected Integer onlineCount;

    protected int readInboxMaxId;

    protected int readOutboxMaxId;

    protected int unreadCount;

    protected TLAbsPhoto chatPhoto;

    protected TLChatInviteExported exportedInvite;

    protected TLVector<TLBotInfo> botInfo;

    protected Long migratedFromChatId;

    protected Integer migratedFromMaxId;

    protected Integer pinnedMsgId;

    protected TLStickerSet stickerset;

    protected Integer availableMinId;

    protected Long linkedChatId;

    protected TLAbsChannelLocation location;

    protected Integer slowmodeSeconds;

    protected Integer slowmodeNextSendDate;

    protected Integer statsDc;

    protected int pts;

    protected TLInputGroupCall call;

    protected Integer ttlPeriod;

    protected TLStringVector pendingSuggestions;

    protected TLAbsPeer groupcallDefaultJoinAs;

    protected String themeEmoticon;

    protected Integer requestsPending;

    protected TLLongVector recentRequesters;

    protected TLAbsPeer defaultSendAs;

    protected TLStringVector availableReactions;

    private final String _constructor = "channelFull#e13c3d20";

    public TLChannelFull() {
    }

    public TLChannelFull(boolean canViewParticipants, boolean canSetUsername, boolean canSetStickers, boolean hiddenPrehistory, boolean canSetLocation, boolean hasScheduled, boolean canViewStats, boolean blocked, long id, String about, Integer participantsCount, Integer adminsCount, Integer kickedCount, Integer bannedCount, Integer onlineCount, int readInboxMaxId, int readOutboxMaxId, int unreadCount, TLAbsPhoto chatPhoto, TLPeerNotifySettings notifySettings, TLChatInviteExported exportedInvite, TLVector<TLBotInfo> botInfo, Long migratedFromChatId, Integer migratedFromMaxId, Integer pinnedMsgId, TLStickerSet stickerset, Integer availableMinId, Integer folderId, Long linkedChatId, TLAbsChannelLocation location, Integer slowmodeSeconds, Integer slowmodeNextSendDate, Integer statsDc, int pts, TLInputGroupCall call, Integer ttlPeriod, TLStringVector pendingSuggestions, TLAbsPeer groupcallDefaultJoinAs, String themeEmoticon, Integer requestsPending, TLLongVector recentRequesters, TLAbsPeer defaultSendAs, TLStringVector availableReactions) {
        this.canViewParticipants = canViewParticipants;
        this.canSetUsername = canSetUsername;
        this.canSetStickers = canSetStickers;
        this.hiddenPrehistory = hiddenPrehistory;
        this.canSetLocation = canSetLocation;
        this.hasScheduled = hasScheduled;
        this.canViewStats = canViewStats;
        this.blocked = blocked;
        this.id = id;
        this.about = about;
        this.participantsCount = participantsCount;
        this.adminsCount = adminsCount;
        this.kickedCount = kickedCount;
        this.bannedCount = bannedCount;
        this.onlineCount = onlineCount;
        this.readInboxMaxId = readInboxMaxId;
        this.readOutboxMaxId = readOutboxMaxId;
        this.unreadCount = unreadCount;
        this.chatPhoto = chatPhoto;
        this.notifySettings = notifySettings;
        this.exportedInvite = exportedInvite;
        this.botInfo = botInfo;
        this.migratedFromChatId = migratedFromChatId;
        this.migratedFromMaxId = migratedFromMaxId;
        this.pinnedMsgId = pinnedMsgId;
        this.stickerset = stickerset;
        this.availableMinId = availableMinId;
        this.folderId = folderId;
        this.linkedChatId = linkedChatId;
        this.location = location;
        this.slowmodeSeconds = slowmodeSeconds;
        this.slowmodeNextSendDate = slowmodeNextSendDate;
        this.statsDc = statsDc;
        this.pts = pts;
        this.call = call;
        this.ttlPeriod = ttlPeriod;
        this.pendingSuggestions = pendingSuggestions;
        this.groupcallDefaultJoinAs = groupcallDefaultJoinAs;
        this.themeEmoticon = themeEmoticon;
        this.requestsPending = requestsPending;
        this.recentRequesters = recentRequesters;
        this.defaultSendAs = defaultSendAs;
        this.availableReactions = availableReactions;
    }

    private void computeFlags() {
        flags = 0;
        flags = canViewParticipants ? (flags | 8) : (flags & ~8);
        flags = canSetUsername ? (flags | 64) : (flags & ~64);
        flags = canSetStickers ? (flags | 128) : (flags & ~128);
        flags = hiddenPrehistory ? (flags | 1024) : (flags & ~1024);
        flags = canSetLocation ? (flags | 65536) : (flags & ~65536);
        flags = hasScheduled ? (flags | 524288) : (flags & ~524288);
        flags = canViewStats ? (flags | 1048576) : (flags & ~1048576);
        flags = blocked ? (flags | 4194304) : (flags & ~4194304);
        flags = participantsCount != null ? (flags | 1) : (flags & ~1);
        flags = adminsCount != null ? (flags | 2) : (flags & ~2);
        flags = kickedCount != null ? (flags | 4) : (flags & ~4);
        flags = bannedCount != null ? (flags | 4) : (flags & ~4);
        flags = onlineCount != null ? (flags | 8192) : (flags & ~8192);
        flags = exportedInvite != null ? (flags | 8388608) : (flags & ~8388608);
        flags = migratedFromChatId != null ? (flags | 16) : (flags & ~16);
        flags = migratedFromMaxId != null ? (flags | 16) : (flags & ~16);
        flags = pinnedMsgId != null ? (flags | 32) : (flags & ~32);
        flags = stickerset != null ? (flags | 256) : (flags & ~256);
        flags = availableMinId != null ? (flags | 512) : (flags & ~512);
        flags = folderId != null ? (flags | 2048) : (flags & ~2048);
        flags = linkedChatId != null ? (flags | 16384) : (flags & ~16384);
        flags = location != null ? (flags | 32768) : (flags & ~32768);
        flags = slowmodeSeconds != null ? (flags | 131072) : (flags & ~131072);
        flags = slowmodeNextSendDate != null ? (flags | 262144) : (flags & ~262144);
        flags = statsDc != null ? (flags | 4096) : (flags & ~4096);
        flags = call != null ? (flags | 2097152) : (flags & ~2097152);
        flags = ttlPeriod != null ? (flags | 16777216) : (flags & ~16777216);
        flags = pendingSuggestions != null ? (flags | 33554432) : (flags & ~33554432);
        flags = groupcallDefaultJoinAs != null ? (flags | 67108864) : (flags & ~67108864);
        flags = themeEmoticon != null ? (flags | 134217728) : (flags & ~134217728);
        flags = requestsPending != null ? (flags | 268435456) : (flags & ~268435456);
        flags = recentRequesters != null ? (flags | 268435456) : (flags & ~268435456);
        flags = defaultSendAs != null ? (flags | 536870912) : (flags & ~536870912);
        flags = availableReactions != null ? (flags | 1073741824) : (flags & ~1073741824);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeLong(id, stream);
        writeString(about, stream);
        if ((flags & 1) != 0) {
            if (participantsCount == null) throwNullFieldException("participantsCount", flags);
            writeInt(participantsCount, stream);
        }
        if ((flags & 2) != 0) {
            if (adminsCount == null) throwNullFieldException("adminsCount", flags);
            writeInt(adminsCount, stream);
        }
        if ((flags & 4) != 0) {
            if (kickedCount == null) throwNullFieldException("kickedCount", flags);
            writeInt(kickedCount, stream);
        }
        if ((flags & 4) != 0) {
            if (bannedCount == null) throwNullFieldException("bannedCount", flags);
            writeInt(bannedCount, stream);
        }
        if ((flags & 8192) != 0) {
            if (onlineCount == null) throwNullFieldException("onlineCount", flags);
            writeInt(onlineCount, stream);
        }
        writeInt(readInboxMaxId, stream);
        writeInt(readOutboxMaxId, stream);
        writeInt(unreadCount, stream);
        writeTLObject(chatPhoto, stream);
        writeTLObject(notifySettings, stream);
        if ((flags & 8388608) != 0) {
            if (exportedInvite == null) throwNullFieldException("exportedInvite", flags);
            writeTLObject(exportedInvite, stream);
        }
        writeTLVector(botInfo, stream);
        if ((flags & 16) != 0) {
            if (migratedFromChatId == null) throwNullFieldException("migratedFromChatId", flags);
            writeLong(migratedFromChatId, stream);
        }
        if ((flags & 16) != 0) {
            if (migratedFromMaxId == null) throwNullFieldException("migratedFromMaxId", flags);
            writeInt(migratedFromMaxId, stream);
        }
        if ((flags & 32) != 0) {
            if (pinnedMsgId == null) throwNullFieldException("pinnedMsgId", flags);
            writeInt(pinnedMsgId, stream);
        }
        if ((flags & 256) != 0) {
            if (stickerset == null) throwNullFieldException("stickerset", flags);
            writeTLObject(stickerset, stream);
        }
        if ((flags & 512) != 0) {
            if (availableMinId == null) throwNullFieldException("availableMinId", flags);
            writeInt(availableMinId, stream);
        }
        if ((flags & 2048) != 0) {
            if (folderId == null) throwNullFieldException("folderId", flags);
            writeInt(folderId, stream);
        }
        if ((flags & 16384) != 0) {
            if (linkedChatId == null) throwNullFieldException("linkedChatId", flags);
            writeLong(linkedChatId, stream);
        }
        if ((flags & 32768) != 0) {
            if (location == null) throwNullFieldException("location", flags);
            writeTLObject(location, stream);
        }
        if ((flags & 131072) != 0) {
            if (slowmodeSeconds == null) throwNullFieldException("slowmodeSeconds", flags);
            writeInt(slowmodeSeconds, stream);
        }
        if ((flags & 262144) != 0) {
            if (slowmodeNextSendDate == null) throwNullFieldException("slowmodeNextSendDate", flags);
            writeInt(slowmodeNextSendDate, stream);
        }
        if ((flags & 4096) != 0) {
            if (statsDc == null) throwNullFieldException("statsDc", flags);
            writeInt(statsDc, stream);
        }
        writeInt(pts, stream);
        if ((flags & 2097152) != 0) {
            if (call == null) throwNullFieldException("call", flags);
            writeTLObject(call, stream);
        }
        if ((flags & 16777216) != 0) {
            if (ttlPeriod == null) throwNullFieldException("ttlPeriod", flags);
            writeInt(ttlPeriod, stream);
        }
        if ((flags & 33554432) != 0) {
            if (pendingSuggestions == null) throwNullFieldException("pendingSuggestions", flags);
            writeTLVector(pendingSuggestions, stream);
        }
        if ((flags & 67108864) != 0) {
            if (groupcallDefaultJoinAs == null) throwNullFieldException("groupcallDefaultJoinAs", flags);
            writeTLObject(groupcallDefaultJoinAs, stream);
        }
        if ((flags & 134217728) != 0) {
            if (themeEmoticon == null) throwNullFieldException("themeEmoticon", flags);
            writeString(themeEmoticon, stream);
        }
        if ((flags & 268435456) != 0) {
            if (requestsPending == null) throwNullFieldException("requestsPending", flags);
            writeInt(requestsPending, stream);
        }
        if ((flags & 268435456) != 0) {
            if (recentRequesters == null) throwNullFieldException("recentRequesters", flags);
            writeTLVector(recentRequesters, stream);
        }
        if ((flags & 536870912) != 0) {
            if (defaultSendAs == null) throwNullFieldException("defaultSendAs", flags);
            writeTLObject(defaultSendAs, stream);
        }
        if ((flags & 1073741824) != 0) {
            if (availableReactions == null) throwNullFieldException("availableReactions", flags);
            writeTLVector(availableReactions, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        canViewParticipants = (flags & 8) != 0;
        canSetUsername = (flags & 64) != 0;
        canSetStickers = (flags & 128) != 0;
        hiddenPrehistory = (flags & 1024) != 0;
        canSetLocation = (flags & 65536) != 0;
        hasScheduled = (flags & 524288) != 0;
        canViewStats = (flags & 1048576) != 0;
        blocked = (flags & 4194304) != 0;
        id = readLong(stream);
        about = readTLString(stream);
        participantsCount = (flags & 1) != 0 ? readInt(stream) : null;
        adminsCount = (flags & 2) != 0 ? readInt(stream) : null;
        kickedCount = (flags & 4) != 0 ? readInt(stream) : null;
        bannedCount = (flags & 4) != 0 ? readInt(stream) : null;
        onlineCount = (flags & 8192) != 0 ? readInt(stream) : null;
        readInboxMaxId = readInt(stream);
        readOutboxMaxId = readInt(stream);
        unreadCount = readInt(stream);
        chatPhoto = readTLObject(stream, context, TLAbsPhoto.class, -1);
        notifySettings = readTLObject(stream, context, TLPeerNotifySettings.class, TLPeerNotifySettings.CONSTRUCTOR_ID);
        exportedInvite = (flags & 8388608) != 0 ? readTLObject(stream, context, TLChatInviteExported.class, TLChatInviteExported.CONSTRUCTOR_ID) : null;
        botInfo = readTLVector(stream, context);
        migratedFromChatId = (flags & 16) != 0 ? readLong(stream) : null;
        migratedFromMaxId = (flags & 16) != 0 ? readInt(stream) : null;
        pinnedMsgId = (flags & 32) != 0 ? readInt(stream) : null;
        stickerset = (flags & 256) != 0 ? readTLObject(stream, context, TLStickerSet.class, TLStickerSet.CONSTRUCTOR_ID) : null;
        availableMinId = (flags & 512) != 0 ? readInt(stream) : null;
        folderId = (flags & 2048) != 0 ? readInt(stream) : null;
        linkedChatId = (flags & 16384) != 0 ? readLong(stream) : null;
        location = (flags & 32768) != 0 ? readTLObject(stream, context, TLAbsChannelLocation.class, -1) : null;
        slowmodeSeconds = (flags & 131072) != 0 ? readInt(stream) : null;
        slowmodeNextSendDate = (flags & 262144) != 0 ? readInt(stream) : null;
        statsDc = (flags & 4096) != 0 ? readInt(stream) : null;
        pts = readInt(stream);
        call = (flags & 2097152) != 0 ? readTLObject(stream, context, TLInputGroupCall.class, TLInputGroupCall.CONSTRUCTOR_ID) : null;
        ttlPeriod = (flags & 16777216) != 0 ? readInt(stream) : null;
        pendingSuggestions = (flags & 33554432) != 0 ? readTLStringVector(stream, context) : null;
        groupcallDefaultJoinAs = (flags & 67108864) != 0 ? readTLObject(stream, context, TLAbsPeer.class, -1) : null;
        themeEmoticon = (flags & 134217728) != 0 ? readTLString(stream) : null;
        requestsPending = (flags & 268435456) != 0 ? readInt(stream) : null;
        recentRequesters = (flags & 268435456) != 0 ? readTLLongVector(stream, context) : null;
        defaultSendAs = (flags & 536870912) != 0 ? readTLObject(stream, context, TLAbsPeer.class, -1) : null;
        availableReactions = (flags & 1073741824) != 0 ? readTLStringVector(stream, context) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += SIZE_INT64;
        size += computeTLStringSerializedSize(about);
        if ((flags & 1) != 0) {
            if (participantsCount == null) throwNullFieldException("participantsCount", flags);
            size += SIZE_INT32;
        }
        if ((flags & 2) != 0) {
            if (adminsCount == null) throwNullFieldException("adminsCount", flags);
            size += SIZE_INT32;
        }
        if ((flags & 4) != 0) {
            if (kickedCount == null) throwNullFieldException("kickedCount", flags);
            size += SIZE_INT32;
        }
        if ((flags & 4) != 0) {
            if (bannedCount == null) throwNullFieldException("bannedCount", flags);
            size += SIZE_INT32;
        }
        if ((flags & 8192) != 0) {
            if (onlineCount == null) throwNullFieldException("onlineCount", flags);
            size += SIZE_INT32;
        }
        size += SIZE_INT32;
        size += SIZE_INT32;
        size += SIZE_INT32;
        size += chatPhoto.computeSerializedSize();
        size += notifySettings.computeSerializedSize();
        if ((flags & 8388608) != 0) {
            if (exportedInvite == null) throwNullFieldException("exportedInvite", flags);
            size += exportedInvite.computeSerializedSize();
        }
        size += botInfo.computeSerializedSize();
        if ((flags & 16) != 0) {
            if (migratedFromChatId == null) throwNullFieldException("migratedFromChatId", flags);
            size += SIZE_INT64;
        }
        if ((flags & 16) != 0) {
            if (migratedFromMaxId == null) throwNullFieldException("migratedFromMaxId", flags);
            size += SIZE_INT32;
        }
        if ((flags & 32) != 0) {
            if (pinnedMsgId == null) throwNullFieldException("pinnedMsgId", flags);
            size += SIZE_INT32;
        }
        if ((flags & 256) != 0) {
            if (stickerset == null) throwNullFieldException("stickerset", flags);
            size += stickerset.computeSerializedSize();
        }
        if ((flags & 512) != 0) {
            if (availableMinId == null) throwNullFieldException("availableMinId", flags);
            size += SIZE_INT32;
        }
        if ((flags & 2048) != 0) {
            if (folderId == null) throwNullFieldException("folderId", flags);
            size += SIZE_INT32;
        }
        if ((flags & 16384) != 0) {
            if (linkedChatId == null) throwNullFieldException("linkedChatId", flags);
            size += SIZE_INT64;
        }
        if ((flags & 32768) != 0) {
            if (location == null) throwNullFieldException("location", flags);
            size += location.computeSerializedSize();
        }
        if ((flags & 131072) != 0) {
            if (slowmodeSeconds == null) throwNullFieldException("slowmodeSeconds", flags);
            size += SIZE_INT32;
        }
        if ((flags & 262144) != 0) {
            if (slowmodeNextSendDate == null) throwNullFieldException("slowmodeNextSendDate", flags);
            size += SIZE_INT32;
        }
        if ((flags & 4096) != 0) {
            if (statsDc == null) throwNullFieldException("statsDc", flags);
            size += SIZE_INT32;
        }
        size += SIZE_INT32;
        if ((flags & 2097152) != 0) {
            if (call == null) throwNullFieldException("call", flags);
            size += call.computeSerializedSize();
        }
        if ((flags & 16777216) != 0) {
            if (ttlPeriod == null) throwNullFieldException("ttlPeriod", flags);
            size += SIZE_INT32;
        }
        if ((flags & 33554432) != 0) {
            if (pendingSuggestions == null) throwNullFieldException("pendingSuggestions", flags);
            size += pendingSuggestions.computeSerializedSize();
        }
        if ((flags & 67108864) != 0) {
            if (groupcallDefaultJoinAs == null) throwNullFieldException("groupcallDefaultJoinAs", flags);
            size += groupcallDefaultJoinAs.computeSerializedSize();
        }
        if ((flags & 134217728) != 0) {
            if (themeEmoticon == null) throwNullFieldException("themeEmoticon", flags);
            size += computeTLStringSerializedSize(themeEmoticon);
        }
        if ((flags & 268435456) != 0) {
            if (requestsPending == null) throwNullFieldException("requestsPending", flags);
            size += SIZE_INT32;
        }
        if ((flags & 268435456) != 0) {
            if (recentRequesters == null) throwNullFieldException("recentRequesters", flags);
            size += recentRequesters.computeSerializedSize();
        }
        if ((flags & 536870912) != 0) {
            if (defaultSendAs == null) throwNullFieldException("defaultSendAs", flags);
            size += defaultSendAs.computeSerializedSize();
        }
        if ((flags & 1073741824) != 0) {
            if (availableReactions == null) throwNullFieldException("availableReactions", flags);
            size += availableReactions.computeSerializedSize();
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

    public boolean getCanViewParticipants() {
        return canViewParticipants;
    }

    public void setCanViewParticipants(boolean canViewParticipants) {
        this.canViewParticipants = canViewParticipants;
    }

    public boolean getCanSetUsername() {
        return canSetUsername;
    }

    public void setCanSetUsername(boolean canSetUsername) {
        this.canSetUsername = canSetUsername;
    }

    public boolean getCanSetStickers() {
        return canSetStickers;
    }

    public void setCanSetStickers(boolean canSetStickers) {
        this.canSetStickers = canSetStickers;
    }

    public boolean getHiddenPrehistory() {
        return hiddenPrehistory;
    }

    public void setHiddenPrehistory(boolean hiddenPrehistory) {
        this.hiddenPrehistory = hiddenPrehistory;
    }

    public boolean getCanSetLocation() {
        return canSetLocation;
    }

    public void setCanSetLocation(boolean canSetLocation) {
        this.canSetLocation = canSetLocation;
    }

    public boolean getHasScheduled() {
        return hasScheduled;
    }

    public void setHasScheduled(boolean hasScheduled) {
        this.hasScheduled = hasScheduled;
    }

    public boolean getCanViewStats() {
        return canViewStats;
    }

    public void setCanViewStats(boolean canViewStats) {
        this.canViewStats = canViewStats;
    }

    public boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Integer getParticipantsCount() {
        return participantsCount;
    }

    public void setParticipantsCount(Integer participantsCount) {
        this.participantsCount = participantsCount;
    }

    public Integer getAdminsCount() {
        return adminsCount;
    }

    public void setAdminsCount(Integer adminsCount) {
        this.adminsCount = adminsCount;
    }

    public Integer getKickedCount() {
        return kickedCount;
    }

    public void setKickedCount(Integer kickedCount) {
        this.kickedCount = kickedCount;
    }

    public Integer getBannedCount() {
        return bannedCount;
    }

    public void setBannedCount(Integer bannedCount) {
        this.bannedCount = bannedCount;
    }

    public Integer getOnlineCount() {
        return onlineCount;
    }

    public void setOnlineCount(Integer onlineCount) {
        this.onlineCount = onlineCount;
    }

    public int getReadInboxMaxId() {
        return readInboxMaxId;
    }

    public void setReadInboxMaxId(int readInboxMaxId) {
        this.readInboxMaxId = readInboxMaxId;
    }

    public int getReadOutboxMaxId() {
        return readOutboxMaxId;
    }

    public void setReadOutboxMaxId(int readOutboxMaxId) {
        this.readOutboxMaxId = readOutboxMaxId;
    }

    public int getUnreadCount() {
        return unreadCount;
    }

    public void setUnreadCount(int unreadCount) {
        this.unreadCount = unreadCount;
    }

    public TLAbsPhoto getChatPhoto() {
        return chatPhoto;
    }

    public void setChatPhoto(TLAbsPhoto chatPhoto) {
        this.chatPhoto = chatPhoto;
    }

    public TLPeerNotifySettings getNotifySettings() {
        return notifySettings;
    }

    public void setNotifySettings(TLPeerNotifySettings notifySettings) {
        this.notifySettings = notifySettings;
    }

    public TLChatInviteExported getExportedInvite() {
        return exportedInvite;
    }

    public void setExportedInvite(TLChatInviteExported exportedInvite) {
        this.exportedInvite = exportedInvite;
    }

    public TLVector<TLBotInfo> getBotInfo() {
        return botInfo;
    }

    public void setBotInfo(TLVector<TLBotInfo> botInfo) {
        this.botInfo = botInfo;
    }

    public Long getMigratedFromChatId() {
        return migratedFromChatId;
    }

    public void setMigratedFromChatId(Long migratedFromChatId) {
        this.migratedFromChatId = migratedFromChatId;
    }

    public Integer getMigratedFromMaxId() {
        return migratedFromMaxId;
    }

    public void setMigratedFromMaxId(Integer migratedFromMaxId) {
        this.migratedFromMaxId = migratedFromMaxId;
    }

    public Integer getPinnedMsgId() {
        return pinnedMsgId;
    }

    public void setPinnedMsgId(Integer pinnedMsgId) {
        this.pinnedMsgId = pinnedMsgId;
    }

    public TLStickerSet getStickerset() {
        return stickerset;
    }

    public void setStickerset(TLStickerSet stickerset) {
        this.stickerset = stickerset;
    }

    public Integer getAvailableMinId() {
        return availableMinId;
    }

    public void setAvailableMinId(Integer availableMinId) {
        this.availableMinId = availableMinId;
    }

    public Integer getFolderId() {
        return folderId;
    }

    public void setFolderId(Integer folderId) {
        this.folderId = folderId;
    }

    public Long getLinkedChatId() {
        return linkedChatId;
    }

    public void setLinkedChatId(Long linkedChatId) {
        this.linkedChatId = linkedChatId;
    }

    public TLAbsChannelLocation getLocation() {
        return location;
    }

    public void setLocation(TLAbsChannelLocation location) {
        this.location = location;
    }

    public Integer getSlowmodeSeconds() {
        return slowmodeSeconds;
    }

    public void setSlowmodeSeconds(Integer slowmodeSeconds) {
        this.slowmodeSeconds = slowmodeSeconds;
    }

    public Integer getSlowmodeNextSendDate() {
        return slowmodeNextSendDate;
    }

    public void setSlowmodeNextSendDate(Integer slowmodeNextSendDate) {
        this.slowmodeNextSendDate = slowmodeNextSendDate;
    }

    public Integer getStatsDc() {
        return statsDc;
    }

    public void setStatsDc(Integer statsDc) {
        this.statsDc = statsDc;
    }

    public int getPts() {
        return pts;
    }

    public void setPts(int pts) {
        this.pts = pts;
    }

    public TLInputGroupCall getCall() {
        return call;
    }

    public void setCall(TLInputGroupCall call) {
        this.call = call;
    }

    public Integer getTtlPeriod() {
        return ttlPeriod;
    }

    public void setTtlPeriod(Integer ttlPeriod) {
        this.ttlPeriod = ttlPeriod;
    }

    public TLStringVector getPendingSuggestions() {
        return pendingSuggestions;
    }

    public void setPendingSuggestions(TLStringVector pendingSuggestions) {
        this.pendingSuggestions = pendingSuggestions;
    }

    public TLAbsPeer getGroupcallDefaultJoinAs() {
        return groupcallDefaultJoinAs;
    }

    public void setGroupcallDefaultJoinAs(TLAbsPeer groupcallDefaultJoinAs) {
        this.groupcallDefaultJoinAs = groupcallDefaultJoinAs;
    }

    public String getThemeEmoticon() {
        return themeEmoticon;
    }

    public void setThemeEmoticon(String themeEmoticon) {
        this.themeEmoticon = themeEmoticon;
    }

    public Integer getRequestsPending() {
        return requestsPending;
    }

    public void setRequestsPending(Integer requestsPending) {
        this.requestsPending = requestsPending;
    }

    public TLLongVector getRecentRequesters() {
        return recentRequesters;
    }

    public void setRecentRequesters(TLLongVector recentRequesters) {
        this.recentRequesters = recentRequesters;
    }

    public TLAbsPeer getDefaultSendAs() {
        return defaultSendAs;
    }

    public void setDefaultSendAs(TLAbsPeer defaultSendAs) {
        this.defaultSendAs = defaultSendAs;
    }

    public TLStringVector getAvailableReactions() {
        return availableReactions;
    }

    public void setAvailableReactions(TLStringVector availableReactions) {
        this.availableReactions = availableReactions;
    }
}
