//to introduce JSON bcz this cannot understand json
declare module ".json" {
    const value: any;
    export default value;
}