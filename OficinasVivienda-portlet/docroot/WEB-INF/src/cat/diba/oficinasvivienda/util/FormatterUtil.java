package cat.diba.oficinasvivienda.util;

import com.liferay.portal.kernel.util.StringPool;


public class FormatterUtil {

	public static String formatPhone(final String phone) {
		String result = null;

		if (phone != null && !phone.equals(StringPool.BLANK)) {
			final String withoutMinusPhone = phone.replaceAll(StringPool.DASH,
					StringPool.BLANK);

			if (withoutMinusPhone.length() >= 9) {
				result = withoutMinusPhone.substring(0, 3) + StringPool.SPACE
						+ withoutMinusPhone.substring(3, 6) + StringPool.SPACE
						+ withoutMinusPhone.substring(6, 9);
			} else {
				result = withoutMinusPhone; // Ante un caso extraño, se
				// devuelve tal cual.
			}
		}

		return result;
	}
}
