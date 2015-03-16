// This file was generated by Mendix Business Modeler 5.0.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package appcloudservices.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the AppCloudServices module

	public static String getEnvironmentPassword()
	{
		return (String)Core.getConfiguration().getConstantValue("AppCloudServices.EnvironmentPassword");
	}

	public static String getEnvironmentUUID()
	{
		return (String)Core.getConfiguration().getConstantValue("AppCloudServices.EnvironmentUUID");
	}

	public static String getInviteAPI_Location()
	{
		return (String)Core.getConfiguration().getConstantValue("AppCloudServices.InviteAPI_Location");
	}

	public static boolean getOpenIdEnabled()
	{
		return (Boolean)Core.getConfiguration().getConstantValue("AppCloudServices.OpenIdEnabled");
	}

	public static String getOpenIdProvider()
	{
		return (String)Core.getConfiguration().getConstantValue("AppCloudServices.OpenIdProvider");
	}

	public static String getPermissionsAPI_Location()
	{
		return (String)Core.getConfiguration().getConstantValue("AppCloudServices.PermissionsAPI_Location");
	}

	public static String getProfileServiceLocation()
	{
		return (String)Core.getConfiguration().getConstantValue("AppCloudServices.ProfileServiceLocation");
	}
}