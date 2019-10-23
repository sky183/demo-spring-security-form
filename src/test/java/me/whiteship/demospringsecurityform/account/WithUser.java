package me.whiteship.demospringsecurityform.account;

import org.springframework.security.test.context.support.WithMockUser;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 커스텀 애노테이션 - Runtime 동안만 유지
 */
@Retention(RetentionPolicy.RUNTIME)
@WithMockUser(username = "keesun", roles = "USER")
public @interface WithUser {

}
