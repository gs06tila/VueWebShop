
package com.vueApplication.VueWebShop;

import com.vueApplication.VueWebShop.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VueWebShopApplication {

	@Autowired
	private ProductRepository repository;

	@Autowired
	private ProductVariantsRepository productVariantsRepository;

	@Autowired
	StoreRepository storeRepository;

	@Autowired
	StorageRepository storageRepository;

	@Autowired
    ColourRepository coloursRepository;

	public static void main(String[] args) {
		SpringApplication.run(VueWebShopApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Product p1 = new Product("Samsung Galaxy S8",
					"samsung-galaxy-s8",
					"http://placehold.it/200x300",
					"Samsung Galaxy S8 Android smartphone with true edge to edge display",
					"Lorem ipsum dolor sit amet consectetur adipisicing elit. Perferendis tempora ad cum laudantium, omnis fugit amet iure animi corporis labore repellat magnam perspiciatis explicabo maiores fuga provident a obcaecati tenetur nostrum, quidem quod dignissimos, voluptatem quasi? Nisi quaerat, fugit voluptas ducimus facilis impedit quod dicta, laborum sint iure nihil veniam aspernatur delectus officia culpa, at cupiditate? Totam minima ut deleniti laboriosam dolores cumque in, nesciunt optio! Quod recusandae voluptate facere pariatur soluta vel corrupti tenetur aut maiores, cumque mollitia fugiat laudantium error odit voluptas nobis laboriosam quo, rem deleniti? Iste quidem amet perferendis sed iusto tempora modi illo tempore quibusdam laborum? Dicta aliquam libero, facere, maxime corporis qui officiis explicabo aspernatur non consequatur mollitia iure magnam odit enim. Eligendi suscipit, optio officiis repellat eos quis iure? Omnis, error aliquid quibusdam iste amet nihil nisi cumque magni sequi enim illo autem nesciunt optio accusantium animi commodi tenetur neque eum vitae est.",
					499.99);
			Product p2 = new Product("HTC U11",
					"htc-u11",
					"http://placehold.it/200x300",
					"HTC U11 Android smartphone with built-in Amazon Alexa",
					"Lorem ipsum dolor sit amet consectetur adipisicing elit. Perferendis tempora ad cum laudantium, omnis fugit amet iure animi corporis labore repellat magnam perspiciatis explicabo maiores fuga provident a obcaecati tenetur nostrum, quidem quod dignissimos, voluptatem quasi? Nisi quaerat, fugit voluptas ducimus facilis impedit quod dicta, laborum sint iure nihil veniam aspernatur delectus officia culpa, at cupiditate? Totam minima ut deleniti laboriosam dolores cumque in, nesciunt optio! Quod recusandae voluptate facere pariatur soluta vel corrupti tenetur aut maiores, cumque mollitia fugiat laudantium error odit voluptas nobis laboriosam quo, rem deleniti? Iste quidem amet perferendis sed iusto tempora modi illo tempore quibusdam laborum? Dicta aliquam libero, facere, maxime corporis qui officiis explicabo aspernatur non consequatur mollitia iure magnam odit enim. Eligendi suscipit, optio officiis repellat eos quis iure? Omnis, error aliquid quibusdam iste amet nihil nisi cumque magni sequi enim illo autem nesciunt optio accusantium animi commodi tenetur neque eum vitae est.",
					599.99);
			Product p3 = new Product("Samsung Galaxy S9",
					"samsung-galaxy-s9",
					"http://placehold.it/200x300",
					"Samsung Galaxy S9 Android smartphone with true edge to edge display",
					"Lorem ipsum dolor sit amet consectetur adipisicing elit. Perferendis tempora ad cum laudantium, omnis fugit amet iure animi corporis labore repellat magnam perspiciatis explicabo maiores fuga provident a obcaecati tenetur nostrum, quidem quod dignissimos, voluptatem quasi? Nisi quaerat, fugit voluptas ducimus facilis impedit quod dicta, laborum sint iure nihil veniam aspernatur delectus officia culpa, at cupiditate? Totam minima ut deleniti laboriosam dolores cumque in, nesciunt optio! Quod recusandae voluptate facere pariatur soluta vel corrupti tenetur aut maiores, cumque mollitia fugiat laudantium error odit voluptas nobis laboriosam quo, rem deleniti? Iste quidem amet perferendis sed iusto tempora modi illo tempore quibusdam laborum? Dicta aliquam libero, facere, maxime corporis qui officiis explicabo aspernatur non consequatur mollitia iure magnam odit enim. Eligendi suscipit, optio officiis repellat eos quis iure? Omnis, error aliquid quibusdam iste amet nihil nisi cumque magni sequi enim illo autem nesciunt optio accusantium animi commodi tenetur neque eum vitae est.",
					699.99);
			Product p4 = new Product("Samsung Galaxy S10",
					"samsung-galaxy-s10",
					"http://placehold.it/200x300",
					"Samsung Galaxy S10 Android smartphone with true edge to edge display",
					"Lorem ipsum dolor sit amet consectetur adipisicing elit. Perferendis tempora ad cum laudantium, omnis fugit amet iure animi corporis labore repellat magnam perspiciatis explicabo maiores fuga provident a obcaecati tenetur nostrum, quidem quod dignissimos, voluptatem quasi? Nisi quaerat, fugit voluptas ducimus facilis impedit quod dicta, laborum sint iure nihil veniam aspernatur delectus officia culpa, at cupiditate? Totam minima ut deleniti laboriosam dolores cumque in, nesciunt optio! Quod recusandae voluptate facere pariatur soluta vel corrupti tenetur aut maiores, cumque mollitia fugiat laudantium error odit voluptas nobis laboriosam quo, rem deleniti? Iste quidem amet perferendis sed iusto tempora modi illo tempore quibusdam laborum? Dicta aliquam libero, facere, maxime corporis qui officiis explicabo aspernatur non consequatur mollitia iure magnam odit enim. Eligendi suscipit, optio officiis repellat eos quis iure? Omnis, error aliquid quibusdam iste amet nihil nisi cumque magni sequi enim illo autem nesciunt optio accusantium animi commodi tenetur neque eum vitae est.",
					199.99);
			Product p5 = new Product("Apple iPhone 11PRO",
					"apple-iphone-11-pro",
					"http://placehold.it/200x300",
					"Apple iPhone 11PRO IOS smartphone with awesome camera and bright display",
					"Lorem ipsum dolor sit amet consectetur adipisicing elit. Perferendis tempora ad cum laudantium, omnis fugit amet iure animi corporis labore repellat magnam perspiciatis explicabo maiores fuga provident a obcaecati tenetur nostrum, quidem quod dignissimos, voluptatem quasi? Nisi quaerat, fugit voluptas ducimus facilis impedit quod dicta, laborum sint iure nihil veniam aspernatur delectus officia culpa, at cupiditate? Totam minima ut deleniti laboriosam dolores cumque in, nesciunt optio! Quod recusandae voluptate facere pariatur soluta vel corrupti tenetur aut maiores, cumque mollitia fugiat laudantium error odit voluptas nobis laboriosam quo, rem deleniti? Iste quidem amet perferendis sed iusto tempora modi illo tempore quibusdam laborum? Dicta aliquam libero, facere, maxime corporis qui officiis explicabo aspernatur non consequatur mollitia iure magnam odit enim. Eligendi suscipit, optio officiis repellat eos quis iure? Omnis, error aliquid quibusdam iste amet nihil nisi cumque magni sequi enim illo autem nesciunt optio accusantium animi commodi tenetur neque eum vitae est.",
					899.99);

			repository.save(p1);;
			repository.save(p2);
			repository.save(p3);
			repository.save(p4);
			repository.save(p5);

			Storage st1 = new Storage("32GB");
			Storage st2 = new Storage("64GB");
			Storage st3 = new Storage("86GB");
			Storage st4 = new Storage("120GB");
			Storage st5 = new Storage("12GB");

			storageRepository.save(st1);
			storageRepository.save(st2);
			storageRepository.save(st3);
			storageRepository.save(st4);
			storageRepository.save(st5);

			Colour c1 = new Colour("Black");
            Colour c2 = new Colour("White");
            Colour c3 = new Colour("Green");
			Colour c4 = new Colour("Gold");

            coloursRepository.save(c1);
            coloursRepository.save(c2);
            coloursRepository.save(c3);
			coloursRepository.save(c4);

			Store s1 = new Store(
					"findphone-växjö",
					"Phonecapital",
					"Växjö",
					"Sweden",
					"35246",
					"Handelsvägen 3",
					"Lorem ipsum dolor sit amet consectetur adipisicing elit. Perferendis tempora ad cum laudantium, omnis fugit amet iure animi corporis labore repellat magnam perspiciatis explicabo maiores fuga provident a obcaecati tenetur nostrum, quidem quod dignissimos, voluptatem quasi? Nisi quaerat, fugit voluptas ducimus facilis impedit quod dicta, laborum sint iure nihil veniam aspernatur delectus officia culpa, at cupiditate? Totam minima ut deleniti laboriosam dolores cumque in, nesciunt optio! Quod recusandae voluptate facere pariatur soluta vel corrupti tenetur aut maiores, cumque mollitia fugiat laudantium error odit voluptas nobis laboriosam quo, rem deleniti? Iste quidem amet perferendis sed iusto tempora modi illo tempore quibusdam laborum? Dicta aliquam libero, facere, maxime corporis qui officiis explicabo aspernatur non consequatur mollitia iure magnam odit enim. Eligendi suscipit, optio officiis repellat eos quis iure? Omnis, error aliquid quibusdam iste amet nihil nisi cumque magni sequi enim illo autem nesciunt optio accusantium animi commodi tenetur neque eum vitae est.",
					56.881856,
					14.762988
					);
			Store s2 = new Store(
					"findphone-karlskrona",
					"MasterPhone",
					"Karlskrona",
					"Sweden",
					"37162",
					"Stationsvägen 29",
					"Lorem ipsum dolor sit amet consectetur adipisicing elit. Perferendis tempora ad cum laudantium, omnis fugit amet iure animi corporis labore repellat magnam perspiciatis explicabo maiores fuga provident a obcaecati tenetur nostrum, quidem quod dignissimos, voluptatem quasi? Nisi quaerat, fugit voluptas ducimus facilis impedit quod dicta, laborum sint iure nihil veniam aspernatur delectus officia culpa, at cupiditate? Totam minima ut deleniti laboriosam dolores cumque in, nesciunt optio! Quod recusandae voluptate facere pariatur soluta vel corrupti tenetur aut maiores, cumque mollitia fugiat laudantium error odit voluptas nobis laboriosam quo, rem deleniti? Iste quidem amet perferendis sed iusto tempora modi illo tempore quibusdam laborum? Dicta aliquam libero, facere, maxime corporis qui officiis explicabo aspernatur non consequatur mollitia iure magnam odit enim. Eligendi suscipit, optio officiis repellat eos quis iure? Omnis, error aliquid quibusdam iste amet nihil nisi cumque magni sequi enim illo autem nesciunt optio accusantium animi commodi tenetur neque eum vitae est.",
					56.196693,
					15.647223
			);
			Store s3 = new Store(
					"findphone-bromma",
					"BrommaSmartPhone",
					"Bromma",
					"Sweden",
					"16867",
					"Ulvsundavägen 189C",
					"Lorem ipsum dolor sit amet consectetur adipisicing elit. Perferendis tempora ad cum laudantium, omnis fugit amet iure animi corporis labore repellat magnam perspiciatis explicabo maiores fuga provident a obcaecati tenetur nostrum, quidem quod dignissimos, voluptatem quasi? Nisi quaerat, fugit voluptas ducimus facilis impedit quod dicta, laborum sint iure nihil veniam aspernatur delectus officia culpa, at cupiditate? Totam minima ut deleniti laboriosam dolores cumque in, nesciunt optio! Quod recusandae voluptate facere pariatur soluta vel corrupti tenetur aut maiores, cumque mollitia fugiat laudantium error odit voluptas nobis laboriosam quo, rem deleniti? Iste quidem amet perferendis sed iusto tempora modi illo tempore quibusdam laborum? Dicta aliquam libero, facere, maxime corporis qui officiis explicabo aspernatur non consequatur mollitia iure magnam odit enim. Eligendi suscipit, optio officiis repellat eos quis iure? Omnis, error aliquid quibusdam iste amet nihil nisi cumque magni sequi enim illo autem nesciunt optio accusantium animi commodi tenetur neque eum vitae est.",
					59.356792,
					17.951399
			);
			Store s4 = new Store(
					"findphone-stockholm",
					"Big City Phone",
					"Stockholm",
					"Sweden",
					"11136",
					"Kungsgatan 12",
					"Lorem ipsum dolor sit amet consectetur adipisicing elit. Perferendis tempora ad cum laudantium, omnis fugit amet iure animi corporis labore repellat magnam perspiciatis explicabo maiores fuga provident a obcaecati tenetur nostrum, quidem quod dignissimos, voluptatem quasi? Nisi quaerat, fugit voluptas ducimus facilis impedit quod dicta, laborum sint iure nihil veniam aspernatur delectus officia culpa, at cupiditate? Totam minima ut deleniti laboriosam dolores cumque in, nesciunt optio! Quod recusandae voluptate facere pariatur soluta vel corrupti tenetur aut maiores, cumque mollitia fugiat laudantium error odit voluptas nobis laboriosam quo, rem deleniti? Iste quidem amet perferendis sed iusto tempora modi illo tempore quibusdam laborum? Dicta aliquam libero, facere, maxime corporis qui officiis explicabo aspernatur non consequatur mollitia iure magnam odit enim. Eligendi suscipit, optio officiis repellat eos quis iure? Omnis, error aliquid quibusdam iste amet nihil nisi cumque magni sequi enim illo autem nesciunt optio accusantium animi commodi tenetur neque eum vitae est.",
					59.336323,
					18.068661
			);
			Store s5 = new Store(
					"findphone-halmstad",
					"Heart X3",
					"Halmstad",
					"Sweden",
					"30241",
					"Kundvägen 13",
					"Lorem ipsum dolor sit amet consectetur adipisicing elit. Perferendis tempora ad cum laudantium, omnis fugit amet iure animi corporis labore repellat magnam perspiciatis explicabo maiores fuga provident a obcaecati tenetur nostrum, quidem quod dignissimos, voluptatem quasi? Nisi quaerat, fugit voluptas ducimus facilis impedit quod dicta, laborum sint iure nihil veniam aspernatur delectus officia culpa, at cupiditate? Totam minima ut deleniti laboriosam dolores cumque in, nesciunt optio! Quod recusandae voluptate facere pariatur soluta vel corrupti tenetur aut maiores, cumque mollitia fugiat laudantium error odit voluptas nobis laboriosam quo, rem deleniti? Iste quidem amet perferendis sed iusto tempora modi illo tempore quibusdam laborum? Dicta aliquam libero, facere, maxime corporis qui officiis explicabo aspernatur non consequatur mollitia iure magnam odit enim. Eligendi suscipit, optio officiis repellat eos quis iure? Omnis, error aliquid quibusdam iste amet nihil nisi cumque magni sequi enim illo autem nesciunt optio accusantium animi commodi tenetur neque eum vitae est.",
					56.680732,
					12.808718
			);

			storeRepository.save(s1);
			storeRepository.save(s2);
			storeRepository.save(s3);
			storeRepository.save(s4);
			storeRepository.save(s5);

			ProductVariant pv1 = new ProductVariant(499.99, p1, st1, c1);
			ProductVariant pv2 = new ProductVariant(599.99, p2, st2, c1);
			ProductVariant pv3 = new ProductVariant(699.99, p3, st3, c2);
			ProductVariant pv4 = new ProductVariant(199.99, p4, st4, c3);
			ProductVariant pv5 = new ProductVariant(899.99, p5, st5, c4);


			//ProductVariant pv1 = new ProductVariant(new ProductVariantIdentity(1L, 6L, 11L), 499.99);
			// pv1.setStorage(st1);
			//productVariantsRepository.save(pv1);

/*
			ProductVariants pv1 = new ProductVariants(1L, 6L, 499.99);
			ProductVariants pv2 = new ProductVariants(1L, 7L, 599.99);
			ProductVariants pv3 = new ProductVariants(1L, 8L, 699.99);
			ProductVariants pv4 = new ProductVariants(1L, 9L,399.99);
			ProductVariants pv5 = new ProductVariants(1L, 10L,199.99);
			pv1.setProducts(p1);
			pv1.setStorage(st1);

			pv2.setProducts(p2);
			pv2.setStorage(st2);

			pv3.setProducts(p3);
			pv3.setStorage(st3);

			pv4.setProducts(p4);
			pv4.setStorage(st4);

			pv5.setProducts(p5);
			pv5.setStorage(st5);



			productVariantsRepository.save(pv1);
			productVariantsRepository.save(pv2);
			productVariantsRepository.save(pv3);
			productVariantsRepository.save(pv4);
			productVariantsRepository.save(pv5);
 */
		};
	}
}
