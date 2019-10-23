package me.whiteship.demospringsecurityform.form;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    public void dashboard() {
/*        Authentication authentication = SecurityContextHolder.getContext().getAuthentication(); //인증이 되면 반환되는 객체
        Object principal = authentication.getPrincipal(); //로그인한 사용자
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities(); //사용자의 권한 "ROLE_ADMIN" 등
        Object credentials = authentication.getCredentials(); //null
        boolean authenticated = authentication.isAuthenticated(); //true만 반환하게 됨*/

/*        Account account = AccountContext.getAccount();
        System.out.println("====================");
        System.out.println(account.getUsername());
        System.out.println(account.getPassword());*/

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        System.out.println("====================");
        System.out.println(authentication);
        System.out.println(userDetails.getUsername());





    }
}
