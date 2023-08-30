/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practice.app.rest.Repo;

/**
 *
 * @author mo
 */
import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.app.rest.Models.User;

public interface UserRepo extends JpaRepository<User, Long>  {
    
}
