/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.interfaces;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IPlugins extends Serializable {

	/**
	 * Setter for <code>information_schema.PLUGINS.PLUGIN_NAME</code>.
	 */
	public void setPluginName(String value);

	/**
	 * Getter for <code>information_schema.PLUGINS.PLUGIN_NAME</code>.
	 */
	public String getPluginName();

	/**
	 * Setter for <code>information_schema.PLUGINS.PLUGIN_VERSION</code>.
	 */
	public void setPluginVersion(String value);

	/**
	 * Getter for <code>information_schema.PLUGINS.PLUGIN_VERSION</code>.
	 */
	public String getPluginVersion();

	/**
	 * Setter for <code>information_schema.PLUGINS.PLUGIN_STATUS</code>.
	 */
	public void setPluginStatus(String value);

	/**
	 * Getter for <code>information_schema.PLUGINS.PLUGIN_STATUS</code>.
	 */
	public String getPluginStatus();

	/**
	 * Setter for <code>information_schema.PLUGINS.PLUGIN_TYPE</code>.
	 */
	public void setPluginType(String value);

	/**
	 * Getter for <code>information_schema.PLUGINS.PLUGIN_TYPE</code>.
	 */
	public String getPluginType();

	/**
	 * Setter for <code>information_schema.PLUGINS.PLUGIN_TYPE_VERSION</code>.
	 */
	public void setPluginTypeVersion(String value);

	/**
	 * Getter for <code>information_schema.PLUGINS.PLUGIN_TYPE_VERSION</code>.
	 */
	public String getPluginTypeVersion();

	/**
	 * Setter for <code>information_schema.PLUGINS.PLUGIN_LIBRARY</code>.
	 */
	public void setPluginLibrary(String value);

	/**
	 * Getter for <code>information_schema.PLUGINS.PLUGIN_LIBRARY</code>.
	 */
	public String getPluginLibrary();

	/**
	 * Setter for <code>information_schema.PLUGINS.PLUGIN_LIBRARY_VERSION</code>.
	 */
	public void setPluginLibraryVersion(String value);

	/**
	 * Getter for <code>information_schema.PLUGINS.PLUGIN_LIBRARY_VERSION</code>.
	 */
	public String getPluginLibraryVersion();

	/**
	 * Setter for <code>information_schema.PLUGINS.PLUGIN_AUTHOR</code>.
	 */
	public void setPluginAuthor(String value);

	/**
	 * Getter for <code>information_schema.PLUGINS.PLUGIN_AUTHOR</code>.
	 */
	public String getPluginAuthor();

	/**
	 * Setter for <code>information_schema.PLUGINS.PLUGIN_DESCRIPTION</code>.
	 */
	public void setPluginDescription(String value);

	/**
	 * Getter for <code>information_schema.PLUGINS.PLUGIN_DESCRIPTION</code>.
	 */
	public String getPluginDescription();

	/**
	 * Setter for <code>information_schema.PLUGINS.PLUGIN_LICENSE</code>.
	 */
	public void setPluginLicense(String value);

	/**
	 * Getter for <code>information_schema.PLUGINS.PLUGIN_LICENSE</code>.
	 */
	public String getPluginLicense();

	/**
	 * Setter for <code>information_schema.PLUGINS.LOAD_OPTION</code>.
	 */
	public void setLoadOption(String value);

	/**
	 * Getter for <code>information_schema.PLUGINS.LOAD_OPTION</code>.
	 */
	public String getLoadOption();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IPlugins
	 */
	public void from(com.intuit.datasource.jooq.information_schema.tables.interfaces.IPlugins from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IPlugins
	 */
	public <E extends com.intuit.datasource.jooq.information_schema.tables.interfaces.IPlugins> E into(E into);
}
