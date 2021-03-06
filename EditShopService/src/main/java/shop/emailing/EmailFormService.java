package shop.emailing;

import org.springframework.stereotype.Service;

import vo.UserDetail;

@Service
public class EmailFormService {

	public String findIdForm(UserDetail userdetail){
		
		String message = "<html>"
				+ "<body>"
				+ "<table border='0' cellspacing='0' cellpadding='0' style='max-width:600px'>"
				+ "<tbody>"
				+ "<tr>"
				+ "<td>"
				+ "<table width='100%' border='0' cellspacing='0' cellpadding='0'>"
				+ "<tbody>"
				+ "<tr>"
				+ "<td align='left'></td>"
				+ "<td align='right'></td>"
				+ "</tr>"
				+ "</tbody>"
				+ "</table>"
				+ "</td>"
				+ "</tr>"
				+ "<tr height='16'>"
				+ "</tr>"
				+ "<tr>"
				+ "<td>"
				+ "<table bgcolor='#4374D9' width='100%' border='0' cellspacing='0' cellpadding='0' style='min-width:332px;max-width:600px;border:1px solid #e0e0e0;border-bottom:0;border-top-left-radius:3px;border-top-right-radius:3px'>"
				+ "<tbody>"
				+ "<tr>"
				+ "<td height='72px' colspan='3'></td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td width='32px'></td>"
				+ "<td style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:24px;color:#ffffff;line-height:1.25'>ID찾기 메일입니다.</td>"
				+ "<td width='32px'>"
				+ "</td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td height='18px' colspan='3'></td>"
				+ "</tr>"
				+ "</tbody>"
				+ "</table>"
				+ "</td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td>"
				+ "<table bgcolor='#FAFAFA' width='100%' border='0' cellspacing='0' cellpadding='0' style='min-width:332px;max-width:600px;border:1px solid #f0f0f0;border-bottom:1px solid #c0c0c0;border-top:0;border-bottom-left-radius:3px;border-bottom-right-radius:3px'>"
				+ "<tbody>"
				+ "<tr height='16px'>"
				+ "<td width='32px' rowspan='3'></td>"
				+ "<td></td>"
				+ "<td width='32px' rowspan='3'></td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td>"
				+ "<table style='min-width:300px' border='0' cellspacing='0' cellpadding='0'>"
				+ "<tbody>"
				+ "<tr>"
				+ "<td style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:13px;color:#202020;line-height:1.5'>"
				+ "<br>"
				+ userdetail.getName()
				+ "님, 안녕하세요.</td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:13px;color:#202020;line-height:1.5'>"
				// homepage linke
				+ "이 메일은 <a href='http://localhost:8080/EditShopWeb/main.do' style='text-decoration:none;color:#4285f4' target='_blank'>8ROUND</a>에서 비밀번호를 요청하여 발송되는 메일입니다."
				+ "<table border='0' cellspacing='0' cellpadding='0' style='margin-top:16px;margin-bottom:16px'>"
				+ "<tbody>"
				+ "<tr valign='middle'>"
				+ "<td width='16px'></td>"
				+ "<td style='line-height:1.2'>"
				+ "<span style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:16px;color:#202020'>세부정보:</span>"
				+ "<br>"
				+ "<span style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:13px;color:#727272’>"
				+ "<br>-위치-</span>"
				+ "</td>"
				+ "</tr>"
				+ "</tbody>"
				+ "</table>"
				//homepage link
				+ "<a href='####' style='text-decoration:none;color:#4285f4' target='_blank' data-saferedirecturl='https://www.google.com/url?hl=ko&amp;q=https://support.google.com/accounts/answer/6010255&amp;source=gmail&amp;ust=1464846646501000&amp;usg=AFQjCNFNJSyXvhHDCWoOVRZoTJUm4YhoQQ'>8ROUND</a>에 회원님의 아이디는 "
				+ userdetail.getId()+"입니다."
				+ "<table style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:10px;color:#666666;line-height:18px;padding-bottom:10px'><br><tbody><tr><td>ID를 잊어버리지 않도록 유의해 주시고 만일 비밀번호를 변경하고 싶으시면 홈페이지>로그인>마이페이지 에서 다시 비밀번호를 설정하실수 있습니다.<br>"
				+ "</td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td>"
				+ "<div style='direction:ltr;text-align:left'>"
				+ "</div>"
				+ "</td>"
				+ "</tr>"
				+ "</tbody>"
				+ "</table>"
				// button link
				+ "<a href='http://localhost:8080/EditShopWeb/' style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;display:inline-block;text-align:center;text-decoration:none;min-height:36px;line-height:36px;padding-left:8px;padding-right:8px;min-width:88px;font-size:14px;font-weight:400;color:#ffffff;background-color:#4184f3;border-radius:2px;border-width:0px' target='_blank'>홈페이지로</a>"
				+ "</td>"
				+ "</tr>"
				+ "<tr height='32px'>"
				+ "</tr>"
				+ "<tr>"
				+ "<td colspan='2' style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:13px;color:#202020;line-height:1.5'>감사합니다.<br>8ROUND"
				+ "</td>"
				+ "</tr>"
				+ "<tr height='16px'>"
				+ "</tr>"
				+ "<tr>"
				+ "<td colspan='2'>"
				+ "<table style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:12px;color:#b9b9b9;line-height:1.5'>"
				+ "<tbody>"
				+ "<tr>"
				+ "<td >*이 위치는 로그인한 IP 주소를 근거로 한 대략적인 위치입니다.<br></td>"
				+ "</tr>"
				+ "<tr>"
				// homepage link
				+ "<td colspan='2'>본 이메일은 발신 전용입니다. 자세히 알아보려면 <a href='####' style='text-decoration:none;color:#4285f4' target='_blank' data-saferedirecturl='https://www.google.com/url?hl=ko&amp;q=https://support.google.com/accounts/answer/6010255&amp;source=gmail&amp;ust=1464846646501000&amp;usg=AFQjCNFNJSyXvhHDCWoOVRZoTJUm4YhoQQ'>8ROUND</a>를 방문하세요.</td>"
				+ "</tr>"
				+ "</tbody>"
				+ "</table>"
				+ "</td>"
				+ "</tr>"
				+ "</tbody>"
				+ "</table>"
				+ "</td>"
				+ "</tr>"
				+ "<tr height='32px'>"
				+ "</tr>"
				+ "</tbody>"
				+ "</table>"
				+ "</td>"
				+ "</tr>"
				+ "<tr height='16'>"
				+ "</tr>"
				+ "<tr>"
				+ "<td style='max-width:600px;font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:10px;color:#bcbcbc;line-height:1.5'></td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td>"
				+ "</td>"
				+ "</tr>"
				+ "</tbody>"
				+ "</table>"
				+ "</body>"
				+ "</html>";
		
		return message;
	}
	
public String findPwdForm(UserDetail userdetail, String temporarilyPwd){
		
		String message = "<html>"
				+ "<body>"
				+ "<table border='0' cellspacing='0' cellpadding='0' style='max-width:600px'>"
				+ "<tbody>"
				+ "<tr>"
				+ "<td>"
				+ "<table width='100%' border='0' cellspacing='0' cellpadding='0'>"
				+ "<tbody>"
				+ "<tr>"
				+ "<td align='left'></td>"
				+ "<td align='right'></td>"
				+ "</tr>"
				+ "</tbody>"
				+ "</table>"
				+ "</td>"
				+ "</tr>"
				+ "<tr height='16'>"
				+ "</tr>"
				+ "<tr>"
				+ "<td>"
				+ "<table bgcolor='#4374D9' width='100%' border='0' cellspacing='0' cellpadding='0' style='min-width:332px;max-width:600px;border:1px solid #e0e0e0;border-bottom:0;border-top-left-radius:3px;border-top-right-radius:3px'>"
				+ "<tbody>"
				+ "<tr>"
				+ "<td height='72px' colspan='3'></td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td width='32px'></td>"
				+ "<td style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:24px;color:#ffffff;line-height:1.25'>비밀번호 찾기 메일입니다.</td>"
				+ "<td width='32px'>"
				+ "</td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td height='18px' colspan='3'></td>"
				+ "</tr>"
				+ "</tbody>"
				+ "</table>"
				+ "</td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td>"
				+ "<table bgcolor='#FAFAFA' width='100%' border='0' cellspacing='0' cellpadding='0' style='min-width:332px;max-width:600px;border:1px solid #f0f0f0;border-bottom:1px solid #c0c0c0;border-top:0;border-bottom-left-radius:3px;border-bottom-right-radius:3px'>"
				+ "<tbody>"
				+ "<tr height='16px'>"
				+ "<td width='32px' rowspan='3'></td>"
				+ "<td></td>"
				+ "<td width='32px' rowspan='3'></td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td>"
				+ "<table style='min-width:300px' border='0' cellspacing='0' cellpadding='0'>"
				+ "<tbody>"
				+ "<tr>"
				+ "<td style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:13px;color:#202020;line-height:1.5'>"
				+ "<br>"
				+ userdetail.getName()
				+ "님, 안녕하세요.</td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:13px;color:#202020;line-height:1.5'>"
				// homepage link
				+ "이 메일은 <a href='http://localhost:8080/EditShopWeb/main.do' style='text-decoration:none;color:#4285f4' target='_blank'>8ROUND</a>에서 비밀번호 변경을 요청하여 발송되는 메일입니다."
				+ "<table border='0' cellspacing='0' cellpadding='0' style='margin-top:16px;margin-bottom:16px'>"
				+ "<tbody>"
				+ "<tr valign='middle'>"
				+ "<td width='16px'></td>"
				+ "<td style='line-height:1.2'>"
				+ "<span style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:16px;color:#202020'>세부정보:</span>"
				+ "<br>"
				+ "<span style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:13px;color:#727272’>"
				+ "<br>-위치-</span>"
				+ "</td>"
				+ "</tr>"
				+ "</tbody>"
				+ "</table>"
				// homepage link
				+ "<a href='####' style='text-decoration:none;color:#4285f4' target='_blank' data-saferedirecturl='https://www.google.com/url?hl=ko&amp;q=https://support.google.com/accounts/answer/6010255&amp;source=gmail&amp;ust=1464846646501000&amp;usg=AFQjCNFNJSyXvhHDCWoOVRZoTJUm4YhoQQ'>8ROUND</a>에 회원님이 비밀번호를 요청하셔서"
				+ "<table style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:10px;color:#666666;line-height:18px;padding-bottom:10px'><br>"
				+ "<tbody>"
				+ "<tr>"
				+ "<td>임시로 발급된 비밀번호는  "+temporarilyPwd+"입니다. 비밀번호 변경시 까지 임시 비밀번호는 유효합니다."
				+ "비밀번호를 잊어버리지 않도록 유의해 주시고 만일 비밀번호를 변경하고 싶으시면 홈페이지>로그인>마이페이지 에서 다시 비밀번호를 설정하실수 있습니다.<br>"
				+ "</td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td>"
				+ "<div style='direction:ltr;text-align:left'>"
				+ "</div>"
				+ "</td>"
				+ "</tr>"
				+ "</tbody>"
				+ "</table>"
				// button link
				+ "<a href='http://localhost:8080/EditShopWeb/views/login.jsp' style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;display:inline-block;text-align:center;text-decoration:none;min-height:36px;line-height:36px;padding-left:8px;padding-right:8px;min-width:88px;font-size:14px;font-weight:400;color:#ffffff;background-color:#4184f3;border-radius:2px;border-width:0px' target='_blank'>홈페이지로</a>"
				+ "</td>"
				+ "</tr>"
				+ "<tr height='32px'>"
				+ "</tr>"
				+ "<tr>"
				+ "<td colspan='2' style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:13px;color:#202020;line-height:1.5'>감사합니다.<br>8ROUND"
				+ "</td>"
				+ "</tr>"
				+ "<tr height='16px'>"
				+ "</tr>"
				+ "<tr>"
				+ "<td colspan='2'>"
				+ "<table style='font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:12px;color:#b9b9b9;line-height:1.5'>"
				+ "<tbody>"
				+ "<tr>"
				+ "<td >*이 위치는 로그인한 IP 주소를 근거로 한 대략적인 위치입니다.<br></td>"
				+ "</tr>"
				+ "<tr>"
				// homepage link
				+ "<td colspan='2'>본 이메일은 발신 전용입니다. 자세히 알아보려면 <a href='####' style='text-decoration:none;color:#4285f4' target='_blank' data-saferedirecturl='https://www.google.com/url?hl=ko&amp;q=https://support.google.com/accounts/answer/6010255&amp;source=gmail&amp;ust=1464846646501000&amp;usg=AFQjCNFNJSyXvhHDCWoOVRZoTJUm4YhoQQ'>8ROUND</a>를 방문하세요.</td>"
				+ "</tr>" + "</tbody>" + "</table>" + "</td>" + "</tr>" + "</tbody>" + "</table>" + "</td>"
				+ "</tr>" + "<tr height='32px'>" + "</tr>" + "</tbody>" + "</table>"
				+ "</td>" + "</tr>" + "<tr height='16'>" + "</tr>" + "<tr>"
				+ "<td style='max-width:600px;font-family:Roboto-Regular,Helvetica,Arial,sans-serif;font-size:10px;color:#bcbcbc;line-height:1.5'></td>"
				+ "</tr>" + "<tr>" + "<td>" + "</td>" + "</tr>"
				+ "</tbody>" + "</table>" + "</body>" + "</html>";
		
		return message;
	}
}
