// // document.getElementById("scrollUp").classList.add("hide")
// // getYposition = () => {
// //     var top = window.pageYOffset || document.documentElement.scrollTop
// //     return top;
// // };

// // document.addEventListener('scroll', () => {
// //     var scroll = getYposition();
// //     var arrow = document.getElementById('scrollUp');
// //     scroll = () => {
// //         window.scroll({
// //             top: 0,
// //             left: 0,
// //             behavior: 'smooth'

// //         });
// //     }
// // })
// // let myButton = document.getElementById("scrollUp");
// // document.onScroll = function () {
// //     scrollFunction()
// // };

// // function scrollFunction() {
// //     if (document.body.scrollTop > 2 || document.documentElement.scrollTop > 2) {
// //         myButton.style.display = "block";
// //     } else {
// //         myButton.style.display = "none";
// //     }
// // }

// // function topFunction() {
// //     document.body.scrollTop = 100;
// //     document.documentElement.scrollTop = 100;
// // }


// // let contacts = new Map()
// // contacts.set('india', '+918888888888')
// // contacts.set('usa', '+18888888888')
// // contacts.set('canada', '+198888888888')
// // contacts.set('uae', '+97888888888')

// // contacts. get (india)
// // document.getElementById("select1").addEventListener('change', () => {
// //     let country = document.getElementById('select1').value;
// //     document.getElementById('contact').innerHTML = contacts.get(country);
// //     document.getElementById('flag').src = `image.png`;
// // })

// // $('.countrypicker').countrypicker();

// // let productsListUrl = `products.json`;
// // async function loadProducts(productsListUrl) {
// //     fetch(productsListUrl)
// //         .then(response => response.json())
// //         .then(data => {
// //             const products = data.Products;
// //             document.querySelectorAll('#top-navigation')

// //             let cards = '';
// //             products.forEach(product => {
// //                 let isNewDiv = '';
// //                 if (product.isNew === 'TRUE') {
// //                     isNewDiv = `<div class="new-product">
// // <span>New</span>
// // </div>`;
// //                 }
// //                 let stars = '';
// //                 const ratings = Math.floor(+product.ratings);
// //                 for (let i = 1; i <= 5; i++) {
// //                     if (i <= ratings) {
// //                         stars = stars + '<i class="fa fa-star checked"></i>';
// //                     } else {
// //                         stars = stars + '<i class="fa fa-star-o"></i>';
// //                     }
// //                 }
// //                 cards = cards +
// //                     `<div class="col-xl-4 col-lg-4 col-md-6">
// // <div class="single-product" id="${product.id}">
// // <div class="product-img">
// // <img src="images/${product.imageName}.png"
// // alt="">
// // <div class="product-hover">
// // <div class="container">
// // <div class="row">
// // <div class="col-4">
// // <div class="product-icon
// // product-cart-icon"></div>
// // </div>
// // <div class="col-4">
// // <div class="product-icon
// // product-view-icon"></div>
// // </div>
// // <div class="col-4">
// // <div class="product-icon
// // product-wishlist-icon"></div>
// // </div>
// // </div>
// // </div>
// // </div>
// // ${isNewDiv}
// // </div>
// // <div class="product-caption">
// // <div class="product-rating">
// // ${stars}
// // </div>
// // <h4><a href="#">${product.name}</a></h4>
// // <div class="price">
// // <ul>
// // <li>$${product.priceAfterDiscount}
// // </li>
// // <li
// // class="discount">$${product.price}</li>
// // </ul>
// // </div>
// // </div>
// // </div>
// // </div>`;
// //             });
// //             document.querySelector('#productsListArea').innerHTML = cards;
// //         });
// // }
// // loadProducts(productsListUrl);

// // function getData(){
// //     url = "answer.txt";
// //     fetch(url).then((response)=>{
// //         return response.text();
// //     }).then((data)=>{
// //         console.log(data);

// //     })
// // }
// // getData()

// // let productsListUrl = "products.json";
// // async function loadProducts(productsListUrl){
// //     fetch("products.json")
// //     .then(response => response.json())
// //     .then(json => {productsList= json })
// // }
// // const productsList = loadProducts(productsListUrl);
// var productsListUrl = "products.json";
// var productsList;
// let htmlToReturn;
// async function loadProducts(_productsListUrl) {
//     fetch("products.json")
//         .then(response => response.json())
//         .then((json) => {
//             productsList = json;
//             productsList.Products.forEach((product) => {
//                 console.log(product.id);

//                 htmlToReturn = '<div class="filterDiv latest">' +
//                     '     <div class="img-6" id="product' + product.id + '">' +
//                     '         <a href="product.html"><img src="All Image/imp-' + product.id + '.jpg "></a>' +
//                     '         <div class="icon">' +
//                     '             <i class="fa fa-eye"></i>' +
//                     '             <i class="fa fa-heart"></i>' +
//                     '             <button class="btn-1">Best Deal</button>' +
//                     '             <div class="ratings">' +
//                     '                 <i class="fa fa-star-o" aria-hidden="true"></i>' +
//                     '                 <i class="fa fa-star-o" aria-hidden="true"></i>' +
//                     '                 <i class="fa fa-star-o" aria-hidden="true"></i>' +
//                     '                 <i class="fa fa-star-o" aria-hidden="true"></i>' +
//                     '                 <i class="fa-regular fa-star"></i>' +
//                     '             </div>' +
//                     '             <h4><a href="#">' + product.name + '</a></h4>' +
//                     '             <div class="price">' +
//                     '              <ul>' +
//                     '             <li>' + product.priceAfterdiscount + '</li>' +
//                     '             <li class="discount">' + product.price + '</li>' +
//                     '             </ul>' +
//                     '             </div>' +
//                     '         </div>' +
//                     '     </div>' +
//                     ' </div>';
//                 document.querySelector('#productListArea').innerHTML += htmlToReturn;
//             })
//         })
// }

// loadProducts(productsListUrl);

// function EventListener() {
//     document.querySelector('btn-5').addEventListener('click', () => {
//         cartContainer.classList.toggle('show-cart-container');
//     })
    
// }
// function myFunction() {
//     const list = document.getElementById("productListArea").classList;
//     list.add("filterDiv latest");
//   }
// myFunction();

