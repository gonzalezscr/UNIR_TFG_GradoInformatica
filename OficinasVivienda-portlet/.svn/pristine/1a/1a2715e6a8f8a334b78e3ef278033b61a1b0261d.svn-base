package cat.diba.oficinasvivienda.util;


import java.text.MessageFormat;

import javax.portlet.PortletRequest;


/**
 * Clase para agrupar los métodos que generan URLs en el directorio de
 * municipios (escudos, imágenes del municipio y demás).
 */
public class UrlUtil {

	private static final MessageFormat SHIELD_URL_FORMAT = new MessageFormat(
			"http://media.diba.cat/diba/municipis/img/escuts/ec{0}.png");

	private static final MessageFormat PHOTO_URL_FORMAT = new MessageFormat(
			"http://media.diba.cat/diba/municipis/img/vistes/vista{0}.jpg");

	public static String getShieldUrl(final PortletRequest req,
			final String anIne) {

		String result = getImgUrl(req, anIne, SHIELD_URL_FORMAT);

		return result;
	}

	
	public static String getPhotoUrl(final PortletRequest req,
			final String anIne) {

		String result = getImgUrl(req, anIne, PHOTO_URL_FORMAT);

		return result;
	}

	protected static String getImgUrl(final PortletRequest req,
			final String anIne, final MessageFormat urlFormat) {

		String result = null;

		if (anIne != null) {
			final int ineLength = anIne.length();

			if (ineLength >= 3) {
				final String imgName = anIne; 

				final String baseUrl = urlFormat
						.format(new String[] { imgName });

				result = UrlUtil.getUrl(req, baseUrl);
			}
		}

		return result;
	}
	
	public static String getUrl(final PortletRequest req, final String baseUrl) {

		
		String result = null;

		if (baseUrl.startsWith("/")) {
			final String contextPath = req.getContextPath();

			if (contextPath != null && !contextPath.equals("/")) {
				result = contextPath + baseUrl;
			} else {
				result = baseUrl;
			}
		} else {
			result = baseUrl;
		}

		return result;
	}
}
