package dev.aquashdw.community.controller;

import dev.aquashdw.community.entity.UserEntity;
import dev.aquashdw.community.entity.ShopEntity;
import dev.aquashdw.community.repository.ShopRepository;
import dev.aquashdw.community.repository.UserRepository;
import dev.aquashdw.community.service.ShopService;
import dev.aquashdw.community.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@Controller
@RequestMapping("shop")
public class ShopController {
    private static final Logger logger = LoggerFactory.getLogger(ShopController.class);
    private final ShopService shopService;
    private final ShopRepository shopRepository;
    private final PasswordEncoder passwordEncoder;

    public ShopController(
            @Autowired ShopService shopService,
            @Autowired ShopRepository shopRepository,
            @Autowired PasswordEncoder passwordEncoder
    ) {
        this.shopService = shopService;
        this.shopRepository = shopRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("regist")
    private String registShop(
            @RequestParam("shopname") String shopname
//            @RequestParam("owner_id") Long id
//            @RequestParam("password_check") String passwordCheck,
//            @RequestParam("isShopOwner") Boolean isShopOwner
    ){
//        if(!password.equals(passwordCheck)){
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
//        }
        ShopEntity newShop = new ShopEntity();
        newShop.setName(shopname);
//        newShop.setId(id);
        shopRepository.save(newShop);
//        newShop.setPassword(passwordEncoder.encode(password));
//        newShop.setShopOwner(isShopOwner);
//        userRepository.save(newUser);

        return "redirect:/home";
    }

    @GetMapping("regist")
    public String shop(){
        return "regist-shop-form";
    }
//    @PostMapping
//    public ResponseEntity<ShopDto> createShop(@RequestBody ShopDto shopDto){
//        return ResponseEntity.ok(this.shopService.createShop(shopDto));
//    }
//
//    @GetMapping("{id}")
//    public ResponseEntity<ShopDto> readShop(@PathVariable("id") Long id) {
//        return ResponseEntity.ok(this.shopService.readShop(id));
//    }
//
//    @GetMapping
//    public ResponseEntity<Collection<ShopDto>> readShopAll(){
//        return ResponseEntity.ok(this.shopService.readShopAll());
//    }
//
//    @PutMapping("{id}")
//    public ResponseEntity<?> updateShop(@PathVariable("id") Long id, @RequestBody ShopDto shopDto){
//        this.shopService.updateShop(id, shopDto);
//        return ResponseEntity.noContent().build();
//    }
//
//    @DeleteMapping("{id}")
//    public ResponseEntity<?> deleteShop(@PathVariable("id") Long id) {
//        this.shopService.deleteShop(id);
//        return ResponseEntity.noContent().build();
//    }
//
//    @PostMapping("{shopId}/post")
//    public ResponseEntity<ShopPostDto> createShopPost(
//            @PathVariable("shopId") Long shopId,
//            @RequestBody ShopPostDto shopPostDto){
//        return ResponseEntity.ok(this.shopService.createShopPost(shopId, shopPostDto));
//    }
//
//    @GetMapping("{shopId}/post/{postId}")
//    public ResponseEntity<ShopPostDto> readShopPost(
//            @PathVariable("shopId") Long shopId, @PathVariable("postId") Long postId
//    ) {
//        return ResponseEntity.ok(this.shopService.readShopPost(shopId, postId));
//    }
//
//    @GetMapping("{shopId}/post")
//    public ResponseEntity<Collection<ShopPostDto>> readShopPostAll(
//            @PathVariable("shopId") Long shopId
//    ) {
//        return ResponseEntity.ok(this.shopService.readShopPostAll(shopId));
//    }
//
//    @PutMapping("{shopId}/post/{postId}")
//    public ResponseEntity<?> updateShopPost(
//            @PathVariable("shopId") Long shopId,
//            @PathVariable("postId") Long postId,
//            @RequestBody ShopPostDto shopPostDto
//    ){
//        this.shopService.updateShopPost(shopId, postId, shopPostDto);
//        return ResponseEntity.noContent().build();
//    }
//
//    @DeleteMapping("{shopId}/post/{postId}")
//    public ResponseEntity<?> deleteShopPost(
//            @PathVariable("shopId") Long shopId,
//            @PathVariable("postId") Long postId
//    ){
//        this.shopService.deleteShopPost(shopId, postId);
//        return ResponseEntity.noContent().build();
//    }
//
//    @PostMapping("{shopId}/review")
//    public ResponseEntity<ShopReviewDto> createShopReview(
//            @PathVariable("shopId") Long shopId,
//            @RequestBody ShopReviewDto shopReviewDto){
//        return ResponseEntity.ok(this.shopService.createShopReview(shopId, shopReviewDto));
//    }
//
//    @GetMapping("{shopId}/review/{reviewId}")
//    public ResponseEntity<ShopReviewDto> readShopReview(
//            @PathVariable("shopId") Long shopId,
//            @PathVariable("reviewId") Long reviewId
//    ) {
//        return ResponseEntity.ok(this.shopService.readShopReview(shopId, reviewId));
//    }
//
//    @GetMapping("{shopId}/review")
//    public ResponseEntity<Collection<ShopReviewDto>> readShopReviewAll(
//            @PathVariable("shopId") Long shopId
//    ) {
//        return ResponseEntity.ok(this.shopService.readShopReviewAll(shopId));
//    }
//
//    @PutMapping("{shopId}/review/{reviewId}")
//    public ResponseEntity<?> updateShopReview(
//            @PathVariable("shopId") Long shopId,
//            @PathVariable("reviewId") Long reviewId,
//            @RequestBody ShopReviewDto shopReviewDto
//    ){
//        this.shopService.updateShopReview(shopId, reviewId, shopReviewDto);
//        return ResponseEntity.noContent().build();
//    }
//
//    @DeleteMapping("{shopId}/review/{reviewId}")
//    public ResponseEntity<?> deleteShopReview(
//            @PathVariable("shopId") Long shopId,
//            @PathVariable("reviewId") Long reviewId
//    ){
//        this.shopService.deleteShopReview(shopId, reviewId);
//        return ResponseEntity.noContent().build();
//    }
}
