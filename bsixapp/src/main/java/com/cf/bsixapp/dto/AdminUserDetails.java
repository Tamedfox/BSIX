//package com.cf.bsixapp.dto;
//
//import com.cf.bsixapp.mbg.model.BSixBackAdmin;
//import com.cf.bsixapp.mbg.model.BSixBackPermission;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
///**
// * Spring用user类
// */
//public class AdminUserDetails implements UserDetails {
//
//    private BSixBackAdmin backAdmin;
//
//    private List<BSixBackPermission> permissionList;
//
//    public AdminUserDetails(BSixBackAdmin backAdmin, List<BSixBackPermission> permissionList) {
//        this.backAdmin = backAdmin;
//        this.permissionList = permissionList;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
//        for (BSixBackPermission permission : permissionList) {
//            authorities.add(new SimpleGrantedAuthority(permission.getUrl()));
//        }
//        return authorities;
//    }
//
//    @Override
//    public String getPassword() {
//        return backAdmin.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return backAdmin.getUsername();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return backAdmin.getStatus().equals("1");
//    }
//}
