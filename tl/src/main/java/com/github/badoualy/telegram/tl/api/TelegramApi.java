package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.api.account.TLAbsResetPasswordResult;
import com.github.badoualy.telegram.tl.api.account.TLAbsThemes;
import com.github.badoualy.telegram.tl.api.account.TLAbsWallPapers;
import com.github.badoualy.telegram.tl.api.account.TLAuthorizationForm;
import com.github.badoualy.telegram.tl.api.account.TLAuthorizations;
import com.github.badoualy.telegram.tl.api.account.TLContentSettings;
import com.github.badoualy.telegram.tl.api.account.TLPassword;
import com.github.badoualy.telegram.tl.api.account.TLPasswordInputSettings;
import com.github.badoualy.telegram.tl.api.account.TLPasswordSettings;
import com.github.badoualy.telegram.tl.api.account.TLPrivacyRules;
import com.github.badoualy.telegram.tl.api.account.TLSentEmailCode;
import com.github.badoualy.telegram.tl.api.account.TLTakeout;
import com.github.badoualy.telegram.tl.api.account.TLTmpPassword;
import com.github.badoualy.telegram.tl.api.account.TLWebAuthorizations;
import com.github.badoualy.telegram.tl.api.auth.TLAbsAuthorization;
import com.github.badoualy.telegram.tl.api.auth.TLAbsLoginToken;
import com.github.badoualy.telegram.tl.api.auth.TLExportedAuthorization;
import com.github.badoualy.telegram.tl.api.auth.TLLoggedOut;
import com.github.badoualy.telegram.tl.api.auth.TLPasswordRecovery;
import com.github.badoualy.telegram.tl.api.auth.TLSentCode;
import com.github.badoualy.telegram.tl.api.channels.TLAbsChannelParticipants;
import com.github.badoualy.telegram.tl.api.channels.TLAdminLogResults;
import com.github.badoualy.telegram.tl.api.channels.TLChannelParticipant;
import com.github.badoualy.telegram.tl.api.channels.TLSendAsPeers;
import com.github.badoualy.telegram.tl.api.contacts.TLAbsBlocked;
import com.github.badoualy.telegram.tl.api.contacts.TLAbsContacts;
import com.github.badoualy.telegram.tl.api.contacts.TLAbsTopPeers;
import com.github.badoualy.telegram.tl.api.contacts.TLFound;
import com.github.badoualy.telegram.tl.api.contacts.TLImportedContacts;
import com.github.badoualy.telegram.tl.api.contacts.TLResolvedPeer;
import com.github.badoualy.telegram.tl.api.help.TLAbsAppUpdate;
import com.github.badoualy.telegram.tl.api.help.TLAbsCountriesList;
import com.github.badoualy.telegram.tl.api.help.TLAbsDeepLinkInfo;
import com.github.badoualy.telegram.tl.api.help.TLAbsPassportConfig;
import com.github.badoualy.telegram.tl.api.help.TLAbsPromoData;
import com.github.badoualy.telegram.tl.api.help.TLAbsTermsOfServiceUpdate;
import com.github.badoualy.telegram.tl.api.help.TLAbsUserInfo;
import com.github.badoualy.telegram.tl.api.help.TLInviteText;
import com.github.badoualy.telegram.tl.api.help.TLRecentMeUrls;
import com.github.badoualy.telegram.tl.api.help.TLSupport;
import com.github.badoualy.telegram.tl.api.help.TLSupportName;
import com.github.badoualy.telegram.tl.api.messages.TLAbsAllStickers;
import com.github.badoualy.telegram.tl.api.messages.TLAbsAvailableReactions;
import com.github.badoualy.telegram.tl.api.messages.TLAbsChats;
import com.github.badoualy.telegram.tl.api.messages.TLAbsDhConfig;
import com.github.badoualy.telegram.tl.api.messages.TLAbsDialogs;
import com.github.badoualy.telegram.tl.api.messages.TLAbsExportedChatInvite;
import com.github.badoualy.telegram.tl.api.messages.TLAbsFavedStickers;
import com.github.badoualy.telegram.tl.api.messages.TLAbsFeaturedStickers;
import com.github.badoualy.telegram.tl.api.messages.TLAbsFoundStickerSets;
import com.github.badoualy.telegram.tl.api.messages.TLAbsMessages;
import com.github.badoualy.telegram.tl.api.messages.TLAbsRecentStickers;
import com.github.badoualy.telegram.tl.api.messages.TLAbsSavedGifs;
import com.github.badoualy.telegram.tl.api.messages.TLAbsSentEncryptedMessage;
import com.github.badoualy.telegram.tl.api.messages.TLAbsStickerSet;
import com.github.badoualy.telegram.tl.api.messages.TLAbsStickerSetInstallResult;
import com.github.badoualy.telegram.tl.api.messages.TLAbsStickers;
import com.github.badoualy.telegram.tl.api.messages.TLAbsTranslatedText;
import com.github.badoualy.telegram.tl.api.messages.TLAffectedFoundMessages;
import com.github.badoualy.telegram.tl.api.messages.TLAffectedHistory;
import com.github.badoualy.telegram.tl.api.messages.TLAffectedMessages;
import com.github.badoualy.telegram.tl.api.messages.TLArchivedStickers;
import com.github.badoualy.telegram.tl.api.messages.TLBotCallbackAnswer;
import com.github.badoualy.telegram.tl.api.messages.TLBotResults;
import com.github.badoualy.telegram.tl.api.messages.TLChatAdminsWithInvites;
import com.github.badoualy.telegram.tl.api.messages.TLChatFull;
import com.github.badoualy.telegram.tl.api.messages.TLChatInviteImporters;
import com.github.badoualy.telegram.tl.api.messages.TLCheckedHistoryImportPeer;
import com.github.badoualy.telegram.tl.api.messages.TLDiscussionMessage;
import com.github.badoualy.telegram.tl.api.messages.TLExportedChatInvites;
import com.github.badoualy.telegram.tl.api.messages.TLHighScores;
import com.github.badoualy.telegram.tl.api.messages.TLHistoryImport;
import com.github.badoualy.telegram.tl.api.messages.TLHistoryImportParsed;
import com.github.badoualy.telegram.tl.api.messages.TLInactiveChats;
import com.github.badoualy.telegram.tl.api.messages.TLMessageEditData;
import com.github.badoualy.telegram.tl.api.messages.TLMessageReactionsList;
import com.github.badoualy.telegram.tl.api.messages.TLMessageViews;
import com.github.badoualy.telegram.tl.api.messages.TLPeerDialogs;
import com.github.badoualy.telegram.tl.api.messages.TLPeerSettings;
import com.github.badoualy.telegram.tl.api.messages.TLSearchCounter;
import com.github.badoualy.telegram.tl.api.messages.TLSearchResultsCalendar;
import com.github.badoualy.telegram.tl.api.messages.TLSearchResultsPositions;
import com.github.badoualy.telegram.tl.api.messages.TLSponsoredMessages;
import com.github.badoualy.telegram.tl.api.messages.TLVotesList;
import com.github.badoualy.telegram.tl.api.payments.TLAbsPaymentResult;
import com.github.badoualy.telegram.tl.api.payments.TLBankCardData;
import com.github.badoualy.telegram.tl.api.payments.TLPaymentForm;
import com.github.badoualy.telegram.tl.api.payments.TLPaymentReceipt;
import com.github.badoualy.telegram.tl.api.payments.TLSavedInfo;
import com.github.badoualy.telegram.tl.api.payments.TLValidatedRequestedInfo;
import com.github.badoualy.telegram.tl.api.phone.TLExportedGroupCallInvite;
import com.github.badoualy.telegram.tl.api.phone.TLGroupCall;
import com.github.badoualy.telegram.tl.api.phone.TLGroupParticipants;
import com.github.badoualy.telegram.tl.api.phone.TLJoinAsPeers;
import com.github.badoualy.telegram.tl.api.phone.TLPhoneCall;
import com.github.badoualy.telegram.tl.api.photos.TLAbsPhotos;
import com.github.badoualy.telegram.tl.api.photos.TLPhoto;
import com.github.badoualy.telegram.tl.api.stats.TLBroadcastStats;
import com.github.badoualy.telegram.tl.api.stats.TLMegagroupStats;
import com.github.badoualy.telegram.tl.api.stats.TLMessageStats;
import com.github.badoualy.telegram.tl.api.stickers.TLSuggestedShortName;
import com.github.badoualy.telegram.tl.api.updates.TLAbsChannelDifference;
import com.github.badoualy.telegram.tl.api.updates.TLAbsDifference;
import com.github.badoualy.telegram.tl.api.updates.TLState;
import com.github.badoualy.telegram.tl.api.upload.TLAbsCdnFile;
import com.github.badoualy.telegram.tl.api.upload.TLAbsFile;
import com.github.badoualy.telegram.tl.api.upload.TLWebFile;
import com.github.badoualy.telegram.tl.api.users.TLUserFull;
import com.github.badoualy.telegram.tl.core.TLBool;
import com.github.badoualy.telegram.tl.core.TLBytes;
import com.github.badoualy.telegram.tl.core.TLIntVector;
import com.github.badoualy.telegram.tl.core.TLLongVector;
import com.github.badoualy.telegram.tl.core.TLMethod;
import com.github.badoualy.telegram.tl.core.TLObject;
import com.github.badoualy.telegram.tl.core.TLStringVector;
import com.github.badoualy.telegram.tl.core.TLVector;
import com.github.badoualy.telegram.tl.exception.RpcErrorException;
import java.io.IOException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.lang.SuppressWarnings;

@SuppressWarnings({"unused", "unchecked", "RedundantCast"})
public interface TelegramApi {
    TLBool accountAcceptAuthorization(long botId, String scope, String publicKey, TLVector<TLSecureValueHash> valueHashes, TLSecureCredentialsEncrypted credentials) throws RpcErrorException, IOException;

    TLBool accountCancelPasswordEmail() throws RpcErrorException, IOException;

    TLBool accountChangeAuthorizationSettings(long hash, boolean encryptedRequestsDisabled, boolean callRequestsDisabled) throws RpcErrorException, IOException;

    TLAbsUser accountChangePhone(String phoneNumber, String phoneCodeHash, String phoneCode) throws RpcErrorException, IOException;

    TLBool accountCheckUsername(String username) throws RpcErrorException, IOException;

    TLBool accountConfirmPasswordEmail(String code) throws RpcErrorException, IOException;

    TLBool accountConfirmPhone(String phoneCodeHash, String phoneCode) throws RpcErrorException, IOException;

    TLTheme accountCreateTheme(String slug, String title, TLAbsInputDocument document, TLVector<TLInputThemeSettings> settings) throws RpcErrorException, IOException;

    TLBool accountDeclinePasswordReset() throws RpcErrorException, IOException;

    TLBool accountDeleteAccount(String reason) throws RpcErrorException, IOException;

    TLBool accountDeleteSecureValue(TLVector<TLAbsSecureValueType> types) throws RpcErrorException, IOException;

    TLBool accountFinishTakeoutSession(boolean success) throws RpcErrorException, IOException;

    TLAccountDaysTTL accountGetAccountTTL() throws RpcErrorException, IOException;

    TLVector<TLSecureValue> accountGetAllSecureValues() throws RpcErrorException, IOException;

    TLAuthorizationForm accountGetAuthorizationForm(long botId, String scope, String publicKey) throws RpcErrorException, IOException;

    TLAuthorizations accountGetAuthorizations() throws RpcErrorException, IOException;

    com.github.badoualy.telegram.tl.api.account.TLAutoDownloadSettings accountGetAutoDownloadSettings() throws RpcErrorException, IOException;

    TLAbsThemes accountGetChatThemes(long hash) throws RpcErrorException, IOException;

    TLBool accountGetContactSignUpNotification() throws RpcErrorException, IOException;

    TLContentSettings accountGetContentSettings() throws RpcErrorException, IOException;

    TLGlobalPrivacySettings accountGetGlobalPrivacySettings() throws RpcErrorException, IOException;

    TLVector<TLAbsWallPaper> accountGetMultiWallPapers(TLVector<TLAbsInputWallPaper> wallpapers) throws RpcErrorException, IOException;

    TLAbsUpdates accountGetNotifyExceptions(boolean compareSound, TLAbsInputNotifyPeer peer) throws RpcErrorException, IOException;

    TLPeerNotifySettings accountGetNotifySettings(TLAbsInputNotifyPeer peer) throws RpcErrorException, IOException;

    TLPassword accountGetPassword() throws RpcErrorException, IOException;

    TLPasswordSettings accountGetPasswordSettings(TLAbsInputCheckPasswordSRP password) throws RpcErrorException, IOException;

    TLPrivacyRules accountGetPrivacy(TLAbsInputPrivacyKey key) throws RpcErrorException, IOException;

    TLVector<TLSecureValue> accountGetSecureValue(TLVector<TLAbsSecureValueType> types) throws RpcErrorException, IOException;

    TLTheme accountGetTheme(String format, TLAbsInputTheme theme, long documentId) throws RpcErrorException, IOException;

    TLAbsThemes accountGetThemes(String format, long hash) throws RpcErrorException, IOException;

    TLTmpPassword accountGetTmpPassword(TLAbsInputCheckPasswordSRP password, int period) throws RpcErrorException, IOException;

    TLAbsWallPaper accountGetWallPaper(TLAbsInputWallPaper wallpaper) throws RpcErrorException, IOException;

    TLAbsWallPapers accountGetWallPapers(long hash) throws RpcErrorException, IOException;

    TLWebAuthorizations accountGetWebAuthorizations() throws RpcErrorException, IOException;

    TLTakeout accountInitTakeoutSession(boolean contacts, boolean messageUsers, boolean messageChats, boolean messageMegagroups, boolean messageChannels, boolean files, Integer fileMaxSize) throws RpcErrorException, IOException;

    TLBool accountInstallTheme(boolean dark, TLAbsInputTheme theme, String format, TLAbsBaseTheme baseTheme) throws RpcErrorException, IOException;

    TLBool accountInstallWallPaper(TLAbsInputWallPaper wallpaper, TLWallPaperSettings settings) throws RpcErrorException, IOException;

    TLBool accountRegisterDevice(boolean noMuted, int tokenType, String token, boolean appSandbox, TLBytes secret, TLLongVector otherUids) throws RpcErrorException, IOException;

    TLBool accountReportPeer(TLAbsInputPeer peer, TLAbsReportReason reason, String message) throws RpcErrorException, IOException;

    TLBool accountReportProfilePhoto(TLAbsInputPeer peer, TLAbsInputPhoto photoId, TLAbsReportReason reason, String message) throws RpcErrorException, IOException;

    TLBool accountResendPasswordEmail() throws RpcErrorException, IOException;

    TLBool accountResetAuthorization(long hash) throws RpcErrorException, IOException;

    TLBool accountResetNotifySettings() throws RpcErrorException, IOException;

    TLAbsResetPasswordResult accountResetPassword() throws RpcErrorException, IOException;

    TLBool accountResetWallPapers() throws RpcErrorException, IOException;

    TLBool accountResetWebAuthorization(long hash) throws RpcErrorException, IOException;

    TLBool accountResetWebAuthorizations() throws RpcErrorException, IOException;

    TLBool accountSaveAutoDownloadSettings(boolean low, boolean high, TLAutoDownloadSettings settings) throws RpcErrorException, IOException;

    TLSecureValue accountSaveSecureValue(TLInputSecureValue value, long secureSecretId) throws RpcErrorException, IOException;

    TLBool accountSaveTheme(TLAbsInputTheme theme, boolean unsave) throws RpcErrorException, IOException;

    TLBool accountSaveWallPaper(TLAbsInputWallPaper wallpaper, boolean unsave, TLWallPaperSettings settings) throws RpcErrorException, IOException;

    TLSentCode accountSendChangePhoneCode(String phoneNumber, TLCodeSettings settings) throws RpcErrorException, IOException;

    TLSentCode accountSendConfirmPhoneCode(String hash, TLCodeSettings settings) throws RpcErrorException, IOException;

    TLSentEmailCode accountSendVerifyEmailCode(String email) throws RpcErrorException, IOException;

    TLSentCode accountSendVerifyPhoneCode(String phoneNumber, TLCodeSettings settings) throws RpcErrorException, IOException;

    TLBool accountSetAccountTTL(TLAccountDaysTTL ttl) throws RpcErrorException, IOException;

    TLBool accountSetAuthorizationTTL(int authorizationTtlDays) throws RpcErrorException, IOException;

    TLBool accountSetContactSignUpNotification(boolean silent) throws RpcErrorException, IOException;

    TLBool accountSetContentSettings(boolean sensitiveEnabled) throws RpcErrorException, IOException;

    TLGlobalPrivacySettings accountSetGlobalPrivacySettings(TLGlobalPrivacySettings settings) throws RpcErrorException, IOException;

    TLPrivacyRules accountSetPrivacy(TLAbsInputPrivacyKey key, TLVector<TLAbsInputPrivacyRule> rules) throws RpcErrorException, IOException;

    TLBool accountUnregisterDevice(int tokenType, String token, TLLongVector otherUids) throws RpcErrorException, IOException;

    TLBool accountUpdateDeviceLocked(int period) throws RpcErrorException, IOException;

    TLBool accountUpdateNotifySettings(TLAbsInputNotifyPeer peer, TLInputPeerNotifySettings settings) throws RpcErrorException, IOException;

    TLBool accountUpdatePasswordSettings(TLAbsInputCheckPasswordSRP password, TLPasswordInputSettings newSettings) throws RpcErrorException, IOException;

    TLAbsUser accountUpdateProfile(String firstName, String lastName, String about) throws RpcErrorException, IOException;

    TLBool accountUpdateStatus(boolean offline) throws RpcErrorException, IOException;

    TLTheme accountUpdateTheme(String format, TLAbsInputTheme theme, String slug, String title, TLAbsInputDocument document, TLVector<TLInputThemeSettings> settings) throws RpcErrorException, IOException;

    TLAbsUser accountUpdateUsername(String username) throws RpcErrorException, IOException;

    TLAbsDocument accountUploadTheme(TLAbsInputFile file, TLAbsInputFile thumb, String fileName, String mimeType) throws RpcErrorException, IOException;

    TLAbsWallPaper accountUploadWallPaper(TLAbsInputFile file, String mimeType, TLWallPaperSettings settings) throws RpcErrorException, IOException;

    TLBool accountVerifyEmail(String email, String code) throws RpcErrorException, IOException;

    TLBool accountVerifyPhone(String phoneNumber, String phoneCodeHash, String phoneCode) throws RpcErrorException, IOException;

    TLAuthorization authAcceptLoginToken(TLBytes token) throws RpcErrorException, IOException;

    TLBool authBindTempAuthKey(long permAuthKeyId, long nonce, int expiresAt, TLBytes encryptedMessage) throws RpcErrorException, IOException;

    TLBool authCancelCode(String phoneNumber, String phoneCodeHash) throws RpcErrorException, IOException;

    TLAbsAuthorization authCheckPassword(TLAbsInputCheckPasswordSRP password) throws RpcErrorException, IOException;

    TLBool authCheckRecoveryPassword(String code) throws RpcErrorException, IOException;

    TLBool authDropTempAuthKeys(TLLongVector exceptAuthKeys) throws RpcErrorException, IOException;

    TLExportedAuthorization authExportAuthorization(int dcId) throws RpcErrorException, IOException;

    TLAbsLoginToken authExportLoginToken(int apiId, String apiHash, TLLongVector exceptIds) throws RpcErrorException, IOException;

    TLAbsAuthorization authImportAuthorization(long id, TLBytes bytes) throws RpcErrorException, IOException;

    TLAbsAuthorization authImportBotAuthorization(int flags, int apiId, String apiHash, String botAuthToken) throws RpcErrorException, IOException;

    TLAbsLoginToken authImportLoginToken(TLBytes token) throws RpcErrorException, IOException;

    TLLoggedOut authLogOut() throws RpcErrorException, IOException;

    TLAbsAuthorization authRecoverPassword(String code, TLPasswordInputSettings newSettings) throws RpcErrorException, IOException;

    TLPasswordRecovery authRequestPasswordRecovery() throws RpcErrorException, IOException;

    TLSentCode authResendCode(String phoneNumber, String phoneCodeHash) throws RpcErrorException, IOException;

    TLBool authResetAuthorizations() throws RpcErrorException, IOException;

    TLSentCode authSendCode(String phoneNumber, int apiId, String apiHash, TLCodeSettings settings) throws RpcErrorException, IOException;

    TLAbsAuthorization authSignIn(String phoneNumber, String phoneCodeHash, String phoneCode) throws RpcErrorException, IOException;

    TLAbsAuthorization authSignUp(String phoneNumber, String phoneCodeHash, String firstName, String lastName) throws RpcErrorException, IOException;

    TLBool botsAnswerWebhookJSONQuery(long queryId, TLDataJSON data) throws RpcErrorException, IOException;

    TLVector<TLBotCommand> botsGetBotCommands(TLAbsBotCommandScope scope, String langCode) throws RpcErrorException, IOException;

    TLBool botsResetBotCommands(TLAbsBotCommandScope scope, String langCode) throws RpcErrorException, IOException;

    TLDataJSON botsSendCustomRequest(String customMethod, TLDataJSON params) throws RpcErrorException, IOException;

    TLBool botsSetBotCommands(TLAbsBotCommandScope scope, String langCode, TLVector<TLBotCommand> commands) throws RpcErrorException, IOException;

    TLBool channelsCheckUsername(TLAbsInputChannel channel, String username) throws RpcErrorException, IOException;

    TLAbsUpdates channelsConvertToGigagroup(TLAbsInputChannel channel) throws RpcErrorException, IOException;

    TLAbsUpdates channelsCreateChannel(boolean broadcast, boolean megagroup, boolean forImport, String title, String about, TLAbsInputGeoPoint geoPoint, String address) throws RpcErrorException, IOException;

    TLAbsUpdates channelsDeleteChannel(TLAbsInputChannel channel) throws RpcErrorException, IOException;

    TLBool channelsDeleteHistory(TLAbsInputChannel channel, int maxId) throws RpcErrorException, IOException;

    TLAffectedMessages channelsDeleteMessages(TLAbsInputChannel channel, TLIntVector id) throws RpcErrorException, IOException;

    TLAffectedHistory channelsDeleteParticipantHistory(TLAbsInputChannel channel, TLAbsInputPeer participant) throws RpcErrorException, IOException;

    TLAbsUpdates channelsEditAdmin(TLAbsInputChannel channel, TLAbsInputUser userId, TLChatAdminRights adminRights, String rank) throws RpcErrorException, IOException;

    TLAbsUpdates channelsEditBanned(TLAbsInputChannel channel, TLAbsInputPeer participant, TLChatBannedRights bannedRights) throws RpcErrorException, IOException;

    TLAbsUpdates channelsEditCreator(TLAbsInputChannel channel, TLAbsInputUser userId, TLAbsInputCheckPasswordSRP password) throws RpcErrorException, IOException;

    TLBool channelsEditLocation(TLAbsInputChannel channel, TLAbsInputGeoPoint geoPoint, String address) throws RpcErrorException, IOException;

    TLAbsUpdates channelsEditPhoto(TLAbsInputChannel channel, TLAbsInputChatPhoto photo) throws RpcErrorException, IOException;

    TLAbsUpdates channelsEditTitle(TLAbsInputChannel channel, String title) throws RpcErrorException, IOException;

    TLExportedMessageLink channelsExportMessageLink(boolean grouped, boolean thread, TLAbsInputChannel channel, int id) throws RpcErrorException, IOException;

    TLAdminLogResults channelsGetAdminLog(TLAbsInputChannel channel, String q, TLChannelAdminLogEventsFilter eventsFilter, TLVector<TLAbsInputUser> admins, long maxId, long minId, int limit) throws RpcErrorException, IOException;

    TLAbsChats channelsGetAdminedPublicChannels(boolean byLocation, boolean checkLimit) throws RpcErrorException, IOException;

    TLAbsChats channelsGetChannels(TLVector<TLAbsInputChannel> id) throws RpcErrorException, IOException;

    TLChatFull channelsGetFullChannel(TLAbsInputChannel channel) throws RpcErrorException, IOException;

    TLAbsChats channelsGetGroupsForDiscussion() throws RpcErrorException, IOException;

    TLInactiveChats channelsGetInactiveChannels() throws RpcErrorException, IOException;

    TLAbsChats channelsGetLeftChannels(int offset) throws RpcErrorException, IOException;

    TLAbsMessages channelsGetMessages(TLAbsInputChannel channel, TLVector<TLAbsInputMessage> id) throws RpcErrorException, IOException;

    TLChannelParticipant channelsGetParticipant(TLAbsInputChannel channel, TLAbsInputPeer participant) throws RpcErrorException, IOException;

    TLAbsChannelParticipants channelsGetParticipants(TLAbsInputChannel channel, TLAbsChannelParticipantsFilter filter, int offset, int limit, long hash) throws RpcErrorException, IOException;

    TLSendAsPeers channelsGetSendAs(TLAbsInputPeer peer) throws RpcErrorException, IOException;

    TLSponsoredMessages channelsGetSponsoredMessages(TLAbsInputChannel channel) throws RpcErrorException, IOException;

    TLAbsUpdates channelsInviteToChannel(TLAbsInputChannel channel, TLVector<TLAbsInputUser> users) throws RpcErrorException, IOException;

    TLAbsUpdates channelsJoinChannel(TLAbsInputChannel channel) throws RpcErrorException, IOException;

    TLAbsUpdates channelsLeaveChannel(TLAbsInputChannel channel) throws RpcErrorException, IOException;

    TLBool channelsReadHistory(TLAbsInputChannel channel, int maxId) throws RpcErrorException, IOException;

    TLBool channelsReadMessageContents(TLAbsInputChannel channel, TLIntVector id) throws RpcErrorException, IOException;

    TLBool channelsReportSpam(TLAbsInputChannel channel, TLAbsInputPeer participant, TLIntVector id) throws RpcErrorException, IOException;

    TLBool channelsSetDiscussionGroup(TLAbsInputChannel broadcast, TLAbsInputChannel group) throws RpcErrorException, IOException;

    TLBool channelsSetStickers(TLAbsInputChannel channel, TLAbsInputStickerSet stickerset) throws RpcErrorException, IOException;

    TLAbsUpdates channelsTogglePreHistoryHidden(TLAbsInputChannel channel, boolean enabled) throws RpcErrorException, IOException;

    TLAbsUpdates channelsToggleSignatures(TLAbsInputChannel channel, boolean enabled) throws RpcErrorException, IOException;

    TLAbsUpdates channelsToggleSlowMode(TLAbsInputChannel channel, int seconds) throws RpcErrorException, IOException;

    TLBool channelsUpdateUsername(TLAbsInputChannel channel, String username) throws RpcErrorException, IOException;

    TLBool channelsViewSponsoredMessage(TLAbsInputChannel channel, TLBytes randomId) throws RpcErrorException, IOException;

    TLAbsUpdates contactsAcceptContact(TLAbsInputUser id) throws RpcErrorException, IOException;

    TLAbsUpdates contactsAddContact(boolean addPhonePrivacyException, TLAbsInputUser id, String firstName, String lastName, String phone) throws RpcErrorException, IOException;

    TLBool contactsBlock(TLAbsInputPeer id) throws RpcErrorException, IOException;

    TLAbsUpdates contactsBlockFromReplies(boolean deleteMessage, boolean deleteHistory, boolean reportSpam, int msgId) throws RpcErrorException, IOException;

    TLBool contactsDeleteByPhones(TLStringVector phones) throws RpcErrorException, IOException;

    TLAbsUpdates contactsDeleteContacts(TLVector<TLAbsInputUser> id) throws RpcErrorException, IOException;

    TLAbsBlocked contactsGetBlocked(int offset, int limit) throws RpcErrorException, IOException;

    TLIntVector contactsGetContactIDs(long hash) throws RpcErrorException, IOException;

    TLAbsContacts contactsGetContacts(long hash) throws RpcErrorException, IOException;

    TLAbsUpdates contactsGetLocated(boolean background, TLAbsInputGeoPoint geoPoint, Integer selfExpires) throws RpcErrorException, IOException;

    TLVector<TLSavedPhoneContact> contactsGetSaved() throws RpcErrorException, IOException;

    TLVector<TLContactStatus> contactsGetStatuses() throws RpcErrorException, IOException;

    TLAbsTopPeers contactsGetTopPeers(boolean correspondents, boolean botsPm, boolean botsInline, boolean phoneCalls, boolean forwardUsers, boolean forwardChats, boolean groups, boolean channels, int offset, int limit, long hash) throws RpcErrorException, IOException;

    TLImportedContacts contactsImportContacts(TLVector<TLInputPhoneContact> contacts) throws RpcErrorException, IOException;

    TLBool contactsResetSaved() throws RpcErrorException, IOException;

    TLBool contactsResetTopPeerRating(TLAbsTopPeerCategory category, TLAbsInputPeer peer) throws RpcErrorException, IOException;

    TLResolvedPeer contactsResolveUsername(String username) throws RpcErrorException, IOException;

    TLFound contactsSearch(String q, int limit) throws RpcErrorException, IOException;

    TLBool contactsToggleTopPeers(boolean enabled) throws RpcErrorException, IOException;

    TLBool contactsUnblock(TLAbsInputPeer id) throws RpcErrorException, IOException;

    TLAbsUpdates foldersDeleteFolder(int folderId) throws RpcErrorException, IOException;

    TLAbsUpdates foldersEditPeerFolders(TLVector<TLInputFolderPeer> folderPeers) throws RpcErrorException, IOException;

    TLBool helpAcceptTermsOfService(TLDataJSON id) throws RpcErrorException, IOException;

    TLBool helpDismissSuggestion(TLAbsInputPeer peer, String suggestion) throws RpcErrorException, IOException;

    TLAbsUserInfo helpEditUserInfo(TLAbsInputUser userId, String message, TLVector<TLAbsMessageEntity> entities) throws RpcErrorException, IOException;

    TLAbsUpdates helpGetAppChangelog(String prevAppVersion) throws RpcErrorException, IOException;

    TLAbsJSONValue helpGetAppConfig() throws RpcErrorException, IOException;

    TLAbsAppUpdate helpGetAppUpdate(String source) throws RpcErrorException, IOException;

    TLCdnConfig helpGetCdnConfig() throws RpcErrorException, IOException;

    TLConfig helpGetConfig() throws RpcErrorException, IOException;

    TLAbsCountriesList helpGetCountriesList(String langCode, int hash) throws RpcErrorException, IOException;

    TLAbsDeepLinkInfo helpGetDeepLinkInfo(String path) throws RpcErrorException, IOException;

    TLInviteText helpGetInviteText() throws RpcErrorException, IOException;

    TLNearestDc helpGetNearestDc() throws RpcErrorException, IOException;

    TLAbsPassportConfig helpGetPassportConfig(int hash) throws RpcErrorException, IOException;

    TLAbsPromoData helpGetPromoData() throws RpcErrorException, IOException;

    TLRecentMeUrls helpGetRecentMeUrls(String referer) throws RpcErrorException, IOException;

    TLSupport helpGetSupport() throws RpcErrorException, IOException;

    TLSupportName helpGetSupportName() throws RpcErrorException, IOException;

    TLAbsTermsOfServiceUpdate helpGetTermsOfServiceUpdate() throws RpcErrorException, IOException;

    TLAbsUserInfo helpGetUserInfo(TLAbsInputUser userId) throws RpcErrorException, IOException;

    TLBool helpHidePromoData(TLAbsInputPeer peer) throws RpcErrorException, IOException;

    TLBool helpSaveAppLog(TLVector<TLInputAppEvent> events) throws RpcErrorException, IOException;

    TLBool helpSetBotUpdatesStatus(int pendingUpdatesCount, String message) throws RpcErrorException, IOException;

    <T extends TLObject> T initConnection(int apiId, String deviceModel, String systemVersion, String appVersion, String systemLangCode, String langPack, String langCode, TLInputClientProxy proxy, TLAbsJSONValue params, TLMethod<T> query) throws RpcErrorException, IOException;

    <T extends TLObject> T invokeAfterMsg(long msgId, TLMethod<T> query) throws RpcErrorException, IOException;

    <T extends TLObject> T invokeAfterMsgs(TLLongVector msgIds, TLMethod<T> query) throws RpcErrorException, IOException;

    <T extends TLObject> T invokeWithLayer(int layer, TLMethod<T> query) throws RpcErrorException, IOException;

    <T extends TLObject> T invokeWithMessagesRange(TLMessageRange range, TLMethod<T> query) throws RpcErrorException, IOException;

    <T extends TLObject> T invokeWithTakeout(long takeoutId, TLMethod<T> query) throws RpcErrorException, IOException;

    <T extends TLObject> T invokeWithoutUpdates(TLMethod<T> query) throws RpcErrorException, IOException;

    TLLangPackDifference langpackGetDifference(String langPack, String langCode, int fromVersion) throws RpcErrorException, IOException;

    TLLangPackDifference langpackGetLangPack(String langPack, String langCode) throws RpcErrorException, IOException;

    TLLangPackLanguage langpackGetLanguage(String langPack, String langCode) throws RpcErrorException, IOException;

    TLVector<TLLangPackLanguage> langpackGetLanguages(String langPack) throws RpcErrorException, IOException;

    TLVector<TLAbsLangPackString> langpackGetStrings(String langPack, String langCode, TLStringVector keys) throws RpcErrorException, IOException;

    TLAbsEncryptedChat messagesAcceptEncryption(TLInputEncryptedChat peer, TLBytes gB, long keyFingerprint) throws RpcErrorException, IOException;

    TLAbsUrlAuthResult messagesAcceptUrlAuth(boolean writeAllowed, TLAbsInputPeer peer, Integer msgId, Integer buttonId, String url) throws RpcErrorException, IOException;

    TLAbsUpdates messagesAddChatUser(long chatId, TLAbsInputUser userId, int fwdLimit) throws RpcErrorException, IOException;

    TLAbsChatInvite messagesCheckChatInvite(String hash) throws RpcErrorException, IOException;

    TLHistoryImportParsed messagesCheckHistoryImport(String importHead) throws RpcErrorException, IOException;

    TLCheckedHistoryImportPeer messagesCheckHistoryImportPeer(TLAbsInputPeer peer) throws RpcErrorException, IOException;

    TLBool messagesClearAllDrafts() throws RpcErrorException, IOException;

    TLBool messagesClearRecentStickers(boolean attached) throws RpcErrorException, IOException;

    TLAbsUpdates messagesCreateChat(TLVector<TLAbsInputUser> users, String title) throws RpcErrorException, IOException;

    TLBool messagesDeleteChat(long chatId) throws RpcErrorException, IOException;

    TLAbsUpdates messagesDeleteChatUser(boolean revokeHistory, long chatId, TLAbsInputUser userId) throws RpcErrorException, IOException;

    TLBool messagesDeleteExportedChatInvite(TLAbsInputPeer peer, String link) throws RpcErrorException, IOException;

    TLAffectedHistory messagesDeleteHistory(boolean justClear, boolean revoke, TLAbsInputPeer peer, int maxId, Integer minDate, Integer maxDate) throws RpcErrorException, IOException;

    TLAffectedMessages messagesDeleteMessages(boolean revoke, TLIntVector id) throws RpcErrorException, IOException;

    TLAffectedFoundMessages messagesDeletePhoneCallHistory(boolean revoke) throws RpcErrorException, IOException;

    TLBool messagesDeleteRevokedExportedChatInvites(TLAbsInputPeer peer, TLAbsInputUser adminId) throws RpcErrorException, IOException;

    TLAbsUpdates messagesDeleteScheduledMessages(TLAbsInputPeer peer, TLIntVector id) throws RpcErrorException, IOException;

    TLBool messagesDiscardEncryption(boolean deleteHistory, int chatId) throws RpcErrorException, IOException;

    TLBool messagesEditChatAbout(TLAbsInputPeer peer, String about) throws RpcErrorException, IOException;

    TLBool messagesEditChatAdmin(long chatId, TLAbsInputUser userId, boolean isAdmin) throws RpcErrorException, IOException;

    TLAbsUpdates messagesEditChatDefaultBannedRights(TLAbsInputPeer peer, TLChatBannedRights bannedRights) throws RpcErrorException, IOException;

    TLAbsUpdates messagesEditChatPhoto(long chatId, TLAbsInputChatPhoto photo) throws RpcErrorException, IOException;

    TLAbsUpdates messagesEditChatTitle(long chatId, String title) throws RpcErrorException, IOException;

    TLAbsExportedChatInvite messagesEditExportedChatInvite(boolean revoked, TLAbsInputPeer peer, String link, Integer expireDate, Integer usageLimit, boolean requestNeeded, String title) throws RpcErrorException, IOException;

    TLBool messagesEditInlineBotMessage(boolean noWebpage, TLAbsInputBotInlineMessageID id, String message, TLAbsInputMedia media, TLAbsReplyMarkup replyMarkup, TLVector<TLAbsMessageEntity> entities) throws RpcErrorException, IOException;

    TLAbsUpdates messagesEditMessage(boolean noWebpage, TLAbsInputPeer peer, int id, String message, TLAbsInputMedia media, TLAbsReplyMarkup replyMarkup, TLVector<TLAbsMessageEntity> entities, Integer scheduleDate) throws RpcErrorException, IOException;

    TLChatInviteExported messagesExportChatInvite(boolean legacyRevokePermanent, boolean requestNeeded, TLAbsInputPeer peer, Integer expireDate, Integer usageLimit, String title) throws RpcErrorException, IOException;

    TLBool messagesFaveSticker(TLAbsInputDocument id, boolean unfave) throws RpcErrorException, IOException;

    TLAbsUpdates messagesForwardMessages(boolean silent, boolean background, boolean withMyScore, boolean dropAuthor, boolean dropMediaCaptions, boolean noforwards, TLAbsInputPeer fromPeer, TLIntVector id, TLLongVector randomId, TLAbsInputPeer toPeer, Integer scheduleDate, TLAbsInputPeer sendAs) throws RpcErrorException, IOException;

    TLChatAdminsWithInvites messagesGetAdminsWithInvites(TLAbsInputPeer peer) throws RpcErrorException, IOException;

    TLAbsChats messagesGetAllChats(TLLongVector exceptIds) throws RpcErrorException, IOException;

    TLAbsUpdates messagesGetAllDrafts() throws RpcErrorException, IOException;

    TLAbsAllStickers messagesGetAllStickers(long hash) throws RpcErrorException, IOException;

    TLArchivedStickers messagesGetArchivedStickers(boolean masks, long offsetId, int limit) throws RpcErrorException, IOException;

    TLVector<TLAbsStickerSetCovered> messagesGetAttachedStickers(TLAbsInputStickeredMedia media) throws RpcErrorException, IOException;

    TLAbsAvailableReactions messagesGetAvailableReactions(int hash) throws RpcErrorException, IOException;

    TLBotCallbackAnswer messagesGetBotCallbackAnswer(boolean game, TLAbsInputPeer peer, int msgId, TLBytes data, TLAbsInputCheckPasswordSRP password) throws RpcErrorException, IOException;

    TLChatInviteImporters messagesGetChatInviteImporters(boolean requested, TLAbsInputPeer peer, String link, String q, int offsetDate, TLAbsInputUser offsetUser, int limit) throws RpcErrorException, IOException;

    TLAbsChats messagesGetChats(TLLongVector id) throws RpcErrorException, IOException;

    TLAbsChats messagesGetCommonChats(TLAbsInputUser userId, long maxId, int limit) throws RpcErrorException, IOException;

    TLAbsDhConfig messagesGetDhConfig(int version, int randomLength) throws RpcErrorException, IOException;

    TLVector<TLDialogFilter> messagesGetDialogFilters() throws RpcErrorException, IOException;

    TLVector<TLAbsDialogPeer> messagesGetDialogUnreadMarks() throws RpcErrorException, IOException;

    TLAbsDialogs messagesGetDialogs(boolean excludePinned, Integer folderId, int offsetDate, int offsetId, TLAbsInputPeer offsetPeer, int limit, long hash) throws RpcErrorException, IOException;

    TLDiscussionMessage messagesGetDiscussionMessage(TLAbsInputPeer peer, int msgId) throws RpcErrorException, IOException;

    TLAbsDocument messagesGetDocumentByHash(TLBytes sha256, int size, String mimeType) throws RpcErrorException, IOException;

    TLEmojiKeywordsDifference messagesGetEmojiKeywords(String langCode) throws RpcErrorException, IOException;

    TLEmojiKeywordsDifference messagesGetEmojiKeywordsDifference(String langCode, int fromVersion) throws RpcErrorException, IOException;

    TLVector<TLEmojiLanguage> messagesGetEmojiKeywordsLanguages(TLStringVector langCodes) throws RpcErrorException, IOException;

    TLEmojiURL messagesGetEmojiURL(String langCode) throws RpcErrorException, IOException;

    TLAbsExportedChatInvite messagesGetExportedChatInvite(TLAbsInputPeer peer, String link) throws RpcErrorException, IOException;

    TLExportedChatInvites messagesGetExportedChatInvites(boolean revoked, TLAbsInputPeer peer, TLAbsInputUser adminId, Integer offsetDate, String offsetLink, int limit) throws RpcErrorException, IOException;

    TLAbsFavedStickers messagesGetFavedStickers(long hash) throws RpcErrorException, IOException;

    TLAbsFeaturedStickers messagesGetFeaturedStickers(long hash) throws RpcErrorException, IOException;

    TLChatFull messagesGetFullChat(long chatId) throws RpcErrorException, IOException;

    TLHighScores messagesGetGameHighScores(TLAbsInputPeer peer, int id, TLAbsInputUser userId) throws RpcErrorException, IOException;

    TLAbsMessages messagesGetHistory(TLAbsInputPeer peer, int offsetId, int offsetDate, int addOffset, int limit, int maxId, int minId, long hash) throws RpcErrorException, IOException;

    TLBotResults messagesGetInlineBotResults(TLAbsInputUser bot, TLAbsInputPeer peer, TLAbsInputGeoPoint geoPoint, String query, String offset) throws RpcErrorException, IOException;

    TLHighScores messagesGetInlineGameHighScores(TLAbsInputBotInlineMessageID id, TLAbsInputUser userId) throws RpcErrorException, IOException;

    TLAbsAllStickers messagesGetMaskStickers(long hash) throws RpcErrorException, IOException;

    TLMessageEditData messagesGetMessageEditData(TLAbsInputPeer peer, int id) throws RpcErrorException, IOException;

    TLMessageReactionsList messagesGetMessageReactionsList(TLAbsInputPeer peer, int id, String reaction, String offset, int limit) throws RpcErrorException, IOException;

    TLLongVector messagesGetMessageReadParticipants(TLAbsInputPeer peer, int msgId) throws RpcErrorException, IOException;

    TLAbsMessages messagesGetMessages(TLVector<TLAbsInputMessage> id) throws RpcErrorException, IOException;

    TLAbsUpdates messagesGetMessagesReactions(TLAbsInputPeer peer, TLIntVector id) throws RpcErrorException, IOException;

    TLMessageViews messagesGetMessagesViews(TLAbsInputPeer peer, TLIntVector id, boolean increment) throws RpcErrorException, IOException;

    TLAbsFeaturedStickers messagesGetOldFeaturedStickers(int offset, int limit, long hash) throws RpcErrorException, IOException;

    TLChatOnlines messagesGetOnlines(TLAbsInputPeer peer) throws RpcErrorException, IOException;

    TLPeerDialogs messagesGetPeerDialogs(TLVector<TLAbsInputDialogPeer> peers) throws RpcErrorException, IOException;

    TLPeerSettings messagesGetPeerSettings(TLAbsInputPeer peer) throws RpcErrorException, IOException;

    TLPeerDialogs messagesGetPinnedDialogs(int folderId) throws RpcErrorException, IOException;

    TLAbsUpdates messagesGetPollResults(TLAbsInputPeer peer, int msgId) throws RpcErrorException, IOException;

    TLVotesList messagesGetPollVotes(TLAbsInputPeer peer, int id, TLBytes option, String offset, int limit) throws RpcErrorException, IOException;

    TLAbsMessages messagesGetRecentLocations(TLAbsInputPeer peer, int limit, long hash) throws RpcErrorException, IOException;

    TLAbsRecentStickers messagesGetRecentStickers(boolean attached, long hash) throws RpcErrorException, IOException;

    TLAbsMessages messagesGetReplies(TLAbsInputPeer peer, int msgId, int offsetId, int offsetDate, int addOffset, int limit, int maxId, int minId, long hash) throws RpcErrorException, IOException;

    TLAbsSavedGifs messagesGetSavedGifs(long hash) throws RpcErrorException, IOException;

    TLAbsMessages messagesGetScheduledHistory(TLAbsInputPeer peer, long hash) throws RpcErrorException, IOException;

    TLAbsMessages messagesGetScheduledMessages(TLAbsInputPeer peer, TLIntVector id) throws RpcErrorException, IOException;

    TLVector<TLSearchCounter> messagesGetSearchCounters(TLAbsInputPeer peer, TLVector<TLAbsMessagesFilter> filters) throws RpcErrorException, IOException;

    TLSearchResultsCalendar messagesGetSearchResultsCalendar(TLAbsInputPeer peer, TLAbsMessagesFilter filter, int offsetId, int offsetDate) throws RpcErrorException, IOException;

    TLSearchResultsPositions messagesGetSearchResultsPositions(TLAbsInputPeer peer, TLAbsMessagesFilter filter, int offsetId, int limit) throws RpcErrorException, IOException;

    TLVector<TLMessageRange> messagesGetSplitRanges() throws RpcErrorException, IOException;

    TLAbsStickerSet messagesGetStickerSet(TLAbsInputStickerSet stickerset, int hash) throws RpcErrorException, IOException;

    TLAbsStickers messagesGetStickers(String emoticon, long hash) throws RpcErrorException, IOException;

    TLVector<TLDialogFilterSuggested> messagesGetSuggestedDialogFilters() throws RpcErrorException, IOException;

    TLAbsMessages messagesGetUnreadMentions(TLAbsInputPeer peer, int offsetId, int addOffset, int limit, int maxId, int minId) throws RpcErrorException, IOException;

    TLAbsWebPage messagesGetWebPage(String url, int hash) throws RpcErrorException, IOException;

    TLAbsMessageMedia messagesGetWebPagePreview(String message, TLVector<TLAbsMessageEntity> entities) throws RpcErrorException, IOException;

    TLAbsUpdates messagesHideAllChatJoinRequests(boolean approved, TLAbsInputPeer peer, String link) throws RpcErrorException, IOException;

    TLAbsUpdates messagesHideChatJoinRequest(boolean approved, TLAbsInputPeer peer, TLAbsInputUser userId) throws RpcErrorException, IOException;

    TLBool messagesHidePeerSettingsBar(TLAbsInputPeer peer) throws RpcErrorException, IOException;

    TLAbsUpdates messagesImportChatInvite(String hash) throws RpcErrorException, IOException;

    TLHistoryImport messagesInitHistoryImport(TLAbsInputPeer peer, TLAbsInputFile file, int mediaCount) throws RpcErrorException, IOException;

    TLAbsStickerSetInstallResult messagesInstallStickerSet(TLAbsInputStickerSet stickerset, boolean archived) throws RpcErrorException, IOException;

    TLBool messagesMarkDialogUnread(boolean unread, TLAbsInputDialogPeer peer) throws RpcErrorException, IOException;

    TLAbsUpdates messagesMigrateChat(long chatId) throws RpcErrorException, IOException;

    TLBool messagesReadDiscussion(TLAbsInputPeer peer, int msgId, int readMaxId) throws RpcErrorException, IOException;

    TLBool messagesReadEncryptedHistory(TLInputEncryptedChat peer, int maxDate) throws RpcErrorException, IOException;

    TLBool messagesReadFeaturedStickers(TLLongVector id) throws RpcErrorException, IOException;

    TLAffectedMessages messagesReadHistory(TLAbsInputPeer peer, int maxId) throws RpcErrorException, IOException;

    TLAffectedHistory messagesReadMentions(TLAbsInputPeer peer) throws RpcErrorException, IOException;

    TLAffectedMessages messagesReadMessageContents(TLIntVector id) throws RpcErrorException, IOException;

    TLVector<TLReceivedNotifyMessage> messagesReceivedMessages(int maxId) throws RpcErrorException, IOException;

    TLLongVector messagesReceivedQueue(int maxQts) throws RpcErrorException, IOException;

    TLBool messagesReorderPinnedDialogs(boolean force, int folderId, TLVector<TLAbsInputDialogPeer> order) throws RpcErrorException, IOException;

    TLBool messagesReorderStickerSets(boolean masks, TLLongVector order) throws RpcErrorException, IOException;

    TLBool messagesReport(TLAbsInputPeer peer, TLIntVector id, TLAbsReportReason reason, String message) throws RpcErrorException, IOException;

    TLBool messagesReportEncryptedSpam(TLInputEncryptedChat peer) throws RpcErrorException, IOException;

    TLBool messagesReportSpam(TLAbsInputPeer peer) throws RpcErrorException, IOException;

    TLAbsEncryptedChat messagesRequestEncryption(TLAbsInputUser userId, int randomId, TLBytes gA) throws RpcErrorException, IOException;

    TLAbsUrlAuthResult messagesRequestUrlAuth(TLAbsInputPeer peer, Integer msgId, Integer buttonId, String url) throws RpcErrorException, IOException;

    TLBool messagesSaveDefaultSendAs(TLAbsInputPeer peer, TLAbsInputPeer sendAs) throws RpcErrorException, IOException;

    TLBool messagesSaveDraft(boolean noWebpage, Integer replyToMsgId, TLAbsInputPeer peer, String message, TLVector<TLAbsMessageEntity> entities) throws RpcErrorException, IOException;

    TLBool messagesSaveGif(TLAbsInputDocument id, boolean unsave) throws RpcErrorException, IOException;

    TLBool messagesSaveRecentSticker(boolean attached, TLAbsInputDocument id, boolean unsave) throws RpcErrorException, IOException;

    TLAbsMessages messagesSearch(TLAbsInputPeer peer, String q, TLAbsInputPeer fromId, Integer topMsgId, TLAbsMessagesFilter filter, int minDate, int maxDate, int offsetId, int addOffset, int limit, int maxId, int minId, long hash) throws RpcErrorException, IOException;

    TLAbsMessages messagesSearchGlobal(Integer folderId, String q, TLAbsMessagesFilter filter, int minDate, int maxDate, int offsetRate, TLAbsInputPeer offsetPeer, int offsetId, int limit) throws RpcErrorException, IOException;

    TLAbsFoundStickerSets messagesSearchStickerSets(boolean excludeFeatured, String q, long hash) throws RpcErrorException, IOException;

    TLAbsSentEncryptedMessage messagesSendEncrypted(boolean silent, TLInputEncryptedChat peer, long randomId, TLBytes data) throws RpcErrorException, IOException;

    TLAbsSentEncryptedMessage messagesSendEncryptedFile(boolean silent, TLInputEncryptedChat peer, long randomId, TLBytes data, TLAbsInputEncryptedFile file) throws RpcErrorException, IOException;

    TLAbsSentEncryptedMessage messagesSendEncryptedService(TLInputEncryptedChat peer, long randomId, TLBytes data) throws RpcErrorException, IOException;

    TLAbsUpdates messagesSendInlineBotResult(boolean silent, boolean background, boolean clearDraft, boolean hideVia, TLAbsInputPeer peer, Integer replyToMsgId, long randomId, long queryId, String id, Integer scheduleDate, TLAbsInputPeer sendAs) throws RpcErrorException, IOException;

    TLAbsUpdates messagesSendMedia(boolean silent, boolean background, boolean clearDraft, boolean noforwards, TLAbsInputPeer peer, Integer replyToMsgId, TLAbsInputMedia media, String message, long randomId, TLAbsReplyMarkup replyMarkup, TLVector<TLAbsMessageEntity> entities, Integer scheduleDate, TLAbsInputPeer sendAs) throws RpcErrorException, IOException;

    TLAbsUpdates messagesSendMessage(boolean noWebpage, boolean silent, boolean background, boolean clearDraft, boolean noforwards, TLAbsInputPeer peer, Integer replyToMsgId, String message, long randomId, TLAbsReplyMarkup replyMarkup, TLVector<TLAbsMessageEntity> entities, Integer scheduleDate, TLAbsInputPeer sendAs) throws RpcErrorException, IOException;

    TLAbsUpdates messagesSendMultiMedia(boolean silent, boolean background, boolean clearDraft, boolean noforwards, TLAbsInputPeer peer, Integer replyToMsgId, TLVector<TLInputSingleMedia> multiMedia, Integer scheduleDate, TLAbsInputPeer sendAs) throws RpcErrorException, IOException;

    TLAbsUpdates messagesSendReaction(boolean big, TLAbsInputPeer peer, int msgId, String reaction) throws RpcErrorException, IOException;

    TLAbsUpdates messagesSendScheduledMessages(TLAbsInputPeer peer, TLIntVector id) throws RpcErrorException, IOException;

    TLAbsUpdates messagesSendScreenshotNotification(TLAbsInputPeer peer, int replyToMsgId, long randomId) throws RpcErrorException, IOException;

    TLAbsUpdates messagesSendVote(TLAbsInputPeer peer, int msgId, TLVector<TLBytes> options) throws RpcErrorException, IOException;

    TLBool messagesSetBotCallbackAnswer(boolean alert, long queryId, String message, String url, int cacheTime) throws RpcErrorException, IOException;

    TLBool messagesSetBotPrecheckoutResults(boolean success, long queryId, String error) throws RpcErrorException, IOException;

    TLBool messagesSetBotShippingResults(long queryId, String error, TLVector<TLShippingOption> shippingOptions) throws RpcErrorException, IOException;

    TLAbsUpdates messagesSetChatAvailableReactions(TLAbsInputPeer peer, TLStringVector availableReactions) throws RpcErrorException, IOException;

    TLAbsUpdates messagesSetChatTheme(TLAbsInputPeer peer, String emoticon) throws RpcErrorException, IOException;

    TLBool messagesSetDefaultReaction(String reaction) throws RpcErrorException, IOException;

    TLBool messagesSetEncryptedTyping(TLInputEncryptedChat peer, boolean typing) throws RpcErrorException, IOException;

    TLAbsUpdates messagesSetGameScore(boolean editMessage, boolean force, TLAbsInputPeer peer, int id, TLAbsInputUser userId, int score) throws RpcErrorException, IOException;

    TLAbsUpdates messagesSetHistoryTTL(TLAbsInputPeer peer, int period) throws RpcErrorException, IOException;

    TLBool messagesSetInlineBotResults(boolean gallery, boolean _private, long queryId, TLVector<TLAbsInputBotInlineResult> results, int cacheTime, String nextOffset, TLInlineBotSwitchPM switchPm) throws RpcErrorException, IOException;

    TLBool messagesSetInlineGameScore(boolean editMessage, boolean force, TLAbsInputBotInlineMessageID id, TLAbsInputUser userId, int score) throws RpcErrorException, IOException;

    TLBool messagesSetTyping(TLAbsInputPeer peer, Integer topMsgId, TLAbsSendMessageAction action) throws RpcErrorException, IOException;

    TLAbsUpdates messagesStartBot(TLAbsInputUser bot, TLAbsInputPeer peer, long randomId, String startParam) throws RpcErrorException, IOException;

    TLBool messagesStartHistoryImport(TLAbsInputPeer peer, long importId) throws RpcErrorException, IOException;

    TLBool messagesToggleDialogPin(boolean pinned, TLAbsInputDialogPeer peer) throws RpcErrorException, IOException;

    TLAbsUpdates messagesToggleNoForwards(TLAbsInputPeer peer, boolean enabled) throws RpcErrorException, IOException;

    TLBool messagesToggleStickerSets(boolean uninstall, boolean archive, boolean unarchive, TLVector<TLAbsInputStickerSet> stickersets) throws RpcErrorException, IOException;

    TLAbsTranslatedText messagesTranslateText(TLAbsInputPeer peer, Integer msgId, String text, String fromLang, String toLang) throws RpcErrorException, IOException;

    TLBool messagesUninstallStickerSet(TLAbsInputStickerSet stickerset) throws RpcErrorException, IOException;

    TLAffectedHistory messagesUnpinAllMessages(TLAbsInputPeer peer) throws RpcErrorException, IOException;

    TLBool messagesUpdateDialogFilter(int id, TLDialogFilter filter) throws RpcErrorException, IOException;

    TLBool messagesUpdateDialogFiltersOrder(TLIntVector order) throws RpcErrorException, IOException;

    TLAbsUpdates messagesUpdatePinnedMessage(boolean silent, boolean unpin, boolean pmOneside, TLAbsInputPeer peer, int id) throws RpcErrorException, IOException;

    TLAbsEncryptedFile messagesUploadEncryptedFile(TLInputEncryptedChat peer, TLAbsInputEncryptedFile file) throws RpcErrorException, IOException;

    TLAbsMessageMedia messagesUploadImportedMedia(TLAbsInputPeer peer, long importId, String fileName, TLAbsInputMedia media) throws RpcErrorException, IOException;

    TLAbsMessageMedia messagesUploadMedia(TLAbsInputPeer peer, TLAbsInputMedia media) throws RpcErrorException, IOException;

    TLBool paymentsClearSavedInfo(boolean credentials, boolean info) throws RpcErrorException, IOException;

    TLBankCardData paymentsGetBankCardData(String number) throws RpcErrorException, IOException;

    TLPaymentForm paymentsGetPaymentForm(TLAbsInputPeer peer, int msgId, TLDataJSON themeParams) throws RpcErrorException, IOException;

    TLPaymentReceipt paymentsGetPaymentReceipt(TLAbsInputPeer peer, int msgId) throws RpcErrorException, IOException;

    TLSavedInfo paymentsGetSavedInfo() throws RpcErrorException, IOException;

    TLAbsPaymentResult paymentsSendPaymentForm(long formId, TLAbsInputPeer peer, int msgId, String requestedInfoId, String shippingOptionId, TLAbsInputPaymentCredentials credentials, Long tipAmount) throws RpcErrorException, IOException;

    TLValidatedRequestedInfo paymentsValidateRequestedInfo(boolean save, TLAbsInputPeer peer, int msgId, TLPaymentRequestedInfo info) throws RpcErrorException, IOException;

    TLPhoneCall phoneAcceptCall(TLInputPhoneCall peer, TLBytes gB, TLPhoneCallProtocol protocol) throws RpcErrorException, IOException;

    TLIntVector phoneCheckGroupCall(TLInputGroupCall call, TLIntVector sources) throws RpcErrorException, IOException;

    TLPhoneCall phoneConfirmCall(TLInputPhoneCall peer, TLBytes gA, long keyFingerprint, TLPhoneCallProtocol protocol) throws RpcErrorException, IOException;

    TLAbsUpdates phoneCreateGroupCall(boolean rtmpStream, TLAbsInputPeer peer, int randomId, String title, Integer scheduleDate) throws RpcErrorException, IOException;

    TLAbsUpdates phoneDiscardCall(boolean video, TLInputPhoneCall peer, int duration, TLAbsPhoneCallDiscardReason reason, long connectionId) throws RpcErrorException, IOException;

    TLAbsUpdates phoneDiscardGroupCall(TLInputGroupCall call) throws RpcErrorException, IOException;

    TLAbsUpdates phoneEditGroupCallParticipant(TLInputGroupCall call, TLAbsInputPeer participant, boolean muted, Integer volume, boolean raiseHand, boolean videoStopped, boolean videoPaused, boolean presentationPaused) throws RpcErrorException, IOException;

    TLAbsUpdates phoneEditGroupCallTitle(TLInputGroupCall call, String title) throws RpcErrorException, IOException;

    TLExportedGroupCallInvite phoneExportGroupCallInvite(boolean canSelfUnmute, TLInputGroupCall call) throws RpcErrorException, IOException;

    TLDataJSON phoneGetCallConfig() throws RpcErrorException, IOException;

    TLGroupCall phoneGetGroupCall(TLInputGroupCall call, int limit) throws RpcErrorException, IOException;

    TLJoinAsPeers phoneGetGroupCallJoinAs(TLAbsInputPeer peer) throws RpcErrorException, IOException;

    TLGroupParticipants phoneGetGroupParticipants(TLInputGroupCall call, TLVector<TLAbsInputPeer> ids, TLIntVector sources, String offset, int limit) throws RpcErrorException, IOException;

    TLAbsUpdates phoneInviteToGroupCall(TLInputGroupCall call, TLVector<TLAbsInputUser> users) throws RpcErrorException, IOException;

    TLAbsUpdates phoneJoinGroupCall(boolean muted, boolean videoStopped, TLInputGroupCall call, TLAbsInputPeer joinAs, String inviteHash, TLDataJSON params) throws RpcErrorException, IOException;

    TLAbsUpdates phoneJoinGroupCallPresentation(TLInputGroupCall call, TLDataJSON params) throws RpcErrorException, IOException;

    TLAbsUpdates phoneLeaveGroupCall(TLInputGroupCall call, int source) throws RpcErrorException, IOException;

    TLAbsUpdates phoneLeaveGroupCallPresentation(TLInputGroupCall call) throws RpcErrorException, IOException;

    TLBool phoneReceivedCall(TLInputPhoneCall peer) throws RpcErrorException, IOException;

    TLPhoneCall phoneRequestCall(boolean video, TLAbsInputUser userId, int randomId, TLBytes gAHash, TLPhoneCallProtocol protocol) throws RpcErrorException, IOException;

    TLBool phoneSaveCallDebug(TLInputPhoneCall peer, TLDataJSON debug) throws RpcErrorException, IOException;

    TLBool phoneSaveDefaultGroupCallJoinAs(TLAbsInputPeer peer, TLAbsInputPeer joinAs) throws RpcErrorException, IOException;

    TLBool phoneSendSignalingData(TLInputPhoneCall peer, TLBytes data) throws RpcErrorException, IOException;

    TLAbsUpdates phoneSetCallRating(boolean userInitiative, TLInputPhoneCall peer, int rating, String comment) throws RpcErrorException, IOException;

    TLAbsUpdates phoneStartScheduledGroupCall(TLInputGroupCall call) throws RpcErrorException, IOException;

    TLAbsUpdates phoneToggleGroupCallRecord(boolean start, boolean video, TLInputGroupCall call, String title, boolean videoPortrait) throws RpcErrorException, IOException;

    TLAbsUpdates phoneToggleGroupCallSettings(boolean resetInviteHash, TLInputGroupCall call, boolean joinMuted) throws RpcErrorException, IOException;

    TLAbsUpdates phoneToggleGroupCallStartSubscription(TLInputGroupCall call, boolean subscribed) throws RpcErrorException, IOException;

    TLLongVector photosDeletePhotos(TLVector<TLAbsInputPhoto> id) throws RpcErrorException, IOException;

    TLAbsPhotos photosGetUserPhotos(TLAbsInputUser userId, int offset, long maxId, int limit) throws RpcErrorException, IOException;

    TLPhoto photosUpdateProfilePhoto(TLAbsInputPhoto id) throws RpcErrorException, IOException;

    TLPhoto photosUploadProfilePhoto(TLAbsInputFile file, TLAbsInputFile video, Double videoStartTs) throws RpcErrorException, IOException;

    TLBroadcastStats statsGetBroadcastStats(boolean dark, TLAbsInputChannel channel) throws RpcErrorException, IOException;

    TLMegagroupStats statsGetMegagroupStats(boolean dark, TLAbsInputChannel channel) throws RpcErrorException, IOException;

    TLAbsMessages statsGetMessagePublicForwards(TLAbsInputChannel channel, int msgId, int offsetRate, TLAbsInputPeer offsetPeer, int offsetId, int limit) throws RpcErrorException, IOException;

    TLMessageStats statsGetMessageStats(boolean dark, TLAbsInputChannel channel, int msgId) throws RpcErrorException, IOException;

    TLAbsStatsGraph statsLoadAsyncGraph(String token, Long x) throws RpcErrorException, IOException;

    TLAbsStickerSet stickersAddStickerToSet(TLAbsInputStickerSet stickerset, TLInputStickerSetItem sticker) throws RpcErrorException, IOException;

    TLAbsStickerSet stickersChangeStickerPosition(TLAbsInputDocument sticker, int position) throws RpcErrorException, IOException;

    TLBool stickersCheckShortName(String shortName) throws RpcErrorException, IOException;

    TLAbsStickerSet stickersCreateStickerSet(boolean masks, boolean animated, boolean videos, TLAbsInputUser userId, String title, String shortName, TLAbsInputDocument thumb, TLVector<TLInputStickerSetItem> stickers, String software) throws RpcErrorException, IOException;

    TLAbsStickerSet stickersRemoveStickerFromSet(TLAbsInputDocument sticker) throws RpcErrorException, IOException;

    TLAbsStickerSet stickersSetStickerSetThumb(TLAbsInputStickerSet stickerset, TLAbsInputDocument thumb) throws RpcErrorException, IOException;

    TLSuggestedShortName stickersSuggestShortName(String title) throws RpcErrorException, IOException;

    TLAbsChannelDifference updatesGetChannelDifference(boolean force, TLAbsInputChannel channel, TLAbsChannelMessagesFilter filter, int pts, int limit) throws RpcErrorException, IOException;

    TLAbsDifference updatesGetDifference(int pts, Integer ptsTotalLimit, int date, int qts) throws RpcErrorException, IOException;

    TLState updatesGetState() throws RpcErrorException, IOException;

    TLAbsCdnFile uploadGetCdnFile(TLBytes fileToken, int offset, int limit) throws RpcErrorException, IOException;

    TLVector<TLFileHash> uploadGetCdnFileHashes(TLBytes fileToken, int offset) throws RpcErrorException, IOException;

    TLAbsFile uploadGetFile(boolean precise, boolean cdnSupported, TLAbsInputFileLocation location, int offset, int limit) throws RpcErrorException, IOException;

    TLVector<TLFileHash> uploadGetFileHashes(TLAbsInputFileLocation location, int offset) throws RpcErrorException, IOException;

    TLWebFile uploadGetWebFile(TLAbsInputWebFileLocation location, int offset, int limit) throws RpcErrorException, IOException;

    TLVector<TLFileHash> uploadReuploadCdnFile(TLBytes fileToken, TLBytes requestToken) throws RpcErrorException, IOException;

    TLBool uploadSaveBigFilePart(long fileId, int filePart, int fileTotalParts, TLBytes bytes) throws RpcErrorException, IOException;

    TLBool uploadSaveFilePart(long fileId, int filePart, TLBytes bytes) throws RpcErrorException, IOException;

    TLUserFull usersGetFullUser(TLAbsInputUser id) throws RpcErrorException, IOException;

    TLVector<TLAbsUser> usersGetUsers(TLVector<TLAbsInputUser> id) throws RpcErrorException, IOException;

    TLBool usersSetSecureValueErrors(TLAbsInputUser id, TLVector<TLAbsSecureValueError> errors) throws RpcErrorException, IOException;
}
