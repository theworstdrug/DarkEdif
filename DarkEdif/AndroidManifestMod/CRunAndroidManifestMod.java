/* File generated by DarkEdifPostBuildTool v1.0.0.6, part of DarkEdif SDK. 
   DarkEdif license is available at its online repository location.
   Copyright of the AndroidManifestMod extension and all rights reserved by the creator of AndroidManifestMod.

   This file is required, but has been modified to do nothing in Android.
   The functionality of AndroidManifestMod is only in Windows; Fusion expects an Android Java file, though.
*/

package Extensions;
import android.util.Log;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.io.InputStream;
import java.io.IOException;
import Actions.CActExtension;
import Conditions.CCndExtension;
import Events.CEvent;
import Expressions.CExpExtension;
import Expressions.CValue;
import Expressions.CNativeExpInstance;
import Objects.CExtension;
import RunLoop.CCreateObjectInfo;
import RunLoop.CRun;
import Runtime.MMFRuntime;
import Services.CBinaryFile;

public class CRunAndroidManifestMod extends CRunExtension
{
	public CRunAndroidManifestMod()
	{
		// Do nothing; dummy class
	}

	@Override
	public int getNumberOfConditions() {
		return 1; // the dummy condition
	}

	// Methods accessed from C++ side of DarkEdif via JNI:

	public int darkedif_jni_getCurrentFusionEventNum()
	{
		return this.rh.rhEvtProg.rhEventGroup.evgLine;
	}

	public String darkedif_jni_makePathUnembeddedIfNeeded(String path)
	{
		return ""; // no action or condition should be used by this ext
	}
	// Returns A/C integer parameter; handles parameter-type-specific workarounds
	public int darkedif_jni_getActionOrConditionIntParam(CEvent evt, int paramIndex, int paramType)
	{
		 return 0; // no action or condition should be used by this ext
	}
};
