/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.mail.model.impl;

import com.liferay.mail.model.Account;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.Date;

/**
 * <a href="AccountModelImpl.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This interface is a model that represents the Mail_Account table in the
 * database.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       AccountImpl
 * @see       com.liferay.mail.model.Account
 * @see       com.liferay.mail.model.AccountModel
 * @generated
 */
public class AccountModelImpl extends BaseModelImpl<Account> {
	public static final String TABLE_NAME = "Mail_Account";
	public static final Object[][] TABLE_COLUMNS = {
			{ "accountId", new Integer(Types.BIGINT) },
			{ "companyId", new Integer(Types.BIGINT) },
			{ "userId", new Integer(Types.BIGINT) },
			{ "userName", new Integer(Types.VARCHAR) },
			{ "createDate", new Integer(Types.TIMESTAMP) },
			{ "modifiedDate", new Integer(Types.TIMESTAMP) },
			{ "address", new Integer(Types.VARCHAR) },
			{ "personalName", new Integer(Types.VARCHAR) },
			{ "protocol", new Integer(Types.VARCHAR) },
			{ "incomingHostName", new Integer(Types.VARCHAR) },
			{ "incomingPort", new Integer(Types.INTEGER) },
			{ "incomingSecure", new Integer(Types.BOOLEAN) },
			{ "outgoingHostName", new Integer(Types.VARCHAR) },
			{ "outgoingPort", new Integer(Types.INTEGER) },
			{ "outgoingSecure", new Integer(Types.BOOLEAN) },
			{ "login", new Integer(Types.VARCHAR) },
			{ "password_", new Integer(Types.VARCHAR) },
			{ "savePassword", new Integer(Types.BOOLEAN) },
			{ "signature", new Integer(Types.VARCHAR) },
			{ "useSignature", new Integer(Types.BOOLEAN) },
			{ "folderPrefix", new Integer(Types.VARCHAR) },
			{ "inboxFolderId", new Integer(Types.BIGINT) },
			{ "draftFolderId", new Integer(Types.BIGINT) },
			{ "sentFolderId", new Integer(Types.BIGINT) },
			{ "trashFolderId", new Integer(Types.BIGINT) },
			{ "defaultSender", new Integer(Types.BOOLEAN) }
		};
	public static final String TABLE_SQL_CREATE = "create table Mail_Account (accountId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,address VARCHAR(75) null,personalName VARCHAR(75) null,protocol VARCHAR(75) null,incomingHostName VARCHAR(75) null,incomingPort INTEGER,incomingSecure BOOLEAN,outgoingHostName VARCHAR(75) null,outgoingPort INTEGER,outgoingSecure BOOLEAN,login VARCHAR(75) null,password_ VARCHAR(75) null,savePassword BOOLEAN,signature VARCHAR(75) null,useSignature BOOLEAN,folderPrefix VARCHAR(75) null,inboxFolderId LONG,draftFolderId LONG,sentFolderId LONG,trashFolderId LONG,defaultSender BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table Mail_Account";
	public static final String ORDER_BY_JPQL = " ORDER BY account.address ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Mail_Account.address ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.mail.model.Account"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.mail.model.Account"),
			true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.mail.model.Account"));

	public AccountModelImpl() {
	}

	public long getPrimaryKey() {
		return _accountId;
	}

	public void setPrimaryKey(long pk) {
		setAccountId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_accountId);
	}

	public long getAccountId() {
		return _accountId;
	}

	public void setAccountId(long accountId) {
		_accountId = accountId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = userId;
		}
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getAddress() {
		if (_address == null) {
			return StringPool.BLANK;
		}
		else {
			return _address;
		}
	}

	public void setAddress(String address) {
		_address = address;

		if (_originalAddress == null) {
			_originalAddress = address;
		}
	}

	public String getOriginalAddress() {
		return GetterUtil.getString(_originalAddress);
	}

	public String getPersonalName() {
		if (_personalName == null) {
			return StringPool.BLANK;
		}
		else {
			return _personalName;
		}
	}

	public void setPersonalName(String personalName) {
		_personalName = personalName;
	}

	public String getProtocol() {
		if (_protocol == null) {
			return StringPool.BLANK;
		}
		else {
			return _protocol;
		}
	}

	public void setProtocol(String protocol) {
		_protocol = protocol;
	}

	public String getIncomingHostName() {
		if (_incomingHostName == null) {
			return StringPool.BLANK;
		}
		else {
			return _incomingHostName;
		}
	}

	public void setIncomingHostName(String incomingHostName) {
		_incomingHostName = incomingHostName;
	}

	public int getIncomingPort() {
		return _incomingPort;
	}

	public void setIncomingPort(int incomingPort) {
		_incomingPort = incomingPort;
	}

	public boolean getIncomingSecure() {
		return _incomingSecure;
	}

	public boolean isIncomingSecure() {
		return _incomingSecure;
	}

	public void setIncomingSecure(boolean incomingSecure) {
		_incomingSecure = incomingSecure;
	}

	public String getOutgoingHostName() {
		if (_outgoingHostName == null) {
			return StringPool.BLANK;
		}
		else {
			return _outgoingHostName;
		}
	}

	public void setOutgoingHostName(String outgoingHostName) {
		_outgoingHostName = outgoingHostName;
	}

	public int getOutgoingPort() {
		return _outgoingPort;
	}

	public void setOutgoingPort(int outgoingPort) {
		_outgoingPort = outgoingPort;
	}

	public boolean getOutgoingSecure() {
		return _outgoingSecure;
	}

	public boolean isOutgoingSecure() {
		return _outgoingSecure;
	}

	public void setOutgoingSecure(boolean outgoingSecure) {
		_outgoingSecure = outgoingSecure;
	}

	public String getLogin() {
		if (_login == null) {
			return StringPool.BLANK;
		}
		else {
			return _login;
		}
	}

	public void setLogin(String login) {
		_login = login;
	}

	public String getPassword() {
		if (_password == null) {
			return StringPool.BLANK;
		}
		else {
			return _password;
		}
	}

	public void setPassword(String password) {
		_password = password;
	}

	public boolean getSavePassword() {
		return _savePassword;
	}

	public boolean isSavePassword() {
		return _savePassword;
	}

	public void setSavePassword(boolean savePassword) {
		_savePassword = savePassword;
	}

	public String getSignature() {
		if (_signature == null) {
			return StringPool.BLANK;
		}
		else {
			return _signature;
		}
	}

	public void setSignature(String signature) {
		_signature = signature;
	}

	public boolean getUseSignature() {
		return _useSignature;
	}

	public boolean isUseSignature() {
		return _useSignature;
	}

	public void setUseSignature(boolean useSignature) {
		_useSignature = useSignature;
	}

	public String getFolderPrefix() {
		if (_folderPrefix == null) {
			return StringPool.BLANK;
		}
		else {
			return _folderPrefix;
		}
	}

	public void setFolderPrefix(String folderPrefix) {
		_folderPrefix = folderPrefix;
	}

	public long getInboxFolderId() {
		return _inboxFolderId;
	}

	public void setInboxFolderId(long inboxFolderId) {
		_inboxFolderId = inboxFolderId;
	}

	public long getDraftFolderId() {
		return _draftFolderId;
	}

	public void setDraftFolderId(long draftFolderId) {
		_draftFolderId = draftFolderId;
	}

	public long getSentFolderId() {
		return _sentFolderId;
	}

	public void setSentFolderId(long sentFolderId) {
		_sentFolderId = sentFolderId;
	}

	public long getTrashFolderId() {
		return _trashFolderId;
	}

	public void setTrashFolderId(long trashFolderId) {
		_trashFolderId = trashFolderId;
	}

	public boolean getDefaultSender() {
		return _defaultSender;
	}

	public boolean isDefaultSender() {
		return _defaultSender;
	}

	public void setDefaultSender(boolean defaultSender) {
		_defaultSender = defaultSender;
	}

	public Account toEscapedModel() {
		if (isEscapedModel()) {
			return (Account)this;
		}
		else {
			return (Account)Proxy.newProxyInstance(Account.class.getClassLoader(),
				new Class[] { Account.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					Account.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		AccountImpl clone = new AccountImpl();

		clone.setAccountId(getAccountId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setAddress(getAddress());
		clone.setPersonalName(getPersonalName());
		clone.setProtocol(getProtocol());
		clone.setIncomingHostName(getIncomingHostName());
		clone.setIncomingPort(getIncomingPort());
		clone.setIncomingSecure(getIncomingSecure());
		clone.setOutgoingHostName(getOutgoingHostName());
		clone.setOutgoingPort(getOutgoingPort());
		clone.setOutgoingSecure(getOutgoingSecure());
		clone.setLogin(getLogin());
		clone.setPassword(getPassword());
		clone.setSavePassword(getSavePassword());
		clone.setSignature(getSignature());
		clone.setUseSignature(getUseSignature());
		clone.setFolderPrefix(getFolderPrefix());
		clone.setInboxFolderId(getInboxFolderId());
		clone.setDraftFolderId(getDraftFolderId());
		clone.setSentFolderId(getSentFolderId());
		clone.setTrashFolderId(getTrashFolderId());
		clone.setDefaultSender(getDefaultSender());

		return clone;
	}

	public int compareTo(Account account) {
		int value = 0;

		value = getAddress().compareTo(account.getAddress());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		Account account = null;

		try {
			account = (Account)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = account.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{accountId=");
		sb.append(getAccountId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", personalName=");
		sb.append(getPersonalName());
		sb.append(", protocol=");
		sb.append(getProtocol());
		sb.append(", incomingHostName=");
		sb.append(getIncomingHostName());
		sb.append(", incomingPort=");
		sb.append(getIncomingPort());
		sb.append(", incomingSecure=");
		sb.append(getIncomingSecure());
		sb.append(", outgoingHostName=");
		sb.append(getOutgoingHostName());
		sb.append(", outgoingPort=");
		sb.append(getOutgoingPort());
		sb.append(", outgoingSecure=");
		sb.append(getOutgoingSecure());
		sb.append(", login=");
		sb.append(getLogin());
		sb.append(", password=");
		sb.append(getPassword());
		sb.append(", savePassword=");
		sb.append(getSavePassword());
		sb.append(", signature=");
		sb.append(getSignature());
		sb.append(", useSignature=");
		sb.append(getUseSignature());
		sb.append(", folderPrefix=");
		sb.append(getFolderPrefix());
		sb.append(", inboxFolderId=");
		sb.append(getInboxFolderId());
		sb.append(", draftFolderId=");
		sb.append(getDraftFolderId());
		sb.append(", sentFolderId=");
		sb.append(getSentFolderId());
		sb.append(", trashFolderId=");
		sb.append(getTrashFolderId());
		sb.append(", defaultSender=");
		sb.append(getDefaultSender());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(82);

		sb.append("<model><model-name>");
		sb.append("com.liferay.mail.model.Account");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>accountId</column-name><column-value><![CDATA[");
		sb.append(getAccountId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>personalName</column-name><column-value><![CDATA[");
		sb.append(getPersonalName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>protocol</column-name><column-value><![CDATA[");
		sb.append(getProtocol());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>incomingHostName</column-name><column-value><![CDATA[");
		sb.append(getIncomingHostName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>incomingPort</column-name><column-value><![CDATA[");
		sb.append(getIncomingPort());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>incomingSecure</column-name><column-value><![CDATA[");
		sb.append(getIncomingSecure());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>outgoingHostName</column-name><column-value><![CDATA[");
		sb.append(getOutgoingHostName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>outgoingPort</column-name><column-value><![CDATA[");
		sb.append(getOutgoingPort());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>outgoingSecure</column-name><column-value><![CDATA[");
		sb.append(getOutgoingSecure());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>login</column-name><column-value><![CDATA[");
		sb.append(getLogin());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>password</column-name><column-value><![CDATA[");
		sb.append(getPassword());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>savePassword</column-name><column-value><![CDATA[");
		sb.append(getSavePassword());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signature</column-name><column-value><![CDATA[");
		sb.append(getSignature());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>useSignature</column-name><column-value><![CDATA[");
		sb.append(getUseSignature());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>folderPrefix</column-name><column-value><![CDATA[");
		sb.append(getFolderPrefix());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inboxFolderId</column-name><column-value><![CDATA[");
		sb.append(getInboxFolderId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>draftFolderId</column-name><column-value><![CDATA[");
		sb.append(getDraftFolderId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sentFolderId</column-name><column-value><![CDATA[");
		sb.append(getSentFolderId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trashFolderId</column-name><column-value><![CDATA[");
		sb.append(getTrashFolderId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>defaultSender</column-name><column-value><![CDATA[");
		sb.append(getDefaultSender());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _accountId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _address;
	private String _originalAddress;
	private String _personalName;
	private String _protocol;
	private String _incomingHostName;
	private int _incomingPort;
	private boolean _incomingSecure;
	private String _outgoingHostName;
	private int _outgoingPort;
	private boolean _outgoingSecure;
	private String _login;
	private String _password;
	private boolean _savePassword;
	private String _signature;
	private boolean _useSignature;
	private String _folderPrefix;
	private long _inboxFolderId;
	private long _draftFolderId;
	private long _sentFolderId;
	private long _trashFolderId;
	private boolean _defaultSender;
	private transient ExpandoBridge _expandoBridge;
}