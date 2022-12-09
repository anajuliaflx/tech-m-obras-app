import NewFormDetails from "../src/components/FormDetails";
import Nav from "../src/components/Nav";
import Footer from "../src/components/patterns/Footer";
import HeadComponent from "../src/components/patterns/Head";
import styles from '../styles/Home.module.css'

export default function Newdetails() {
  return (
    <div >
      <HeadComponent />
      <Nav />
      <NewFormDetails />
      <Footer style={styles.footer} />
    </div>
  )
}