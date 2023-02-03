let search = document.getElementById("search-btn");

search.addEventListener("click", ()=>{
    document.querySelector(".search-form").classList.toggle("show-search");
    document.querySelector(".navbar").classList.remove("show-menu");
});

let menu = document.querySelector("#menu-btn");
menu.addEventListener("click", ()=>{
    document.querySelector(".navbar").classList.toggle("show-menu");
    document.querySelector(".search-form").classList.remove("show-search")
    // document.querySelector("#body").classList.toggle("blur");
    
})
window.onscroll = () =>{
    document.querySelector(".navbar").classList.remove("show-menu");
    document.querySelector(".search-form").classList.remove("show-search")

}